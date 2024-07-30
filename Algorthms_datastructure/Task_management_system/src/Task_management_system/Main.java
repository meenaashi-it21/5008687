package Task_management_system;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList taskList = new SinglyLinkedList();

        // Add tasks
        taskList.addTask(new Task("T001", "Design the architecture", "Pending"));
        taskList.addTask(new Task("T002", "Implement the backend", "In Progress"));
        taskList.addTask(new Task("T003", "Develop the frontend", "Pending"));

        // Traverse and print all tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search for a task
        System.out.println("\nSearch Task T002:");
        Task foundTask = taskList.searchTask("T002");
        if (foundTask != null) {
            System.out.println("Found: " + foundTask);
        } else {
            System.out.println("Task not found.");
        }

        taskList.deleteTask("T002");
        System.out.println("\nTasks after deleting T002:");
        taskList.traverseTasks();
	}

}
