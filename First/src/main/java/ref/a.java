package ref;

public class a {
    private int x;
    private b ob;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public b getOb() {
        return ob;
    }

    public void setOb(b ob) {
        this.ob = ob;
    }

    public a(int x, b ob) {
        this.x = x;
        this.ob = ob;
    }

    public a() {
        super();
    }

    @Override
    public String toString() {
        return "a{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }
}
