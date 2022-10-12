package novin.ardian.yee.overloading;

/**
 * @author Novin on 12/10/2022
 * @project belajar-java-oop
 */
public class Lingkaran {
    float luas(float r) {
        return (float) Math.PI * r * r;
    }

    double luas(double d) {
        return 0.25 * Math.PI * d * d;
    }
}
