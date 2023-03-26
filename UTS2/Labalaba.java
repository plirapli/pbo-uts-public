package UTS2;

class Labalaba extends Hewan {

    private int jumlahKaki;

    public Labalaba(String nama, int usia, int jumlahKaki) {
        super(nama, usia);
        this.jumlahKaki = jumlahKaki;
    }

    public void mengeluarkanJaring() {
        System.out.println(super.getNama() + " menembakkan jaring!");
    }

    public void memanjat() {
        System.out.println(super.getNama() + " memanjat menggunakan " + jumlahKaki + " kaki");
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

}