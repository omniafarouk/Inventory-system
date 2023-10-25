package Admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeUserDatabase {
    
    private ArrayList<EmployeeUser> records;
    private String filename;

    public EmployeeUserDatabase(String filename) {
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
                    records.add( createRecordFrom(line) );
                    
                }    
                reader.close();
        }catch (IOException ex) {

                System.out.println("An error occurred!");
        }
    }
    
    public EmployeeUser createRecordFrom(String line){
        
        //System.out.println("Create record from method called!");
        String[] lineData = line.split(",");
        return new EmployeeUser (lineData[0], lineData[1], lineData[2], lineData[3], lineData[4]);
        
    }
    
    public ArrayList<EmployeeUser> returnAllRecords(){
        return records;
    }
   
    public boolean contains (String key){
        
        return getRecord(key) != null;
    }
    
    public EmployeeUser getRecord (String key){
        
        for(int i = 0 ; i < records.size() ; i++){
            
            EmployeeUser employee = records.get(i);
            if(employee.getSearchKey().equals(key))
            {    return employee;  } 
        }
        return null;
    }
    
    public void insertRecord (EmployeeUser record){
        records.add(record);
    }
    
    public void deleteRecord (String key){
        
        if(this.contains(key)){
         
            records.remove(getRecord(key));
        }
        else{
            System.out.println("Can't delete employee whose id = " + key);     
        }
    }
    
    public void saveToFile(){
        try {      
                BufferedWriter writer = new BufferedWriter (new FileWriter(filename));
                for (EmployeeUser record : this.records) {
                    writer.write(record.lineRepresentation() + "\n");
            }
                writer.close();
          } catch (IOException ex) {    
            System.out.println("An error occurred!");
       }
    }
    
}
