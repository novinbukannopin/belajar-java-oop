package novin.ardian.yee.taskpolymorphism;

/**
 * @author Novin on 17/10/2022
 * @project belajar-java-oop
 */
public class Product implements ProductInterface {

    private double regularPrice;

    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    @Override
    public double computeSalePrice() {
        return regularPrice;
    }

    @Override
    public double getRegularPrice() {
        return regularPrice;
    }

    @Override
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
}
