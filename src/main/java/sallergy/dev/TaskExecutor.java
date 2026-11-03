package sallergy.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sallergy.dev.aop.Loggable;

@Component
public class TaskExecutor {
    private final Task task;

    @Autowired
    public TaskExecutor(Task task) {
        this.task = task;
    }

    @Loggable(value = "ERROR", count = 3)
    public void PrintTask() {
        System.out.println("Duration " + task.getDuration() + " Name: " + task.getName());
    }
}
