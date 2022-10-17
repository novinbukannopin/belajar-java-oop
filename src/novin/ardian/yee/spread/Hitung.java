package novin.ardian.yee.spread;

/**
 * @author Novin on 18/10/2022
 * @project belajar-java-oop
 */
public class Hitung {
    //    spread tapi kayak overloading
    public static int sum(int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        return total;
    }

    public static int multiply(int... values) {
        int total = 1;
        for (var value : values) {
            total *= value;
        }
        return total;
    }
}
