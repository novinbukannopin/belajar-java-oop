package novin.ardian.yee.taskpolymorphism;

/**
 * @author Novin on 17/10/2022
 * @project belajar-java-oop
 */
public class Electronics extends Product implements ElectronicsInterface {

    private String brand;
    private String type;

    public Electronics(String type, String brand, double regularPrice) {
        super(regularPrice);
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
