package backend;
 
import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.ArrayList;
 
abstract class Database
{
    private final String filename; 
    private ArrayList<Account> records;  
    
    public Database(String filename){ 
         
        this.filename = filename; 
    } 
     
    public abstract void readFromFile(); 
     
    public ArrayList<Account> returnAllRecords()
    {
        return this.records;
    }
    
    public void setRecords(ArrayList<Account> records){ 
        this.records = records; 
    } 
    
    public void saveToFile(){ 
          try {       
                BufferedWriter writer = new BufferedWriter (new FileWriter(filename));
              for (Account record : records) {
                  writer.write(record.lineRepresentation() + "\n");
              }
                
                writer.close(); 
          } catch (IOException ex) {     
             
              System.out.println("An error occurred!"); 
            } 
}    
        
    public Account getRecord (String key){       
        
        for(int i = 0 ; i < records.size() ; i++){
            
            Account account = records.get(i);
            if(account.getSearchKey().equals(key))
            {    return account;  } 
        }
        return null;
    }
    public boolean contains (String key){
        
        return getRecord(key) != null;
    }
    /* public String[] createRecordFrom(String line)
    {
        String[] lineData = line.split(","); 
        return lineData;
    }*/
    public void insertRecord (Account record){
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
    public abstract Account createRecordFrom(String line);
}