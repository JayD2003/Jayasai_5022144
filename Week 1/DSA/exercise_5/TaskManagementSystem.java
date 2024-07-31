package exercise_5;

public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskData taskList = new TaskData();

        // Add tasks
        taskList.addTask(new Task(1, "Task A", "Pending"));
        taskList.addTask(new Task(2, "Task B", "Completed"));
        taskList.addTask(new Task(3, "Task C", "In Progress"));

        // Traverse and display all tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search for a task by ID
        System.out.println("\nSearch for Task with ID 2:");
        Task task = taskList.searchTask(2);
        if (task != null) {
            task.showDetails();
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task by ID
        System.out.println("\nDelete Task with ID 2:");
        taskList.deleteTask(2).showDetails();
        System.out.println("Task with ID 2 is Deleted!");

        // Traverse and display all tasks again
        System.out.println("\nAll Tasks After Deletion:");
        taskList.traverseTasks();
    }
}
