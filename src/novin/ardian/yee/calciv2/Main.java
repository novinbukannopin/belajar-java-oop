package novin.ardian.yee.calciv2;

import java.util.Scanner;

/**
 * @author Novin on 21/09/2022
 * @project belajar-java-oop
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Data calculator = new Data(sc.nextDouble(), sc.nextDouble());
        System.out.println(calculator.getNum1() + " + " + calculator.getNum2() + " = " + calculator.add());
        System.out.println(calculator.getNum1() + " - " + calculator.getNum2() + " = " + calculator.substract());
        System.out.println(calculator.getNum1() + " * " + calculator.getNum2() + " = " + calculator.multiply());
        System.out.println(calculator.getNum1() + " / " + calculator.getNum2() + " = " + calculator.divide());
    }
}
