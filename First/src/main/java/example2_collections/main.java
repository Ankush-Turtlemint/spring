package example2_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String args[]){
        ApplicationContext emp =new ClassPathXmlApplicationContext("config_emp.xml");
        emp emp1=(emp)emp.getBean("emp1");
        System.out.println(emp1);
    }
}
