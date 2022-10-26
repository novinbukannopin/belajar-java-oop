package novin.ardian.yee.polymorphismlagi;

import java.util.Comparator;

/**
 * @author Novin on 19/10/2022
 * @project belajar-java-oop
 */
public class Print {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.maxNumber(1,3);
    }


}

class Numbers{
    private int a, b;

//

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void maxNumber(int a, int b){
        if (a > b){
            System.out.println(a + " lebih dari " + b);
        } else if(b>a){
            System.out.println(b + " lebih dari " + a);
        } else {
            System.out.println("Sama dengan");
        }
    }
}

