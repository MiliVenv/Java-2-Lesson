package sallergy.dev;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sallergy.dev");
        TaskExecutor taskExecutor1 = (TaskExecutor) context.getBean(TaskExecutor.class);
        taskExecutor1.PrintTask();
        TaskExecutor taskExecutor2 = (TaskExecutor) context.getBean(TaskExecutor.class);
        taskExecutor2.PrintTask();
    }
}
