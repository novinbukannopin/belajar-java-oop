package novin.ardian.yee.company;

/**
 * @author Novin on 26/10/2022
 * @project belajar-java-oop
 */

public class Manager extends Employee {
    private String name;
    private int age;
    private String address;

    Manager(String name, int age) {
        super(name, age);
    }

    Manager(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
}


