package novin.ardian.yee.kelompok5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Novin on 05/10/2022
 * @project belajar-java-oop
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Game gameA = new Game("", "", "");
        Game gameB = new Game("", "", "", "", "");

        while (true) {
            System.out.println("===========================");
            System.out.println("MENU GAME");
            System.out.println("===========================");
            System.out.println("1. Input Game A");
            System.out.println("2. Input Game B");
            System.out.println("3. Lihat Data Game");
            System.out.println("4. Keluar");
            System.out.println("===========================");

            System.out.println("===========================");
            System.out.println("Masukkan Pilihan = ");
            int pilih = Integer.parseInt(br.readLine());

            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.println("===========================");
                    System.out.println("INPUT GAME A");
                    System.out.println("===========================");
                    System.out.println("Masukkan Kode       = ");
                    String kode = br.readLine();
                    System.out.println("Masukkan Nama       = ");
                    String nama = br.readLine();
                    System.out.println("Masukkan Lisensi    = ");
                    String lisensi = br.readLine();
                    gameA = new Game(kode, nama, lisensi);
                    System.out.println();
                    System.out.println("Data Game A telah disimpan");
                    break;
                case 2:
                    System.out.println("===========================");
                    System.out.println("INPUT GAME B");
                    System.out.println("===========================");
                    System.out.println("Masukkan Kode       = ");
                    String code = br.readLine();
                    System.out.println("Masukkan Nama       = ");
                    String name = br.readLine();
                    System.out.println("Masukkan Lisensi    = ");
                    String license = br.readLine();
                    System.out.println("Masukkan Jenis      = ");
                    String jenis = br.readLine();
                    System.out.println("Masukkan Tipe       = ");
                    String tipe = br.readLine();


                    gameB = new Game(code, name, license, jenis, tipe);
                    System.out.println();
                    System.out.println("Data Game B telah disimpan");
                    break;
                case 3:
                    System.out.println("===========================");
                    System.out.println("DATA GAME");
                    System.out.println("===========================");
                    System.out.println("DATA GAME A");
                    System.out.println("Kode Game A         = " + gameA.getKode());
                    System.out.println("Nama Game A         = " + gameA.getNama());
                    System.out.println("Lisensi Game A      = " + gameA.getLisensi());
                    System.out.println("Jenis Game A        = " + gameA.getJenis());
                    System.out.println("Tipe Game A         = " + gameA.getTipe());

                    System.out.println();

                    System.out.println("DATA GAME B");
                    System.out.println("Kode Game B         = " + gameB.getKode());
                    System.out.println("Nama Game B         = " + gameB.getNama());
                    System.out.println("Lisensi Game B      = " + gameB.getLisensi());
                    System.out.println("Jenis Game B        = " + gameB.getJenis());
                    System.out.println("Tipe Game B         = " + gameB.getTipe());

                    System.out.println("===========================");

                    break;
                default:
                    System.exit(0);
            }

        }
    }
}
