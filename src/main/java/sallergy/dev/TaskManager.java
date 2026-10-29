package sallergy.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Manager-task")
public class TaskManager {

    private Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("task postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("task preDestroy");
    }

    public void printTask() {
        if (task == null) {
            System.out.println("No current task");
        } else {
            System.out.println("Current task: " + task);
        }
    }
}