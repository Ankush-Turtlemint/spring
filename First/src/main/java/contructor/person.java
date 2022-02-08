package contructor;

public class person {
    private String name;
    private  int personId;

    public person(String name, int personId) {
        this.name = name;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                '}';
    }
}
