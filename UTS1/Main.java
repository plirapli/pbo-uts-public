package UTS1;

public class Main {
    public static void main(String[] args) {
        Gatotkaca gatotKaca = new Gatotkaca("Komang", 5000, "Keris");

        gatotKaca.setNama("Gatot");
        gatotKaca.setSenjata("Kapak Perimbas");
        gatotKaca.setKetinggian(100000);

        gatotKaca.bernafas();
        gatotKaca.bicara();
        gatotKaca.mengisiDaya();
        gatotKaca.menyerang();
        gatotKaca.terbang();
    }
}
