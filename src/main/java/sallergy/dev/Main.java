package sallergy.dev;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sallergy.dev");

        Task task = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);
        System.out.println(task == task2);

        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

        TaskExecutor taskExecutor1 = (TaskExecutor) context.getBean(TaskExecutor.class);
        taskExecutor1.PrintTask();
        TaskExecutor taskExecutor2 = (TaskExecutor) context.getBean(TaskExecutor.class);
        taskExecutor2.PrintTask();

        System.out.println(context.getBean(TaskPropetries.class));

        context.close();
    }
}
