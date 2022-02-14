package standalone;

import java.util.List;

public class person {
    private List friends;

    public List getFriends() {
        return friends;
    }

    public void setFriends(List friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "person{" +
                "friends=" + friends +
                '}';
    }
}
