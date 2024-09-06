package Admin;
import System.*;

import java.io.*;
import java.util.ArrayList;
/*import java.util.Arrays;*/

public class EmployeeUserDatabase extends Database<EmployeeUser> {
    
    private ArrayList<EmployeeUser> records;
    private String filename;

    public EmployeeUserDatabase(String filename) {
        super(filename);
        this.filename = filename;
        this.records = new ArrayList<> ();
        super.setRecords(records);
    }
    @Override
    public EmployeeUser createRecordFrom(String line){
        
        //System.out.println("Create record from method called!");
        String[] lineData = line.split(",");
        System.out.println(lineData.length);
        return new EmployeeUser (lineData[0], lineData[1], lineData[2], lineData[3], lineData[4]);
        
    }
}

