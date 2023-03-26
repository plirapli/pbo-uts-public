public class Buku {
    String judul;
    double harga;

    /*
     * public void setJudul(String judul) {
     * this.judul = judul;
     * }
     * 
     * public String getJudul() {
     * return judul;
     * }
     * 
     * public void setHarga(double harga) {
     * this.harga = harga;
     * }
     * 
     * public double getHarga() {
     * return harga;
     * }
     */

    /*
     * public Buku() {
     * System.out.println("Ini adalah constructor buku");
     * }
     * 
     * public Buku(String judul, double harga) {
     * this.judul = judul;
     * this.harga = harga;
     * }
     */

    public static void main(String[] args) {
        Buku mariposa = new Buku();

        /*
         * int jumlah;
         * Buku mariposa = new Buku();
         * mariposa.judul = "Mariposa";
         * mariposa.harga = 55000.00;
         * mariposa.mencetak();
         * jumlah = 10;
         * System.out.println(" dan jumlah yang tersedia adalah " + jumlah + " buku.");
         */
    }

    public void mencetak() {
        System.out.println("Buku dengan judul " + judul + " dijual dengan harga " + harga);
    }
}
