
package Product;
import System.*;
import java.time.*;
import java.time.temporal.*;
public class EmployeeRole {
    
    public productDatabase productData;
    public customerProductDatabase customerProductData;          
    
     public EmployeeRole(){
        
        productData = new productDatabase("Products.txt");
        productData.readFromFile();
        customerProductData = new customerProductDatabase("CustomerProducts.txt");
        customerProductData.readFromFile();
        
    }
    public void addProduct(String productID, String productName,
           String manufacturerName, String supplierName, int quantity,float price)
   {     
         if(productData.contains(productID)){      
            System.out.println("Can't add this product! Product with with id: "+ productID + " already exists.");
        }
        else   {
       
        Product product= new Product(productID , productName ,manufacturerName
                       ,supplierName, quantity , price);
                productData.insertRecord(product);
         }
       
   }
    public Product[] getListOfProducts(){

        Product[] listOfProducts = new Product[ productData.returnAllRecords().size()];
        listOfProducts = (Product[]) productData.returnAllRecords().toArray(listOfProducts);
        
        return listOfProducts;
    }
     public customerProduct[] getListOfPurchasingOperations(){

        customerProduct[] listOfPurchasingOperations = new customerProduct[ customerProductData.returnAllRecords().size()];
        listOfPurchasingOperations = (customerProduct[]) customerProductData.returnAllRecords().toArray(listOfPurchasingOperations);
        
        return listOfPurchasingOperations;
    }
    public boolean purchaseProduct(String customerSSN, String productID, LocalDate purchaseDate)
    {   
        
        if(productData.contains(productID)){
            Product currentProduct =(Product) productData.getRecord(productID);
            if(currentProduct.getQuantity() <= 0){
                System.out.println("Quantity is soldout");
                return false;
            }
            else{
                customerProduct[] CustomersData = this.getListOfPurchasingOperations();
                
                for (customerProduct CustomerData : CustomersData) {        
                    if(CustomerData.getCustomerSSN().equals(customerSSN) && CustomerData.getPurchaseDate().equals(purchaseDate) )
                    {
                        System.out.println("purchase operation rejected!!");
                        return false;
                    }
                }
                
                // purchase the product
                Product product = (Product)productData.getRecord(productID);
                int quantity = product.getQuantity();
                product.setQuantity(quantity - 1);
                //productDatabase.saveToFile();
                
                 //------>saving operation
                customerProduct newCustomerProduct = new customerProduct(customerSSN, productID, purchaseDate);
                customerProductData.insertRecord(newCustomerProduct);
                
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
                  if( returnDate.isBefore(purchaseDate) )
                  {
                      System.out.println("product unavalibale"); 
                      return -1;
                  }
                  else if (!productData.contains(productID) )
                  {
                      System.out.println("product unavalibale");
                      return -1;
                  }
                      
                  else if (!customerProductData.contains(customerSSN+","+productID+","+purchaseDate))
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
            Product product = (Product)productData.getRecord(productID);          
            int quantity = product.getQuantity();
            product.setQuantity(quantity + 1);                
              //productDatabase.saveToFile();    
              customerProductData.deleteRecord(customerSSN+","+productID+","+purchaseDate);
                      System.out.println("product deleted successfully");
              return (double) product.getPrice();       
                  }
          }
    public void logout(){
        
            productData.saveToFile();
            customerProductData.saveToFile();
      }
 }
