package novin.ardian.yee.company;

/**
 * @author Novin on 26/10/2022
 * @project belajar-java-oop
 */
public class Employee {
    private String name;
    private int age;
    private String address;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
