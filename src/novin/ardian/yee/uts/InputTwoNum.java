package novin.ardian.yee.uts;

import java.util.Scanner;

/**
 * @author Novin on 26/10/2022
 * @project belajar-java-oop
 */
public class InputTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("Masukkan Nilai Angka ke 1 = ");
        num1 = sc.nextInt();
        System.out.print("Masukkan Nilai Angka ke 1 = ");
        num2 = sc.nextInt();
        result = num1 + num2;
        System.out.println("Hasil = " + result);
    }
}
