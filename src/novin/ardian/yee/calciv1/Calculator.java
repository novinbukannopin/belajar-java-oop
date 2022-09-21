package novin.ardian.yee.calciv1;

/**
 * @author Novin on 21/09/2022
 * @project belajar-java-oop
 */
public class Calculator {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.setNum1(10);
        calculate.setNum2(2);
        System.out.println(calculate.getNum1() + " divide by " + calculate.getNum2() + " = " + calculate.divide());
        System.out.println(calculate.getNum1() + " plus by " + calculate.getNum2() + " = " + calculate.add());
        System.out.println(calculate.getNum1() + " min by " + calculate.getNum2() + " = " + calculate.substract());
        System.out.println(calculate.getNum1() + " multiply by " + calculate.getNum2() + " = " + calculate.multiply());
    }
}
