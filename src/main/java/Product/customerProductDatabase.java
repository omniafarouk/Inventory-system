
package Product;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;*/
import java.io.*;
import java.util.ArrayList;
import java.time.*;
import java.time.format.*;

public class customerProductDatabase {

    private ArrayList<customerProduct> records;
    private String filename;

    public customerProductDatabase(String filename) {
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
    
    public customerProduct createRecordFrom(String line){
        
        //System.out.println("Create record from method called!");
        String[] lineData = line.split(",");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-MMM-YYYY");
        return new customerProduct( lineData[0], lineData[1], LocalDate.parse( lineData[2] , formatter) );
        
    }
    
    public ArrayList< customerProduct > returnAllRecords(){
        return records;
    }
   
    public boolean contains (String key){
        
        return getRecord(key) != null;
    }
    
    public customerProduct getRecord (String key){
        
        for(int i = 0 ; i < records.size() ; i++){
            
            customerProduct purschasedProduct = records.get(i);
            if(purschasedProduct.getSearchKey().equals(key))
            {    return purschasedProduct;  } 
        }
        return null;
    }
    
    public void insertRecord (customerProduct record){
        records.add(record);
    }
    
    public void deleteRecord (String key){
        
        if(this.contains(key)){
         
            records.remove(getRecord(key));
        }
        else{
            System.out.println("Can't delete the purchased product whose of= " + key);     
        }
    }
    
    public void saveToFile(){
        try {      
                BufferedWriter writer = new BufferedWriter (new FileWriter(filename));
                for (customerProduct record: this.records) {
                    writer.write(record.lineRepresentation() + "\n");
            }
                writer.close();
          } catch (IOException ex) {    
            System.out.println("An error occurred!");
       }
    }
    
}
