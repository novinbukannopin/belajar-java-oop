package novin.ardian.yee.konstruk;

/**
 * @author Novin on 05/10/2022
 * @project belajar-java-oop
 */
public class Motor {
    public String merk, warna;

    Motor(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    void maju() {
        System.out.println("Motor = " + this.merk + "\nWarna = " + this.warna + " sedang Bergerak maju");
    }

    void mundur() {
        System.out.println("Motor = " + this.merk + "\nWarna = " + this.warna + " sedang Bergerak mundur");
    }
}
