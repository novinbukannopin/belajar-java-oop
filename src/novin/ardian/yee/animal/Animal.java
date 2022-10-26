package novin.ardian.yee.animal;

/**
 * @author Novin on 19/10/2022
 * @project belajar-java-oop
 */
abstract class Animal implements Example {
    @Override
    public void jump() {
        System.out.println("Animal Jump");
    }

    @Override
    public void walk() {
        System.out.println("Animal Walk");
    }

}
