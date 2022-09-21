package novin.ardian.yee.resto;

/**
 * @author Novin on 21/09/2022
 * @project belajar-java-oop
 */
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username != null) {
            this.username = username;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        }
    }
}
