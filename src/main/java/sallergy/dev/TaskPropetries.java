package sallergy.dev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class TaskPropetries {

    @Value("${task.name}")
    private String taskName;

    @Value("${task.duration}")
    private Integer duration;

    @Value("#{'${list.values}'.split(',')}")
    private List<String> stringList;

    @Value("#{'${set.values}'.split(',')}")
    private Set<String> stringSet;

    @Value("#{${map.values}}")
    private Map<String, Integer> stringIntegerMap;

    @Override
    public String toString() {
        return "TaskPropetries{" +
                "taskName='" + taskName + '\'' +
                ", duration=" + duration +
                ", stringList=" + stringList +
                ", stringSet=" + stringSet +
                ", stringIntegerMap=" + stringIntegerMap +
                '}';
    }
}
