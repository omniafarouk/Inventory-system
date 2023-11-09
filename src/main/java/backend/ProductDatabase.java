package backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class ProductDatabase extends Database{
    
    private ArrayList<Account> records;
    private String filename;

    public ProductDatabase(String filename) {
        super(filename);
        this.filename = filename;
        this.records = new ArrayList<> ();
        super.setRecords(records);
    }
    
    @Override
    public void readFromFile(){
                
                     BufferedReader reader; 
        try {
            reader = new BufferedReader(new FileReader(filename)); 
            String line; 
             
            while((line = reader.readLine())!=null) 
                {   
                    System.out.println(line); 
                    records.add((Product) this.createRecordFrom(line));
                }
                reader.close(); 
        }catch (IOException ex) {                                          
          
                System.out.println("An error occurred!"); 
        }   
    }
    
    @Override
    public Account createRecordFrom(String line){
        
       //System.out.println("Create record from method called!");
        String[] lineData = line.split(",");
        Account account = new Product( lineData[0], lineData[1], lineData[2],lineData[3] ,Integer.parseInt(lineData[4]),
                Float.parseFloat(lineData[5]));
        return account;
        
    }
    
}
