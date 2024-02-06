// Author name -> Ranshiv Kumar
// Student id -> 200555490
// Purpose -> Lab 5 
// Submitted to -> Zahy Abdelaziz
import java.util.*;
public class TaskCollection{
    private ArrayList<Task> tasks;
    private HashMap<String,Task> taskByID;
    private LinkedList<Task> orderOfAddition;
    public TaskCollection(){
        this.tasks = new ArrayList<>();
        this.taskByID = new HashMap<>();
        this.orderOfAddition = new LinkedList<>();
    }
    public void addTask(Task task){
        tasks.add(task);
        taskByID.put(task.getId(),task);
        orderOfAddition.add(task);
    }


    public void removeTaskById(String id){
        Task task = taskByID.get(id);
        if(task != null){
            tasks.remove(task);
            taskByID.remove(id);
            orderOfAddition.remove(task);
        }
    }

    public Task getTaskById(String id){
        return taskByID.get(id);
    }

    public List<Task> getAllTasks(){
        return tasks;
    }

    public List<Task> getTaskInOrderOfAddition(){
        return orderOfAddition;
        
    }

}