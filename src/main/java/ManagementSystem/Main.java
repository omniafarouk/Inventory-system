package ManagementSystem;
public class Main {

    public static void main(String[] args) {/*
        customerProductDatabase p= new customerProductDatabase("customerProduct.txt");
        String line="7845345678,P0000,9-02-2020";
        customerProduct cp=p.createRecordFrom(line);
        productDatabase pd= new productDatabase("product.txt");
        EmployeeRole ER= new EmployeeRole();
        ER.customerProductData=p;
        ER.productData=pd;
        ER.customerProductData.readFromFile();
        ER.productData.readFromFile();
        //p.insertRecord(cp);
        System.out.println(ER.purchaseProduct(cp.getCustomerSSN(), cp.getProductID(), cp.getPurchaseDate()));
        //System.out.println(ER.returnProduct(cp.getCustomerSSN(), cp.getProductID(), cp.getPurchaseDate(), cp.getPurchaseDate()));
        ER.logout();
        System.out.println("dn2");
        
        System.out.println("-------------------------------------------");*/
        TestClass c=new TestClass();
        c.testAdminRole();
        c.testEmployeeRole();
       
    }
}
