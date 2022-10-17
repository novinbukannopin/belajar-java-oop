package novin.ardian.yee.taskpolymorphism;

/**
 * @author Novin on 17/10/2022
 * @project belajar-java-oop
 */
public class Book extends Product implements BookInterface {
    private String publisher;
    private int yearPublished;

    public Book(double regularPrice, String publisher, int yearPublished) {
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    @Override
    public double computeSalePrice() {
        return super.computeSalePrice() * 0.5;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public void setYearPublisher(int yearPublisher) {
        this.yearPublished = yearPublisher;
    }
}
