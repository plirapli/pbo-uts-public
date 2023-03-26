public class Hewan { // <== Class
    String nama; //
    int kecepatan; // <== Atribut
    double berat; //

    public void hitungBerat() {
        System.out.println(nama + " memiliki berat " + berat + " kg");
    }

    public void lari() {
        System.out.println(nama + " berlari dengan kecepatan " + kecepatan + " km/h");
    }
}