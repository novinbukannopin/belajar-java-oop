package novin.ardian.yee.resto;

/**
 * @author Novin on 21/09/2022
 * @project belajar-java-oop
 */
public class Menu {
    private String menu;
    private double harga;
    private boolean isSpesial;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public boolean isSpesial() {
        return isSpesial;
    }

    public void setSpesial(boolean spesial) {
        this.isSpesial = spesial;
    }
}
