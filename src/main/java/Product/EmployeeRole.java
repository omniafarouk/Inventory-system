
package Product;
import java.time.*;
import java.time.temporal.*;
public class EmployeeRole {
    
    productDatabase productData;
    customerProductDatabase customerProductData;          //constructor set  by default
    
    public void addProduct(String productID, String productName,
           String manufacturerName, String supplierName, int quantity,float price)
   {
       Product product= new Product(productID , productName ,manufacturerName
                       ,supplierName, quantity , price);
       productData.insertRecord(product);
       
   }
    public Product[] getListOfProducts(){

        Product[] listOfProducts = new Product[ productData.returnAllRecords().size()];
        listOfProducts = productData.returnAllRecords().toArray(listOfProducts);
        
        return listOfProducts;
    }
     public customerProduct[] getListOfPurchasingOperations(){

        customerProduct[] listOfPurchasingOperations = new customerProduct[ customerProductData.returnAllRecords().size()];
        listOfPurchasingOperations = customerProductData.returnAllRecords().toArray(listOfPurchasingOperations);
        
        return listOfPurchasingOperations;
    }
    public boolean purchaseProduct(String customerSSN, String productID, LocalDate purchaseDate)
    {
        Product[] listOfProducts= this.getListOfProducts();
        if(!productData.contains(productID))
            return false;
        for (Product listOfProduct : listOfProducts) {
            if (productID.equals(listOfProduct.getSearchKey()))
            {
                 if ( listOfProduct.getQuantity() > 0 ) 
                 {
                    //saving operation
                    customerProduct customer=new customerProduct(customerSSN,productID,purchaseDate);
                    customerProductData.insertRecord(customer);
                    customerProductData.saveToFile();
                    //changing product quantity
                    Product product = productData.getRecord(productID);
                    String productDataString = product.lineRepresentation();
                    String[] lineData= productDataString.split(",");
                    Product modifiedProduct = new Product( lineData[0], lineData[1], lineData[2],
                                                 lineData[3] ,(Integer.parseInt(lineData[4])-1),
                                                    Float.parseFloat(lineData[5]));
                    productData.deleteRecord(productID);
                    productData.insertRecord(modifiedProduct);
                    productData.saveToFile();
                    return true;
                }
            }
        } 
        System.out.println("quantity is soldout");
        return false;
    }
    public double returnProduct(String customerSSN, String productID, LocalDate purchaseDate ,LocalDate returnDate)
      {
       customerProduct[] listOfPurchasingOperations= this.getListOfPurchasingOperations();
       customerProduct returnedProduct= new customerProduct(customerSSN , productID , purchaseDate);
        if( returnDate.isBefore(purchaseDate)) 
            return -1;
        else if(!productData.contains(productID))
            return -1;
        else if (returnDate.until(purchaseDate, ChronoUnit.DAYS) > 14)
            return -1;
        else
        {
           for (customerProduct listOfPurchasingOperation : listOfPurchasingOperations) {
               if (!listOfPurchasingOperation.equals(returnedProduct)) {
                   return -1;
               }
           }
        }
        Product product = productData.getRecord(productID);
        String productDataString = product.lineRepresentation();
        String[] lineData= productDataString.split(",");
        Product modifiedProduct = new Product( lineData[0], lineData[1], lineData[2],
                                                 lineData[3] ,(Integer.parseInt(lineData[4])+1),
                                                    Float.parseFloat(lineData[5]));
       customerProductData.deleteRecord(productID);  //kda 7ims7 kol ele4tro rlproduct??
       productData.deleteRecord(productID);
       productData.insertRecord(modifiedProduct);
       productData.saveToFile();
       return Double.parseDouble(lineData[5]);
            
      }
    public void logout(){
             productData.saveToFile();
             customerProductData.saveToFile();
      }
    
}
