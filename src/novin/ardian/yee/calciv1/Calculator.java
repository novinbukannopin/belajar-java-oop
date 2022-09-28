package novin.ardian.yee.calciv1;

import java.util.Scanner;

/**
 * @author Novin on 21/09/2022
 * @project belajar-java-oop
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculate calculate = new Calculate();
        calculate.setNum1(sc.nextDouble());
        calculate.setNum2(sc.nextDouble());
        System.out.println(calculate.getNum1() + " divide by " + calculate.getNum2() + " = " + calculate.divide());
        System.out.println(calculate.getNum1() + " plus by " + calculate.getNum2() + " = " + calculate.add());
        System.out.println(calculate.getNum1() + " min by " + calculate.getNum2() + " = " + calculate.substract());
        System.out.println(calculate.getNum1() + " multiply by " + calculate.getNum2() + " = " + calculate.multiply());
    }
}
