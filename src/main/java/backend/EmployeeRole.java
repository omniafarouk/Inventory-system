package backend;
import constants.FileNames;
import java.time.*;
import java.time.temporal.*;

public class EmployeeRole implements FileNames{
    
    public  ProductDatabase productDatabase;
    public  CustomerProductDatabase customerProductDatabase;   
    
    public EmployeeRole(){
        
        productDatabase = new ProductDatabase(FileNames.PRODUCT_FILENAME);
        productDatabase.readFromFile();
        customerProductDatabase = new CustomerProductDatabase(FileNames.CUSTOMERPRODUCT_FILENAME);
        customerProductDatabase.readFromFile();
        
    }
    
    public void addProduct(String productID, String productName,
           String manufacturerName, String supplierName, int quantity,float price)
   {     
         if(productDatabase.contains(productID)){      
            System.out.println("Can't add this product! Product with with id: "+ productID + " already exists.");
        }
        else   {
       
        Product product= new Product(productID , productName ,manufacturerName
                       ,supplierName, quantity , price);
                productDatabase.insertRecord(product);
         }
       
   }
    
    public Product[] getListOfProducts(){

        Account[] listOfProducts = new Product[ productDatabase.returnAllRecords().size()];
        listOfProducts = productDatabase.returnAllRecords().toArray(listOfProducts);
        
        return (Product[])listOfProducts;
    }
    
     public CustomerProduct[] getListOfPurchasingOperations(){

        Account[] listOfPurchasingOperations = new CustomerProduct[ customerProductDatabase.returnAllRecords().size()];
        listOfPurchasingOperations = customerProductDatabase.returnAllRecords().toArray(listOfPurchasingOperations);
        
        return (CustomerProduct[])listOfPurchasingOperations;
    }
     
    public boolean purchaseProduct(String customerSSN, String productID, LocalDate purchaseDate)
    {   
        
        if(productDatabase.contains(productID)){
            
            if(((Product)productDatabase.getRecord(productID)).getQuantity() <= 0){
                System.out.println("Quantity is soldout");
                return false;
            }
            else{
                CustomerProduct[] CustomersData = this.getListOfPurchasingOperations();
                
                for (CustomerProduct CustomerData : CustomersData) {        
                    if(CustomerData.getCustomerSSN().equals(customerSSN) && CustomerData.getPurchaseDate().equals(purchaseDate) )
                    {
                        System.out.println("purchase operation rejected!!");
                        return false;
                    }
                }
                
                // purchase the product
                Product product = (Product) productDatabase.getRecord(productID);
                int quantity = product.getQuantity();
                product.setQuantity(quantity - 1);
                //productDatabase.saveToFile();
                
                 //------>saving operation
                CustomerProduct newCustomerProduct = new CustomerProduct(customerSSN, productID, purchaseDate);
                customerProductDatabase.insertRecord((Account)newCustomerProduct);
                
                //customerProductDatabase.saveToFile();
               
                System.out.println("product purchased successfully!!");
                return true;
                
            }
            
        }
        else{
            
            System.out.println("Product Inavaliable!");
        }
        return false; 
    }
  public double returnProduct(String customerSSN, String productID, LocalDate purchaseDate ,LocalDate returnDate)
      {
          {       
                  if( returnDate.isBefore(purchaseDate) )
                  {
                      System.out.println("product unavalibale"); 
                      return -1;
                  }
                  else if (!productDatabase.contains(productID) )
                  {
                      System.out.println("product unavalibale");
                      return -1;
                  }
                      
                  else if (!customerProductDatabase.contains(customerSSN+","+productID+","+purchaseDate))
                  {
                      System.out.println("customer hasn't purchased the item before");
                     return -1;
                   } 
                 else if( purchaseDate.until(returnDate,ChronoUnit.DAYS) > 14)
                  {
                      System.out.println("return date exceeded 14 days");
                      return -1;
                  }
                  else{
            Product product = (Product) productDatabase.getRecord(productID);          
            int quantity = product.getQuantity();
            product.setQuantity(quantity + 1);                
              //productDatabase.saveToFile();    
              customerProductDatabase.deleteRecord(customerSSN+","+productID+","+purchaseDate);
                      System.out.println("product deleted successfully");
              return (double) product.getPrice();       
                  }
          }
    }
    public void logout(){
        
        productDatabase.saveToFile();
        customerProductDatabase.saveToFile();
        
        }
}
