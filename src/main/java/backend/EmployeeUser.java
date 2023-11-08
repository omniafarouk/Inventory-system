package backend;

public class EmployeeUser implements Account{  
    
    private String employeeId;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public EmployeeUser(String employeeId, String name, String email, String address, String phoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String lineRepresentation(){  
        return (this.employeeId + "," + this.name + "," + this.email + "," + this.address + "," + this.phoneNumber);
    }
   
    @Override
    public String getSearchKey(){
        return this.employeeId;
    }
    
}