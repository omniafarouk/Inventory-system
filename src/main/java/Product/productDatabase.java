
package Product;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;*/
import java.io.*;
import java.util.ArrayList;

public class productDatabase {
    
    private ArrayList<Product> records;
    private String filename;

    public productDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<> ();
    }
    
    public void readFromFile(){
                
         BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            
            while((line = reader.readLine())!=null)
                {   System.out.println("new");
                    System.out.println(line);
                    records.add(createRecordFrom(line) );
                    
                }    
                reader.close();
        }catch (IOException ex) {

                System.out.println("An error occurred!");
        }
    }
    
    public Product createRecordFrom(String line){
        
        //System.out.println("Create record from method called!");
        String[] lineData = line.split(",");
        return new Product( lineData[0], lineData[1], lineData[2],lineData[3] ,Integer.parseInt(lineData[4]),
                Float.parseFloat(lineData[5]));
        
    }
    
    public ArrayList<Product> returnAllRecords(){
        return records;
    }
   
    public boolean contains (String key){
        
        return getRecord(key) != null;
    }
    
    public Product getRecord (String key){
        
        for(int i = 0 ; i < records.size() ; i++){
            
            Product product = records.get(i);
            if(product.getSearchKey().equals(key))
            {    return product;  } 
        }
        return null;
    }
    
    public void insertRecord (Product record){
        records.add(record);
    }
    
    public void deleteRecord (String key){
        
        if(this.contains(key)){
         
            records.remove(getRecord(key));
        }
        else{
            System.out.println("Can't delete product whose id = " + key);     
        }
    }
    
    public void saveToFile(){
        try {      
                BufferedWriter writer = new BufferedWriter (new FileWriter(filename));
                for (Product record: this.records) {
                    writer.write(record.lineRepresentation() + "\n");
            }
                writer.close();
          } catch (IOException ex) {    
            System.out.println("An error occurred!");
       }
    }
    
}
