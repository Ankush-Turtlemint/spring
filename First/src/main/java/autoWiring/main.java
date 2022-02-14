package autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("autoWiring.xml");
        emp e1=(emp) context.getBean("emp1");
        System.out.println(e1);
    }
}
