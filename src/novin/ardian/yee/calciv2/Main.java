package novin.ardian.yee.calciv2;

/**
 * @author Novin on 21/09/2022
 * @project belajar-java-oop
 */
public class Main {
    public static void main(String[] args) {
        Data calculator = new Data(10, 5);
        System.out.println(calculator.add());
        System.out.println(calculator.substract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());
    }
}
