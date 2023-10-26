
package Product;
import java.time.*;
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
     return false;   //lsa di
    }
    
    public void logout(){
        productData.saveToFile();
        customerProductData.saveToFile();
    }
    
}
