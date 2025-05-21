This Inventory Management System is a fullstack application designed to manage products, user accounts, and role-based access control. 
It is structured to support employees, admins, and customers with distinct functionalities.

Key Components:
  1. User Management
       Employee/Admin Registration & Login (AdminRole.java, EmployeeUser.java)
       Employees and admins can register and log in to the system.
       Role-Based Access Control (AdminRole.java, EmployeeRole.java)
       Admins have full system access, while employees have restricted permissions.

  2. Product Management
      Product Database (Product.java, ProductDatabase.java) Stores product details (ID, name, price, stock) and handles CRUD operations.
      Customer-Facing Product Handling (CustomerProduct.java, CustomerProductDatabase.java) Manages customer interactions like viewing products, adding to cart, or purchase history.

  3. Database Layer
    Base Database Class (Database.java)  Provides common database operations (connections, queries) extended by other database classes.
    Employee & Product Databases (EmployeeUserDatabase.java, ProductDatabase.java) Handle specific data operations for employees and products.


Workflow Overview
1. Admins can:
    Add/remove employees.
    Manage product inventory.

2. Employees can:
    Update product stock.
    View orders (if permissions allow).
    Customers (implied via CustomerProduct):
    Browse products.
    Make purchases to customers

*NOTE* :
  * The branches "master" is the project backend and frontend but the backend implemented using casting between classes of the original interface (ACOUNT)

  * The branch "generic-backend" implements the backend by using the interface account but using generics for more practical and professional implementation but without the frontend part
  
  * To run the master/main branch using frontend/GUI --> run "InventorySystem.java" class which is the first window of the gui that navigates to the rest of the windows according to access control
  
  * To run generic-backend --> run form "ManagementSystem" package either classes "TestClass,java" which runs all possible tests for the project , or , "Main.java" which is a custom main/test to call the projects classes (the class calls the test class to run this class always in general).
