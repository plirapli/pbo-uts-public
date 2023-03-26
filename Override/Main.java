public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();

        Persegi p = new Persegi();
        p.sisi = 5;

        Segitiga s = new Segitiga();
        s.alas = 10;
        s.tinggi = 5;

        bd.hitungKeliling();
        bd.hitungLuas();

        p.hitungKeliling();
        p.hitungLuas();

        s.hitungKeliling();
        s.hitungLuas();
    }
}
