
package Product;
import System.Account;

public class Product implements Account {
    
    private String productName , productID , manufacturerName , supplierName;
    private int quantity;
    private float price;
    
  public Product(String productID, String productName
          , String manufacturerName, String supplierName, int quantity, float price)
  {   
      this.productID=productID; // need validation for the id product to be different !!
      this.productName=productName;
      this.manufacturerName= manufacturerName;
      this.supplierName=supplierName;
      if( price < 0 )
      { System.out.println("product entered is negative number, it is set by default to zero");
        this.price=0;
      }
      else 
           this.price=price; 
      if(quantity < 0 )
      {
          System.out.println("quantity is entered negative number , it is set by default to zero");
          this.quantity=0;
      }
      else
          this.quantity=quantity;
  }
  
    public int getQuantity()
     {
      return this.quantity;
     }
    
    public void setQuantity(int quantity){
         if(quantity < 0 ){
          System.out.println("Product's quantity is invalid! It is set by default to zero.");
          this.quantity = 0;
      }
      else{
         this.quantity = quantity;}
    }
    public float getPrice()
    {
        return this.price;
    }
    @Override
     public String lineRepresentation(){  
        return (this.productID + "," + this.productName + "," + 
                this.manufacturerName + "," + this.supplierName +
                "," + this.quantity + "," +this.price);
    }
   
    @Override
    public String getSearchKey(){
        return this.productID;
    }
}
