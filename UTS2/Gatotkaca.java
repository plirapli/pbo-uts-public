package UTS2;

public class Gatotkaca extends Burung implements Manusia, Mesin {
    private String senjata;

    public Gatotkaca(String nama, int ketinggian, String senjata) {
        super(nama, ketinggian);
        this.senjata = senjata;
    }

    @Override
    public void bernafas() {
        System.out.println(super.getNama() + " bernapas");
    }

    @Override
    public void bicara() {
        System.out.println(super.getNama() + " bilang: Zǎo shang hǎo zhōng guó! Xiàn zài wǒ yǒu bing chilling");
    }

    @Override
    public void mengisiDaya() {
        System.out.println(super.getNama() + " butuh medkit... ");
    }

    @Override
    public void menyerang() {
        System.out.println(super.getNama() + " melakukan serangan dengan  " + senjata);
    }

    public void terbang() {
        System.out.println(super.getNama() + " terbang di ketinggian " + super.getKetinggian() + " meter");
    }

    public String getSenjata() {
        return senjata;
    }

    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }
}
