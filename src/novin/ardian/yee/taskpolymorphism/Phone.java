package novin.ardian.yee.taskpolymorphism;

/**
 * @author Novin on 17/10/2022
 * @project belajar-java-oop
 */
public class Phone extends Electronics {
    int storage;

    public Phone(String type, String brand, double regularPrice, int storage) {
        super(type, brand, regularPrice);
        this.storage = storage;
    }

    public Phone(String type, String brand, double regularPrice) {
        super(type, brand, regularPrice);
    }

    @Override
    public double computeSalePrice() {
        return super.getRegularPrice() * 0.9;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
