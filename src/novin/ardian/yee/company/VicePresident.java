package novin.ardian.yee.company;

public class VicePresident extends Employee {
    private String name;
    private int age;
    private String address;

    VicePresident(String name, int age) {
        super(name, age);
    }

    VicePresident(String name, int age, String address) {
        super(name, age, address);
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
