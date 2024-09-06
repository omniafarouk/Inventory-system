
package Product;
import System.*;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;*/
import java.io.*;
import java.util.ArrayList;
import java.time.*;
import java.time.format.*;

public class customerProductDatabase extends Database<customerProduct>{

    private ArrayList<customerProduct> records;
    private String filename;

    public customerProductDatabase(String filename) {
        super(filename);
        this.filename = filename;
        this.records = new ArrayList<> ();
       super.setRecords(records);
    }

    @Override
    public customerProduct createRecordFrom(String line){
        //System.out.println("Create record from method called!");
        String[] lineData = line.split(","); 
        String dateString = lineData[2];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println(date);
        return new customerProduct( lineData[0], lineData[1], date);
    }
}
