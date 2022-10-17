package novin.ardian.yee.taskpolymorphism;

/**
 * @author Novin on 17/10/2022
 * @project belajar-java-oop
 */
public interface BookInterface extends ProductInterface {
    public String getPublisher();

    public void setPublisher(String publisher);

    public int getYearPublished();

    public void setYearPublisher(int yearPublisher);

}
