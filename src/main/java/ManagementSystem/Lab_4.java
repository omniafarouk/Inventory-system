package ManagementSystem;

import Admin.EmployeeUserDatabase;

public class Lab_4 {

    public static void main(String[] args) {
        
        EmployeeUserDatabase db = new EmployeeUserDatabase("Employees.txt");
        db.readFromFile();
               
    }
}
