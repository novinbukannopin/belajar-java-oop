package novin.ardian.yee.konstruk;

/**
 * @author Novin on 05/10/2022
 * @project belajar-java-oop
 */
public class Mobil {
    public String warna, merk;

    public Mobil() {
        warna = "Merah";
        merk = "BMW";
    }

    void maju() {
        System.out.println("Mobil = " + merk + "\nWarna = " + warna + " sedang Bergerak maju");
    }

    void mundur() {
        System.out.println("Mobil = " + merk + "\nWarna = " + warna + " sedang Bergerak mundur");
    }
}
