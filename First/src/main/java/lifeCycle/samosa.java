package lifeCycle;

public class samosa {
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public samosa(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "samosa{" +
                "price=" + price +
                '}';
    }

    public samosa() {
        super();
    }

//    works after setter
    public void init(){
        System.out.println("Start");
    }
// works at end
    public void destroy(){
        System.out.println("Destroy");
    }
}
