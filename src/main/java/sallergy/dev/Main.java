package sallergy.dev;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sallergy.dev");

        TaskManager taskManager = context.getBean(TaskManager.class);
        Integer count = taskManager.printTask();
        System.out.println(count);
        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
        taskExecutor.PrintTask();
        context.close();
    }
}
