package lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



public class pepsi implements InitializingBean, DisposableBean {
    private  Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public pepsi(Double price) {
        this.price = price;
    }

    public pepsi() {
        super();
    }

    @Override
    public String toString() {
        return "pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        code for init
        System.out.println("Pepsi Start");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Pepsi Destroyed");
    }
}
