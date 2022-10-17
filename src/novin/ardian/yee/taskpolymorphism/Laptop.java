package novin.ardian.yee.taskpolymorphism;

/**
 * @author Novin on 17/10/2022
 * @project belajar-java-oop
 */
public class Laptop extends Electronics {
    String processor;

    public Laptop(String type, String brand, double regularPrice, String processor) {
        super(type, brand, regularPrice);
        this.processor = processor;

    }

    public Laptop(String type, String brand, double regularPrice) {
        super(type, brand, regularPrice);
    }

    @Override
    public double computeSalePrice() {
        return super.getRegularPrice() * 0.9;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
