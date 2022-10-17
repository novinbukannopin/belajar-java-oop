package novin.ardian.yee.taskpolymorphism;

/**
 * @author Novin on 17/10/2022
 * @project belajar-java-oop
 */
public interface ElectronicsInterface extends ProductInterface{
    public String getType();
    public void setType(String type);
    public String getBrand();
    public void setBrand(String brand);
}
