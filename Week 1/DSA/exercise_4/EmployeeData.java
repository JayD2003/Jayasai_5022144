package exercise_4;

public class EmployeeData {
    private Employee[] employees;
    private int count;

    public EmployeeData(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Employee array is full. Cannot add more employees.");
        }
    }

    // Search for an employee by ID
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse and display all employees
    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            employees[i].showDetails();
        }
    }

    // Delete an employee by ID
    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == employeeId) {
                // Replacing with last employee
                employees[i] = employees[count - 1]; 
                employees[count - 1] = null; 
                count--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
