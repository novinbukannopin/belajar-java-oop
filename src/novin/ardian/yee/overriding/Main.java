package novin.ardian.yee.overriding;

/**
 * @author Novin on 28/09/2022
 * @project belajar-java-oop
 */
public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.sisi = 3;
        System.out.println("Luas Persegi            = " + persegi.luas());
        System.out.println("Keliling Persegi        = " + persegi.keliling());

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 21;
        System.out.println("Luas Lingkaran          = " + lingkaran.luas());
        System.out.println("Keliling Lingkaran      = " + lingkaran.keliling());

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.lebar = 4;
        persegiPanjang.panjang = 6;
        System.out.println("Luas Persegi Panjang    = " + persegiPanjang.keliling());
        System.out.println("Keliling PersegiPanjang = " + persegiPanjang.luas());

        Segitiga segitiga = new Segitiga();
        segitiga.tinggi = 12;
        segitiga.alas = 9;
        System.out.println("Luas Segitiga           = " + segitiga.luas());
        System.out.println("Keliling Segitiga       = " + segitiga.keliling());
    }
}
