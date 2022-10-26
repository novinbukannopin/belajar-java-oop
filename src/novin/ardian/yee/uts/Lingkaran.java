package novin.ardian.yee.uts;

/**
 * @author Novin on 26/10/2022
 * @project belajar-java-oop
 */
public class Lingkaran {
    private float r;

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float luasLingkaran(float r) {
        return (float) (Math.PI * Math.pow(r, 2));
    }

    public float kelilingLingkaran(float r) {
        return (float) ((float) 2 * Math.PI * r);
    }

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(7);
        System.out.println(lingkaran.luasLingkaran(lingkaran.getR()));
        System.out.println(lingkaran.kelilingLingkaran(lingkaran.getR()));
    }
}
