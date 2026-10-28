package sallergy.dev;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sallergy.dev");
        Task task = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);
        System.out.println(task == task2);

    }
}
