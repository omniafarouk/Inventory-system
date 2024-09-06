
package Product;
import System.*;
/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;*/
import java.io.*;
import java.util.ArrayList;

public class productDatabase extends Database<Product>{
    
    private ArrayList<Product> records;
    private String filename;

    public productDatabase(String filename) 
    {
        super(filename);
        this.filename = filename;
        this.records = new ArrayList<> ();
        super.setRecords(records);
       
    } 
    @Override
    public Product createRecordFrom(String line)
    {
        //System.out.println("Create record from method called!");
        String[] lineData = line.split(",");
       return new Product( lineData[0], lineData[1], lineData[2],lineData[3] ,Integer.parseInt(lineData[4]),
                Float.parseFloat(lineData[5]));
        
    }
    
    
    
}
