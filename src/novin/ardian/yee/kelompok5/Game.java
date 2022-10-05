package novin.ardian.yee.kelompok5;

/**
 * @author Novin on 05/10/2022
 * @project belajar-java-oop
 */
class Game extends Software {
    private String jenis = "unknown";
    private String tipe = "unknown";

    Game(String kode, String name, String lisensi) {
        super(kode, name, lisensi);
    }

    Game(String kode, String name, String lisensi, String jenis, String tipe) {
        super.setKode(kode);
        super.setNama(name);
        super.setLisensi(lisensi);

        this.jenis = jenis;
        this.tipe = tipe;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getKode() {
        return super.getKode();
    }

    @Override
    public String getLisensi() {
        return super.getLisensi();
    }

    public String getJenis() {
        return jenis;
    }

    public String getTipe() {
        return tipe;
    }
}
