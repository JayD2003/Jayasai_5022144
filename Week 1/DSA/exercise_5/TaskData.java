package exercise_5;

public class TaskData {
    private TaskNode head;

    private class TaskNode {
        Task task;
        TaskNode next;

        TaskNode(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    // Add a task
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by ID
    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and display all tasks
    public void traverseTasks() {
        TaskNode current = head;
        while (current != null) {
            current.task.showDetails();
            current = current.next;
        }
    }

    // Delete a task by ID
    public Task deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return null;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return head.task;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.getTaskId() != taskId) {
            current = current.next;
        }

        if (current.next != null) {
            Task delete = current.next.task;
            current.next = current.next.next;
            return delete;
        } else {
            System.out.println("Task not found.");
        }
        return null;
    }
}
