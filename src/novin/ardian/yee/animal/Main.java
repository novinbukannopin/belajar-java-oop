package novin.ardian.yee.animal;

/**
 * @author Novin on 19/10/2022
 * @project belajar-java-oop
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Bird();
        Bird bird = new Bird();
        Dog dog = new Dog();
        System.out.println(animal.getClass().getName());
        System.out.println(bird.getClass().getName());
        System.out.println(dog.getClass().getName());

    }
}
