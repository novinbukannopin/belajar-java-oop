package novin.ardian.yee.farhat;

/**
 * @author Novin on 26/10/2022
 * @project belajar-java-oop
 */
public class MainFarhat {
    public static void main(String[] args) {
        Farhat farhat = new Farhat("Farhat", "19");
        System.out.println(farhat.getName());
        System.out.println(farhat.getAge());
        farhat.setName("Kikik");
        System.out.println(farhat.getName());

    }
}
