
package Product;
//import java.util.*;
import java.time.*;

public class customerProduct {
    
    private String customerSSN , productID;
    private LocalDate purchaseDate;
    
    public customerProduct(String customerSSN, String productID, LocalDate purchaseDate)
    {
        this.customerSSN=customerSSN;  // lw elcustomer a4tra abl kda mi4tri4 tani , ezai??
        this.productID=productID;
        this.purchaseDate=purchaseDate;  //any validations??
    }
    public String getCustomerSSN()
    {
        return this.customerSSN;
    }
    public String getProductID()
    {
        return this.productID;
    }
    public LocalDate getPurchaseDate()
    {
        return this.purchaseDate;
    }
    public String lineRepresentation(){  
        return (this.customerSSN + "," + this.productID + "," + 
                this.purchaseDate );
    }
    public String getSearchKey(){          //make sure
        return this.productID;
    }
}
    
