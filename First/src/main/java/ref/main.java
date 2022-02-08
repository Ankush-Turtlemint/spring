package ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String args[]){
        ApplicationContext ref= new ClassPathXmlApplicationContext("ref.xml");
        a a1=(a)ref.getBean("aref");
        System.out.println(a1);
    }
}
