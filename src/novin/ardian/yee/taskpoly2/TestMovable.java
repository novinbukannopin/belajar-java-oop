package novin.ardian.yee.taskpoly2;

/**
 * @author Novin on 18/10/2022
 * @project belajar-java-oop
 */
public class TestMovable {
    public static void main(String[] args) {
        MovablePoint mv = new MovablePoint(7, 9);
        System.out.println(mv);
        mv.moveDown();
        System.out.println(mv);
        mv.moveRight();
        System.out.println(mv);

        Movable mv2 = new MovablePoint(3,4);
        System.out.println(mv2);
        mv2.moveUp();
        System.out.println(mv2);

        MovablePoint mv3 = (MovablePoint) mv2;
        System.out.println(mv3);
        mv3.moveDown();
        System.out.println(mv3);
    }
}
