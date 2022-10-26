package novin.ardian.yee.company;

/**
 * @author Novin on 26/10/2022
 * @project belajar-java-oop
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Novin", 19);
        Employee employee1 = new Employee("Kemal", 19, "Surabaya");
        Manager manager = new Manager("Althaf", 18);
        VicePresident vicePresident = new VicePresident("Jawa", 20, "Jakarta");
        System.out.println(employee.getClass().getName());
        System.out.println(employee1.getClass().getName());
        System.out.println(manager.getClass().getName());
        System.out.println(vicePresident.getClass().getName());
    }

}
