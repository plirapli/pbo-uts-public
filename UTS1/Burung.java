package UTS1;

public class Burung {
    private String nama;
    private int ketinggian;

    public Burung(String nama, int ketinggian) {
        this.nama = nama;
        this.ketinggian = ketinggian;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void terbang() {
        System.out.println("Burung terbang 🐦");
    }

    public int getKetinggian() {
        return ketinggian;
    }

    public void setKetinggian(int ketinggian) {
        this.ketinggian = ketinggian;
    }
}
