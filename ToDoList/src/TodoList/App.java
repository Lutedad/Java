package TodoList;

// Import necessary libraries
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // Clearing the terminal
        System.out.print("\033\143");

        // Create an instance of the TodoList class
        TodoList.tasks tk = new tasks();

        System.out.println("Welcome to TO_DO_LIST_MAKER!\n");
        boolean run = true;

        // Create an ArrayList to store tasks
        ArrayList<String> TodoList = new ArrayList<String>();

        // Main application loop
        while (run) {
            // Get user's choice for the operation
            String user_input = tk.choice("Add a task (A)\nView a task (B)\nUpdate a task (C)\nRemove a task (D)\nSave a task (E)\nEnd the app (F)\n\nChoose your task to do!: ");

            switch (user_input) {
                case "a":
                    // Add the task to the TodoList
                    TodoList = tk.add(TodoList);
                    break;

                case "b":
                    // View the list of tasks
                    System.out.println(TodoList);
                    TimeUnit.SECONDS.sleep(3);  // Pause for 3 seconds to display tasks
                    break;

                case "c":
                    // Update a task
                    TodoList = tk.update(TodoList, user_input, 0);  // Modify the update method to work with actual task data
                    break;

                case "d":
                    // Remove a task
                    TodoList = tk.remove(TodoList, 0);  // Modify the remove method to work with actual task data
                    break;

                case "e":
                    tk.get_tasks_name(TodoList);
                    // Save tasks to a file (not implemented in this code)
                    break;

                case "f":
                    // End the application
                    run = false;
                    break;
            }

            // Clear the terminal
            System.out.print("\033\143");
        }
    }
}
