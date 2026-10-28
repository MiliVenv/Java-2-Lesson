package sallergy.dev;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("task")
@Scope(value = "prototype", proxyMode = org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS)
public class Task {

    private String text;
    private Integer duration;

    public Task() {
        this.text = "";
        this.duration = 0;
    }

    public String getText() {
        return text;
    }

    public Integer getDuration() {
        return duration;
    }

}
