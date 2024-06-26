public class Task {
    private String description;
    private boolean completed = false;
 
    public Task(String description, boolean completed){
        this.description = description;
        this.completed = completed;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public boolean isCompleted() {
        return completed;
    }
 
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
 
    public void mark_as_completed(){
        this.completed = true;
    }
   
}

