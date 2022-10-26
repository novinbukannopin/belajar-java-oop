package novin.ardian.yee.uts;

/**
 * @author Novin on 26/10/2022
 * @project belajar-java-oop
 */
class Shape {

    int getCorner() {
        return 0;
    }

}

class Rectangle extends Shape {
    @Override
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        return super.getCorner();
    }

}

class Triangle extends Shape {
    @Override
    int getCorner() {
        return 3;
    }

    int getParentCorner() {
        return super.getCorner();
    }
}

class Inherit {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Corner Shape    = " + shape.getCorner());

        Rectangle r = new Rectangle();
        System.out.println("Corner rectangle= " + r.getCorner());
        System.out.println("Parent Corner   = " + r.getParentCorner());

        Triangle triangle = new Triangle();
        System.out.println("Corner triangle = " + triangle.getCorner());
        System.out.println("Parent Corner   = " + triangle.getParentCorner());
    }
}
