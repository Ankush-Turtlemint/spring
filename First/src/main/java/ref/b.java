package ref;

public class b {
    private  int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public b(int y) {
        this.y = y;
    }

    public b() {
        super();
    }

    @Override
    public String toString() {
        return "b{" +
                "y=" + y +
                '}';
    }
}
