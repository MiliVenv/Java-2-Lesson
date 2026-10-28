package sallergy.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Manager-task")
public class TaskManager {

    private Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    public void printTask() {
        if (task == null) {
            System.out.println("No current task");
        } else {
            System.out.println("Current task: " + task);
        }
    }
}
