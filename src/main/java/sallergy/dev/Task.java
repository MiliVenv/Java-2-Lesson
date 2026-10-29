package sallergy.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("task")
//@Scope("prototype")
public class Task {

    private String name;
    private Integer duration;

    public Task(@Value("${task.name}") String name, @Value("${task.duration}") Integer duration) {
        this.name = name;
        this.duration = duration;
        System.out.println("call task constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("task postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("task preDestroy");
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

}
