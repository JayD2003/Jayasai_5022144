package exercise_4;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData(10);
        
        // Adding the employee's data into employeeData
        employeeData.addEmployee(new Employee(1, "Jay", "Team Manager", 75000));
        employeeData.addEmployee(new Employee(2, "Guna", "Web Developer", 60000));
        employeeData.addEmployee(new Employee(3, "Hari", "GRaphic Designer", 50000));
        

        // Traverse and display all employees
        System.out.println("All Employees:");
        employeeData.traverseEmployees();

        // Search for an employee by ID
        System.out.println("\nSearch for Employee with ID 2:");
        Employee employee = employeeData.searchEmployee(2);
        if (employee != null) {
            employee.showDetails();
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee by ID
        System.out.println("\nDelete Employee with ID 2:");
        employeeData.deleteEmployee(2);

        // Traverse and display all employees again
        System.out.println("\nAll Employees After Deletion:");
        employeeData.traverseEmployees();
    }
}
