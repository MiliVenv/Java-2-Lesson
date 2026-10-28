package sallergy.dev;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sallergy.dev");
//            Task task = context.getBean(Task.class);
//
//            System.out.println(task);
            TaskManager taskManager = (TaskManager) context.getBean(TaskManager.class);
            taskManager.printTask();
//            Task task2 = (Task) context.getBean("main-task");
            TaskManager taskManager2 = (TaskManager) context.getBean("Manager-task");

            taskManager2.printTask();
//            System.out.println(task2);
//            System.out.println(task == task2);

//        Task task = new Task();
//        TaskManager taskManager = new TaskManager(task);
//        taskManager.printTask();


        }
    }
