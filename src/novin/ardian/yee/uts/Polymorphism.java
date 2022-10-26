package novin.ardian.yee.uts;

/**
 * @author Novin on 26/10/2022
 * @project belajar-java-oop
 */
class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {

        System.out.println("Hi " + name + ", My Name Is Employee " + this.name);
    }
}

class Manager extends Employee {

    Manager(String name) {
        super(name);
    }

    void sayHello(String name) {

        System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    }
}

class President extends Manager {

    President(String name) {
        super(name);
    }

    void sayHello(String name) {

        System.out.println("Hi " + name + ", My Name Is President " + this.name);
    }

}

class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Novin");
        employee.sayHello("Farhat");

        employee = new Manager("Fuad");
        employee.sayHello("Farid");

        employee = new President("Jawa");
        employee.sayHello("Kemal");
    }
}
