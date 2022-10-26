package novin.ardian.yee.hello;

/**
 * @author Novin on 26/10/2022
 * @project belajar-java-oop
 */
public class Student {
    private String firstName, lastName, fullName;

    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Student(String fullName) {
        this.fullName = fullName;
    }

    void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    void sayHello(String fullName) {
        System.out.println("Hello " + fullName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
