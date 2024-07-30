package employee_mangement;
import java.util.Arrays;
public class EmployeeManagementSystem {
	private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

   
    public void addEmployee(Employee employee) {
        if (size >= employees.length) {
            employees = Arrays.copyOf(employees, employees.length * 2); // Double the array size if full
        }
        employees[size++] = employee;
    }

    // Method to search for an employee by employeeId
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

  
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    
    public void deleteEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1]; 
                }
                employees[--size] = null; 
                return;
            }
        }
    }
}
