import java.util.*;

public class Main {
    public static void main(String[] args) {
 
        Task task1 = new Task("Implementar login no sistema", false);
        Task task2 = new Task("Criar página de perfil do usuário", false);
        Task task3 = new Task("Testar funcionalidades do sistema", false);

        ScrumBoard scrumBoard = new ScrumBoard();

        scrumBoard.add_task(task1);
        scrumBoard.add_task(task2);
        scrumBoard.add_task(task3);

        System.out.println("Tarefas no quadro Scrum:");
        for (Task task : scrumBoard.taskBoard) {
            System.out.println(task.getDescription() + " - Completada: " + task.isCompleted());
        }

        scrumBoard.mark_task_completed(task1);

        System.out.println("\nTarefas no quadro Scrum após marcar uma tarefa como concluída:");
        for (Task task : scrumBoard.taskBoard) {
            System.out.println(task.getDescription() + " - Completada: " + task.isCompleted());
        }
 
    }
}