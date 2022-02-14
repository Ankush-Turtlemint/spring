package stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


@Component

//By default it give singleton scope means same hashcode for same objects
@Scope("prototype")
// we can change the opject name by adding @Component("ob") and passing it to main
public class student {
    @Value("Ankush")
    private String name;
    @Value("18634")
//    @Value("#{8>6?88:55}")  values inside can be passed like this( also known as boolean expression )
//    @Value("#{T(java.lang.Math).sqrt(114)}")  If you want to use a static method of any class inside value
//    @Value("#{new java.lang.String('Ankush')}")   If you want to create an object inside value

    private int rollno;
    @Value("#{places}") //need to create a util object in xml file
    private List placesVisited;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", placesVisited=" + placesVisited +
                '}';
    }
}
