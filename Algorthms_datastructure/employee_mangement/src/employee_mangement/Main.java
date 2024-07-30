package employee_mangement;

public class Main {

	public static void main(String[] args) {
		 EmployeeManagementSystem ems = new EmployeeManagementSystem(2);

	        // Add employees
	        ems.addEmployee(new Employee("E001", "Alice", "Developer", 80000));
	        ems.addEmployee(new Employee("E002", "Bob", "Manager", 90000));
	        ems.addEmployee(new Employee("E003", "Charlie", "Analyst", 70000));

	        System.out.println("All Employees:");
	        ems.traverseEmployees();

	        System.out.println("\nSearch Employee E002:");
	        Employee foundEmployee = ems.searchEmployee("E002");
	        if (foundEmployee != null) {
	            System.out.println("Found: " + foundEmployee);
	        } else {
	            System.out.println("Employee not found.");
	        }

	        ems.deleteEmployee("E002");
	        System.out.println("\nEmployees after deleting E002:");
	        ems.traverseEmployees();

	}

}
