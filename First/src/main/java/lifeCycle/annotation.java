package lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class annotation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "annotation{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    private void start(){
        System.out.println("Annotation Started");
    }
    @PreDestroy
    private void end(){
        System.out.println("Annotation Ended");
    }
}
