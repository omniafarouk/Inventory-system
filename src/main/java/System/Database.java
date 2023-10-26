
package System;
 
import Admin.EmployeeUser; 
import Product.customerProduct; 
import Product.Product; 
import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.time.LocalDate; 
import java.util.ArrayList; 
 
public class Database
{
    private String filename; 
    private ArrayList records; 
    private String role; 
    public Database(String filename,String role){ 
         
        this.filename = filename; 
        this.role = role; 
    } 
     
    public void setRecords(ArrayList records){ 
        this.records = records; 
    } 
     
    public void saveToFile(ArrayList records){ 
          try {       
                BufferedWriter writer = new BufferedWriter (new FileWriter(filename)); 
                switch(role){ 
                case "Admin" ->  { loopEmployeeThroughList(records, writer); }
                case "Product" -> { loopThroughProductList(records,writer); }
                case"Customer" ->  { loopThroughCustomerList(records,writer); }
                } 
                 
                writer.close(); 
          } catch (IOException ex) {     
             
              System.out.println("An error occurred!"); 
            } 
} 
 
    private void loopEmployeeThroughList(ArrayList<EmployeeUser> records, BufferedWriter writer) throws IOException { 
             
            for (EmployeeUser record : records) { 
                        writer.write(record.lineRepresentation() + "\n"); 
     } 
    } 
     
    private void loopThroughProductList(ArrayList<Product> records, BufferedWriter writer) throws IOException { 
 
            for (Product record : records) { 
                        writer.write(record.lineRepresentation() + "\n"); 
    }} 
    
    private void loopThroughCustomerList(ArrayList<customerProduct> records, BufferedWriter writer) throws IOException { 
 
            for (customerProduct record : records) { 
                        writer.write(record.lineRepresentation() + "\n"); 
    } 
} 
    public void readFromFile(){ 
        BufferedReader reader; 
        try { 
            reader = new BufferedReader(new FileReader(filename)); 
            String line; 
             
            while((line = reader.readLine())!=null) 
                {   
                    System.out.println("new"); 
                    System.out.println(line); 
                    switch(this.role){ 
                    case "Admin" ->  {records.add( createEmployeeRecordFrom(line) ); }
                    case "Product" -> {records.add(createProductRecordFrom(line)); }
                    case"Customer" -> {records.add(createCustomerRecordFrom(line)); } 
                    } 
                }     
                reader.close(); 
        }catch (IOException ex) {                                          
          
                System.out.println("An error occurred!"); 
        } 
         
} 
     
    public EmployeeUser createEmployeeRecordFrom(String line){ 
      
        //System.out.println("Create record from method called!"); 
        String[] lineData = line.split(","); 
        return new EmployeeUser (lineData[0], lineData[1], lineData[2], lineData[3], lineData[4]); 
         
    } 
    public Product createProductRecordFrom(String line){ 
      
        //System.out.println("Create record from method called!"); 
        String[] lineData = line.split(","); 
        return new Product(lineData[0], lineData[1], lineData[2], lineData[3], Integer.parseInt(lineData[4]), Float.parseFloat(lineData[5])); 
    } 
    public customerProduct createCustomerRecordFrom (String line){ 
        String[] lineData = line.split(","); 
        return new customerProduct (lineData[0], lineData[1], LocalDate.parse(lineData[2])); 
    } 
}