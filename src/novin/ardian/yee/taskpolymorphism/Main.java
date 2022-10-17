package novin.ardian.yee.taskpolymorphism;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Novin on 17/10/2022
 * @project belajar-java-oop
 */
public class Main {
    public Main() {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ProductInterface phoneA = new Phone("", "", 0, 0);
        ProductInterface phoneB = new Phone("", "", 0);


        while (true) {
            System.out.println("===========================");
            System.out.println("ONLINE SHOP");
            System.out.println("===========================");
            System.out.println("1. Order Phone A");
            System.out.println("2. Order Phone B");
            System.out.println("3. Lihat Data Game");
            System.out.println("4. Keluar");
            System.out.println("===========================");

            System.out.println("===========================");
            System.out.println("Masukkan Pilihan = ");
            int pilih = Integer.parseInt(bufferedReader.readLine());

            switch (pilih) {
                case 1:
                    System.out.println("===========================");
                    System.out.println("INPUT GAME A");
                    System.out.println("===========================");
                    System.out.println("Masukkan Kode       = ");
                    String tipe = bufferedReader.readLine();
                    System.out.println("Masukkan Nama       = ");
                    String brand = bufferedReader.readLine();
                    System.out.println("Masukkan Lisensi    = ");
                    double price = Double.parseDouble(bufferedReader.readLine());
                    System.out.println("Masukkan Storage    = ");
                    int size = Integer.parseInt(bufferedReader.readLine());
                    phoneA = new Phone(tipe, brand, price, size);
                    System.out.println();
                    System.out.println("Data Phone A telah disimpan");
                    break;
                case 2:
                    System.out.println("===========================");
                    System.out.println("INPUT GAME A");
                    System.out.println("===========================");
                    System.out.println("Masukkan Kode       = ");
                    String type = bufferedReader.readLine();
                    System.out.println("Masukkan Nama       = ");
                    String brande = bufferedReader.readLine();
                    System.out.println("Masukkan Lisensi    = ");
                    double prici = Double.parseDouble(bufferedReader.readLine());
                    phoneB = new Phone(type, brande, prici);
                    System.out.println();
                    System.out.println("Data Phone B telah disimpan");
                    break;
                case 3:
                    System.out.println(phoneA.getClass().getName());
                    System.out.println(phoneA.getRegularPrice());
                    System.out.println(phoneA.computeSalePrice());
                    System.out.println(phoneB.getClass().getName());
                    System.out.println(phoneB.getRegularPrice());
                    System.out.println(phoneB.computeSalePrice());
            }
        }
    }
}
