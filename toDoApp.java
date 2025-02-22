import java.util.HashMap;
import java.util.Scanner;

public class toDoApp {
    enum PriorityTaskLvl {
        PO,
        P1,
        P2,
        P3,
        P4,
        P5
    }
    boolean active = true;
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer, String[]> tasks = new HashMap<>();
    int taskIdCounter = 1;

    void enterTask() {
        System.out.println("Type task and priority");
        scanner.nextLine();
        String taskDesc = scanner.nextLine();
        System.out.println("Choose priority (0 - PO, 1 - P1, 2 - P2, 3 - P3, 4 - P4, 5 - P5): ");
        int priority = scanner.nextInt();

        if (priority < 0 || priority > 5) {
            System.out.println("Invalid priority! No task added.");
            return;
        }

        PriorityTaskLvl priorityLevel = PriorityTaskLvl.values()[priority];

        String[] taskData = new String[2];
        taskData[0] = taskDesc;
        taskData[1] = priorityLevel.name();

        tasks.put(taskIdCounter, taskData);
        System.out.println("Task added successfully with ID: " + taskIdCounter + " and priority: " + priorityLevel);
        taskIdCounter++;
    }

    void viewTask() 
    {
        System.out.println("Your tasks...");
       tasks.forEach((k,v)->{System.out.println("Id:" + k + " " + " task: " + v[0] + " priority: "+v[1]);});
    }

    void deleteTask() {
        scanner.nextLine(); 
        System.out.println("Enter ID to remove your task:");
        int inputId = scanner.nextInt();
    
        if (tasks.containsKey(inputId)) {
            tasks.remove(inputId);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid ID! Task not found.");
        }
    }

    void updateTask() {
        scanner.nextLine();
        System.out.println("Enter the task id to update");
        int updateTaskId = scanner.nextInt();

        if(tasks.containsKey(updateTaskId))
        {
            scanner.nextLine();
            System.out.println("type updated task");
            String updatedTask = scanner.nextLine();
            System.out.println("Choose new priority (0 - PO, 1 - P1, 2 - P2, 3 - P3, 4 - P4, 5 - P5): ");
            int priority = scanner.nextInt();
            if (priority < 0 || priority > 5) 
            {
                System.out.println("Invalid priority! Task not updated.");
                return;
            }
            PriorityTaskLvl priorityLevel = PriorityTaskLvl.values()[priority];
            String[] updatedData = new String[2];
            updatedData[0] = updatedTask;
            updatedData[1] = priorityLevel.name();
            
            tasks.put(updateTaskId,updatedData);
            System.out.println("Task updated succesfully");
        }
        else
        {
            System.out.println("Task not found!");
        }


    }

    void exitTask() {
        System.out.println("Exiting..");
        active = false;
    }

    int menu() {

        while(active){
            System.out.print("""
                Menu
                1. Enter task
                2. View task
                3. Delete task
                4. Update task
                5. Exit
                """);
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> enterTask();
                case 2 -> viewTask();
                case 3 -> deleteTask();
                case 4 -> updateTask();
                case 5 -> exitTask();
                
                default -> System.out.println("Invalid option, try again!");
            }
    }
    return 0;
}

    public static void main(String[] args) {
        toDoApp app = new toDoApp();
        app.menu();
    }
}
