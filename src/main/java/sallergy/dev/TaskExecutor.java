package sallergy.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tskex")
public class TaskExecutor {
    private Task task;

    @Autowired
    public TaskExecutor(Task task) {
        this.task = task;
    }

    public void PrintTask() {
        System.out.println("Duration " + task.getDuration() + " Text: " + task.getText());
    }
}
