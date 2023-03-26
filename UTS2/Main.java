package UTS2;

public class Main {
    public static void main(String[] args) {
        Spiderman spiderman = new Spiderman("Peterka", 19, 8, "Sepa", "Edo");
        Gatotkaca gatotKaca = new Gatotkaca("Komang", 5000, "Keris");

        // Set atribut dari class spiderman
        spiderman.setNama("Peter Parker");
        spiderman.setJumlahKaki(4);
        spiderman.setUsia(21);
        spiderman.setPacar("Novrido Charibaldi");
        spiderman.setEnemy("Green Goblin");

        // Memanggil method dari class spiderman
        spiderman.bernafas();
        spiderman.bicara();
        spiderman.mengeluarkanJaring();
        spiderman.memanjat();
        spiderman.terjun();
        spiderman.lompat();

        System.out.println("");

        gatotKaca.setNama("Gatot");
        gatotKaca.setSenjata("Kapak Perimbas");
        gatotKaca.setKetinggian(100000);

        // Set atribut dari class gatotkaca
        gatotKaca.bernafas();
        gatotKaca.bicara();
        gatotKaca.mengisiDaya();
        gatotKaca.menyerang();
        gatotKaca.terbang();
    }
}
