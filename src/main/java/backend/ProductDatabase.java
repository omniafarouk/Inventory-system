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
    
//    public ArrayList<Product> returnAllRecords(){
//        return records;
//    }
//   
//    @Override
//    public boolean contains (String key){
//        
//        return getRecord(key) != null;
//    }
//    
//    public Product getRecord (String key){
//        
//        for(int i = 0 ; i < records.size() ; i++){
//            
//            Product product = records.get(i);
//            if(product.getSearchKey().equals(key))
//            {    return product;  } 
//        }
//        return null;
//    }
//    
//    @Override
//    public void insertRecord (Product record){
//        super.insertRecord(record);
//    }
//    
//    @Override
//    public void deleteRecord (String key){
//        
//        if(this.contains(key)){
//         
//            records.remove(getRecord(key));
//        }
//        else{
//            System.out.println("Can't delete product whose id = " + key);     
//        }
//    }
//    
//    @Override
//    public void saveToFile(){
//                super.saveToFile();
//    }
    
}
