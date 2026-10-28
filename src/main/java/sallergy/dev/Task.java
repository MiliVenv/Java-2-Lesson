package sallergy.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Component("main-task")
public class Task {
    private final String name;
    private final Long duration;
    private TaskManager taskManager;

    public Task(TaskManager taskManager) {
        this.name = "Task";
        this.duration = 60L;
        this.taskManager = taskManager;
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
        return duration;
    }

//    @Autowired
//    public void setTaskManager(TaskManager taskManager) {
//        this.taskManager = taskManager;
//    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
