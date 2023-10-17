package TodoList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class tasks {
    
    
    public ArrayList<String> get_tasks_name(ArrayList<String> TodoList) throws InterruptedException {
        
        String tasks_name = "";
        String tasks_index = "";
        ArrayList<String> result = new ArrayList<String>();

        int range_ToDoList = TodoList.size();

        for (int i = 0; i < range_ToDoList; i++) {
            tasks_index = Integer.toString(i);
            String msg = TodoList.get(i);
            String[] msg_array = msg.split("\n");
            tasks_name = msg_array[0];
            String name_index = (tasks_name + ", index: " + tasks_index);
            result.add(name_index);    
        }

        int range_result = result.size();

        for (int i = 0; i < range_result; i++) {
            System.out.println(result.get(i));
        }
        tasks_index = choice("Choose the index you want to update/remove/save: ");
        String chosen_one = result.get(Integer.valueOf(tasks_index));
        System.out.println(chosen_one);
        TimeUnit.SECONDS.sleep(3);
        return result;
    }

    public String choice(String message){

        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String user_input = sc.nextLine().toLowerCase();
        return user_input;
    }

    public ArrayList<String> add(ArrayList<String> TodoList){
        // Clearing the terminal
        System.out.print("\033\143");
        // Add a new task
        String name = choice("Name?: ");
        String describtion = choice("Description?: ");
        String due_date = choice("Due date?: ");
        String ToAdd = "Name: " + name + "\nDescribtion: " + describtion + "\nDue Date: " + due_date;
        TodoList.add(ToAdd);
        return TodoList;
    }
    
    public ArrayList<String> remove(ArrayList<String> TodoList,int index){
        TodoList.remove(index);
        return TodoList;
    }

    public ArrayList<String> update(ArrayList<String> TodoList,String ToUpdate,int index){
        TodoList.set(index,ToUpdate);
        return TodoList;
    }

    public void save(ArrayList<String> TodoList){
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File name already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

}
