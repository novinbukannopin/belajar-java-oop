package novin.ardian.yee.konstruk;

/**
 * @author Novin on 05/10/2022
 * @project belajar-java-oop
 */
public class MotorMain {
    public static void main(String[] args) {
        Motor motor = new Motor("Supra Bapak", "Pink");
        motor.maju();
        motor.mundur();
    }
}
