package novin.ardian.yee.kelompok5;

/**
 * @author Novin on 05/10/2022
 * @project belajar-java-oop
 */
class Software {
    private String kode, nama, lisensi;

    Software() {

    }

    Software(String kode, String nama, String lisensi) {
        this.kode = kode;
        this.nama = nama;
        this.lisensi = lisensi;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLisensi() {
        return lisensi;
    }

    public void setLisensi(String lisensi) {
        this.lisensi = lisensi;
    }
}

