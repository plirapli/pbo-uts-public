package UTS2;

class Spiderman extends Labalaba implements Parkour {

    private String pacar, enemy;

    public Spiderman(String nama, int usia, int jumlahKaki, String pacar, String enemy) {
        super(nama, usia, jumlahKaki);
        this.pacar = pacar;
        this.enemy = enemy;
    }

    @Override
    public void memanjat() {
        System.out.println(super.getNama() + " memanjat dengan membawa " + pacar);
    }

    @Override
    public void mengeluarkanJaring() {
        System.out.println(super.getNama() + " mengeluarkan jaring ke " + enemy);
    }

    @Override
    public void lompat() {
        System.out.println(super.getNama() + " melompat dari gedung dengan " + super.getJumlahKaki() + " kaki");
    }

    @Override
    public void terjun() {
        System.out.println(super.getNama() + " terjun dari gedung");
    }

    @Override
    public void bernafas() {
        System.out.println(super.getNama() + " bernapas");
    }

    @Override
    public void bicara() {
        System.out.println(super.getNama() + " mengatakan dia berusia " + super.getUsia());
    }

    public String getPacar() {
        return pacar;
    }

    public void setPacar(String pacar) {
        this.pacar = pacar;
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

}