package backend;
import java.time.*;
import java.time.format.DateTimeFormatter;

    public class CustomerProduct implements Account{
    
    private String customerSSN , productID;
    private LocalDate purchaseDate;
    
    public CustomerProduct(String customerSSN, String productID, LocalDate purchaseDate)
    {
        this.customerSSN = customerSSN;  
        this.productID = productID;
        this.purchaseDate = purchaseDate;  
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
    @Override
    public String lineRepresentation(){  
       DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = this.purchaseDate.format(outputFormatter);
        return (this.customerSSN + "," + this.productID + "," +formattedDate );
    }
    
    @Override
    public String getSearchKey(){          
        return (this.customerSSN + "," + this.productID + "," + 
                this.purchaseDate);             
    }
}
    
