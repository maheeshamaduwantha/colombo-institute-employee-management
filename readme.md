# Colombo Institute of Studies Employee Management System

The Colombo Institute of Studies is currently handling employee details manually. To streamline this process, the institute plans to automate the system, enabling the HR manager and assistant to manage employee details efficiently.

## Features

### HR Manager
1. **Department and Designation Management**
   - Add new departments.
   - Add new designations.
2. **Employee Management**
   - Add new employees.
   - Allocate employees to available departments and designations.
3. **Search Functionality**
   - Search employee details based on department, designation, name, EPF number, etc.

### Admin
1. **Account Management**
   - Create new accounts for HR Manager and HR Assistant.

## Object-Oriented Programming (OOP) Concepts Applied
The application is designed using OOP principles to ensure modularity, reusability, and maintainability. Key concepts applied include:

- **Encapsulation**: Employee, Department, and Designation details are encapsulated within their respective classes.
- **Inheritance**: User roles (Admin, HR Manager, HR Assistant) inherit common attributes and methods from a base User class.
- **Polymorphism**: Method overriding is used to provide specific implementations for user roles.
- **Abstraction**: Abstract classes and interfaces are used to define essential functionalities for user management and employee management.

## Data Storage
All data is saved and retrieved from a file, ensuring persistent storage of employee and department details.
