// Author name -> Ranshiv Kumar
// Student id -> 200555490
// Purpose -> Lab 5 
// Submitted to -> Zahy Abdelaziz

import java.util.Scanner;

public class TaskManagerApp {
    public static void main(String args[]) {
        TaskCollection taskCollection = new TaskCollection();
        // Using Scanner class for user input
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println(
                    "Enter command that you would like to commit: \n1.List your Tasks\n2.Add a new Task\n3.Remove your Task\n4.List Tasks in order of Addition\n5.Quit");
            String command = sc.nextLine();
            // Conditional Statements for asking user what task doe they want to perform/
            // execute

            if (command.equals("list") || command.equals("List") || command.equals("1"))
                listAllTasks(taskCollection);
            else if (command.startsWith("add") || command.equals("Add") || command.equals("2"))
                addTask(taskCollection, sc);
            else if (command.startsWith("remove") || command.equals("Remove") || command.equals("3"))
                removeTask(taskCollection, sc);
            else if (command.startsWith("List Tasks") || command.equals("List Tasks in order of Addition")
                    || command.equals("4"))
                listAllTasksinOrderOfAddition(taskCollection);
            else if (command.equals("quit") || command.equals("Quit") || command.equals("5"))
                break;
            else
                System.out.println("Invalid command");

            System.out.println("--------------------------------------");
        }
    }

    // Creating methods to list, add and remove tasks
    private static void listAllTasks(TaskCollection taskCollection) {

        try {
            System.out.println("All Tasks : ");
            // using enhanced for loop
            for (Task t : taskCollection.getAllTasks()) {
                System.out.println(t);
            }
        } catch (ArithmeticException e) {
            throw new UnsupportedOperationException("Unimplemented method found for ->'listAllTasks'");
        }

    }

    private static void addTask(TaskCollection taskCollection, Scanner sc) {
        // try and catch expression
        try {
            System.out.println(" Enter the ID of the task : ");
            String id = sc.nextLine();
            System.out.println(" Enter the name of the task : ");
            String name = sc.nextLine();
            System.out.println(" Enter the description of the task : ");
            String description = sc.nextLine();
            Task task = new Task(id, name, description);
            taskCollection.addTask(task);
            System.out.println("Task have been added Successfully");
        } catch (Exception e) { // if an exception found in the task collection or the program it will be
                                // displayed as an output
            throw new UnsupportedOperationException("Unimplemented method found for ->'addTask'");
        }

    }

    private static void removeTask(TaskCollection taskCollection, Scanner sc) {
        try {
            System.out.println(" Enter the ID of the task that you want to remove : ");
            String taskToRemove = sc.nextLine();
            taskCollection.removeTaskById(taskToRemove);
            System.out.println("Task Removed Successfully");
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method found for ->'removeTask'");
        }

    }

    private static void listAllTasksinOrderOfAddition(TaskCollection taskCollection) {
        try {
            if (taskCollection.getTaskInOrderOfAddition().size() == 0) {
                System.out.println("No task Have been added YET !!");
            } else {
                System.out.println("Tasks in order of addition are as follows : ");
                for (int i = 0; i < taskCollection.getTaskInOrderOfAddition().size(); i++) {
                    // System.out.println(i);
                    System.out.println(taskCollection.getTaskInOrderOfAddition().get(i));
                }
                System.out.println();
            }
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method found for ->'listAllTasks'");
        }
    }
}
