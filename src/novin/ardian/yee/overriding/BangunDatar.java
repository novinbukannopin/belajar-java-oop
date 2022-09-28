package novin.ardian.yee.overriding;

/**
 * @author Novin on 28/09/2022
 * @project belajar-java-oop
 */
public class BangunDatar {
    float luas() {
        System.out.println("Menghitung luas Bangun Datar");
        return 0;
    }

    ;

    float keliling() {
        System.out.println("Menghitung keliling Bangun Datar");
        return 0;
    }

    ;
}

class Persegi extends BangunDatar {
    float sisi;

    @Override
    float luas() {
        return sisi * sisi;
    }

    @Override
    float keliling() {
        return sisi * 4;
    }
}

class Lingkaran extends BangunDatar {
    float r;

    @Override
    float keliling() {
        return (float) (2 * Math.PI) * r;
    }

    @Override
    float luas() {
        return (float) Math.pow(Math.PI * r, 2);
    }
}

class PersegiPanjang extends BangunDatar {
    float panjang, lebar;

    @Override
    float luas() {
        return panjang * lebar;
    }

    @Override
    float keliling() {
        return 2 * panjang + 2 * lebar;
    }
}

class Segitiga extends BangunDatar {
    float alas, tinggi;

    @Override
    float luas() {
        return (float) (0.5 * alas * tinggi);
    }

    @Override
    float keliling() {
        return (float) ((float) alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2)));
    }
}

