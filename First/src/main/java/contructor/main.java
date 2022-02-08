package contructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String args[]){
       ApplicationContext p =new ClassPathXmlApplicationContext("constructor.xml");
        person p1=(person)p.getBean("p1");
       System.out.println(p1);
    }
}
