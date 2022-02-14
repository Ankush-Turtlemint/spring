package standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("standalone.xml");
        person p1=(person) context.getBean("bestfriends");
        System.out.println(p1);
    }
}
