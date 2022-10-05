package novin.ardian.yee.konstruk;

/**
 * @author Novin on 05/10/2022
 * @project belajar-java-oop
 */
public class User {

    private String firstName;
    private String lastName;

    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    User(String firstName) {
        this(firstName, null);
    }

    User() {
        this(null);
    }

    void sayHello(String toName) {
        if (firstName == null) {
            System.out.println("Hello " + toName + ", My name is " + null);
        } else if (toName == null) {
            System.out.println("Hello Guest, My name is " + firstName);
        } else if (firstName == null && toName == null) {
            System.out.println("Hello " + null + ", My name is " + null);
        } else if (firstName != null && toName != null) {
            System.out.println("Hello " + toName + ", My name is " + firstName);
        }
    }
}
