package Admin;

public class EmployeeUser {  // can make instance variables final later
    
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
    
    public String lineRepresentation(){  // can make a function for this if duplicated later 
        return (this.employeeId + "," + this.name + "," + this.email + "," + this.address + "," + this.phoneNumber);
    }
   
    public String getSearchKey(){
        return this.employeeId;
    }
    
}