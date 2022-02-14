package lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String args[]){
        AbstractApplicationContext app = new ClassPathXmlApplicationContext("lifeCycle.xml");
        samosa s1=(samosa) app.getBean("samosa1");

        System.out.println(s1);
        System.out.println("*******************************************************************");
        pepsi p1=(pepsi) app.getBean("pepsi1");
        System.out.println(p1);
        app.registerShutdownHook();

        annotation ann1=(annotation) app.getBean("annotation1");
        System.out.println(ann1);
    }
}
