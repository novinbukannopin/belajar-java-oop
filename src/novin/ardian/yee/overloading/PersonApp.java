package novin.ardian.yee.overloading;

public class PersonApp {
  public static void main(String[] args) {

    var person1 = new Person("Novin", "Lamongan");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Ucup");

    Person person2 = new Person("Novin");

    Person person3;
    person3 = new Person();
    person3.name = "Novin";
    person3.sayHello("Ugas");

  }
}
