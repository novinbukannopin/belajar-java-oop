package novin.ardian.yee.uts;

import programmer.zaman.now.data.HelloWorld;

/**
 * @author Novin on 26/10/2022
 * @project belajar-java-oop
 */
public class HelloWorldApp {
    int panjang, lebar, tinggi, hasil;

    HelloWorldApp(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int volume() {
        hasil = panjang * lebar * tinggi;
        return hasil;
    }

    public void vol(){
        System.out.println("Volume Method Void = " + hasil);
    }


    public static void main(String[] args) {
        HelloWorldApp balok = new HelloWorldApp(3, 4, 5);
//        balok.panjang = 3;
//        balok.lebar = 4;
//        balok.tinggi = 5;
//        value atribut sudah saya masukkan ke constructor
        System.out.println("Volume method return " + balok.volume());
        balok.vol();
    }
}
