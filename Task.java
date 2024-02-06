// Author name -> Ranshiv Kumar
// Student id -> 200555490
// Purpose -> Lab 5 
// Submitted to -> Zahy Abdelaziz
public class Task {
    
    private String id; 
    private String name;
    private String description;
    // Constructor
    public Task(String id, String name, String description ){
        this.id =id;
        this.name = name;
        this.description = description;
    }
    
    // Getters 
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    // toString method to display the task description in readable or standardized format(non-cipher)
    public String toString() {
        return "Task ID: " + id + ", Name: " + name + ", Description: " + description;
    }
}
