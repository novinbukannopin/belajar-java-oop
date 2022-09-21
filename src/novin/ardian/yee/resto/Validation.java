package novin.ardian.yee.resto;

/**
 * @author Novin on 21/09/2022
 * @project belajar-java-oop
 */
public class Validation {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("novin");
        user.setPassword("123456790");

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
    }
}
