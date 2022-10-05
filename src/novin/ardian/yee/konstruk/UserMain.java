package novin.ardian.yee.konstruk;

/**
 * @author Novin on 05/10/2022
 * @project belajar-java-oop
 */
public class UserMain {
    public static void main(String[] args) {
        User user = new User("novin");
        user.sayHello(null);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());

    }
}
