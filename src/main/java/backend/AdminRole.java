package backend;
import constants.FileNames;

public class AdminRole implements FileNames{
    private EmployeeUserDatabase database;
    
    public AdminRole(){
        database = new EmployeeUserDatabase(FileNames.EMPLOYEE_FILENAME);
        database.readFromFile();
    }
    
    public void addEmployee(String employeeId, String name, String email, String address, String phoneNumber) {
        
        if(database.contains( employeeId )){
            System.out.println("Can't add this employee! An Employee with id: "+ employeeId + " already exists.");
        }
        else   {
        
        EmployeeUser employee = new EmployeeUser (employeeId, name, email, address, phoneNumber); //can use create record from
        database.insertRecord((Account)employee);
        //database.saveToFile();
        }
        
    }
    
    public EmployeeUser[] getListOfEmployees(){

        EmployeeUser[] listOfEmployees = new EmployeeUser[database.returnAllRecords().size()];
        listOfEmployees = database.returnAllRecords().toArray(listOfEmployees);
        
        return (EmployeeUser[])listOfEmployees;
    }
    
    public void removeEmployee(String key){
        
        database.deleteRecord(key);
        //database.saveToFile(); //not sure
    }
    
    public void logout(){
        database.saveToFile();
    }
    
}
