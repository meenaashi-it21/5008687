package MVCPattern;

public class MVCTest {
    public static void main(String[] args) {
        // Create the model
        Student student = new Student("John Doe", 123, "A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        System.out.println("Initial Student Details:");
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        // Display updated student details
        System.out.println("\nUpdated Student Details:");
        controller.updateView();
    }
}
