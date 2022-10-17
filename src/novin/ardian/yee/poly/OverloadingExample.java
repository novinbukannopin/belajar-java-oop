package novin.ardian.yee.poly;

/**
 * @author Novin on 18/10/2022
 * @project belajar-java-oop
 */

public class OverloadingExample {
    public void display() {
        System.out.println("Display method");
    }

    public void display(int a) {
        System.out.println("Display method " + a);
    }

    public static void main(String args[]) {
        OverloadingExample obj = new OverloadingExample();
        obj.display();
        obj.display(20);
    }
}
