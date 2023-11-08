package backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class CustomerProductDatabase extends Database {

    private ArrayList<Account> records;
    private String filename;

    public CustomerProductDatabase(String filename) {
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
                    records.add((CustomerProduct) this.createRecordFrom(line));
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
        String dateString = lineData[2];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println(date);
        return new CustomerProduct( lineData[0], lineData[1], date);
    }
    
//    public ArrayList<Account> returnAllRecords(){
//        return records;
//    }
   
//    @Override
//    public boolean contains (String key){
//
//        return getRecord(key) != null;
//        
//    }
    
//    public CustomerProduct getRecord (String key){
//       
//        for(int i = 0 ; i < records.size() ; i++){   
//            CustomerProduct purschasedProduct = records.get(i);
//            if(purschasedProduct.getSearchKey().equals(key))
//            {    return purschasedProduct;  } 
//        }
//        return null;
//    }
    
//    @Override
//    public void insertRecord (CustomerProduct record){
//        super.insertRecord(record);
//    }
//    @Override
//    public void saveToFile(){
//        super.saveToFile();
//    }

//    @Override
//    public void deleteRecord(String key) {
//        
//        if(this.contains(key)){
//         
//            records.remove(getRecord(key));
//        }
//        else{
//            System.out.println("Can't delete the purchaseed product by the customer: " + key);     
//        }
//    }
  
}
