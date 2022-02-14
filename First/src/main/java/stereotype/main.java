package stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("stereotype.xml");
        student s1=(student) context.getBean("student"); //we can add the name "ob"  written inside @Component("ob)
        student s2=(student) context.getBean("student");


//        By default it gives singleton scope i.e same hashcode for both the objects
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        teacher t1=(teacher) context.getBean("teacher");
        teacher t2=(teacher) context.getBean("teacher");
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}
