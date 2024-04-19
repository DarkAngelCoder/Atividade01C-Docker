import java.util.*;
public class ScrumBoard{
   
 
   ArrayList <Task> taskBoard = new ArrayList <Task>();
 
   public void add_task(Task task){
    taskBoard.add(task);
    }
 
    public void view_tasks(Task taskis){
        System.out.println(taskis);
    }
 
    public void mark_task_completed(Task taskos){
        for(int i = 0; i < taskBoard.size(); i ++){
            taskBoard.get(i).mark_as_completed();
        }
 
    }
}