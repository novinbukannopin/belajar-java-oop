package novin.ardian.yee.resto;

/**
 * @author Novin on 21/09/2022
 * @project belajar-java-oop
 */
public class Resto {
    public static void main(String[] args) throws IllegalAccessException {
        Menu menu = new Menu();
        menu.setMenu("Bakso");
        menu.setHarga(10000);
        menu.setSpesial(false);

        System.out.println(menu.getMenu());
        System.out.println(menu.getHarga());
        System.out.println(menu.isSpesial());


    }
}
