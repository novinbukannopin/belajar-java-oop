package novin.ardian.yee.hello;

/**
 * @author Novin on 26/10/2022
 * @project belajar-java-oop
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Novinssss");
        Student student1 = new Student("Novin", "Ardian");

        student.sayHello(student.getFullName());
        student1.sayHello(student1.getFirstName(), student1.getLastName());
    }
}
