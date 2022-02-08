package arithmetic_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String args[]){
       ApplicationContext add=new ClassPathXmlApplicationContext("arithmetic.xml");
       add a1=(add)add.getBean("add1");
       add a2=(add)add.getBean("add2");
       add a3=(add)add.getBean("add3");
       System.out.println(a1);
       System.out.println(a1);
       System.out.println(a3);
    }
}
