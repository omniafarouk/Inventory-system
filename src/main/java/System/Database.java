
package System;
 
import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.ArrayList;
 
public abstract class Database<T extends Account>
{
    private final String filename; 
    private ArrayList<T> records;  
    
    public Database(String filename){ 
         
        this.filename = filename; 
    } 
     
        public void readFromFile() {
             BufferedReader reader; 
        try {
            reader = new BufferedReader(new FileReader(filename)); 
            String line; 
             
            while((line = reader.readLine())!=null) 
                {   
                    System.out.println(line); 
                    records.add(this.createRecordFrom(line));
                }
                reader.close(); 
        }catch (IOException ex) {                                          
          
                System.out.println("An error occurred!"); 
        }    }
    

     
    public ArrayList<T> returnAllRecords()
    {
        return this.records;
    }
    
    public void setRecords(ArrayList<T> records){ 
        this.records = records; 
    } 
    
    public void saveToFile(){ 
          try {       
                BufferedWriter writer = new BufferedWriter (new FileWriter(filename));
              for (T record : records) {
                  writer.write(record.lineRepresentation() + "\n");
              }
                
                writer.close(); 
          } catch (IOException ex) {     
             
              System.out.println("An error occurred!"); 
            } 
}    
        
    public T getRecord (String key){           
        
        for(int i = 0 ; i < records.size() ; i++){
            
            T account = records.get(i);
            if(account.getSearchKey().equals(key))
            {    return account;  } 
        }
        return null;
    }
    public boolean contains (String key){
        
        return getRecord(key) != null;
    }

    public void insertRecord (T record){
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
    public abstract T createRecordFrom(String line);
}