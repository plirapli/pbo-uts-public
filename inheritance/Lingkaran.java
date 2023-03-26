package inheritance;

// Superclass
class Lingkaran {
  private double r;
  public double keliling;

  public Lingkaran(double r) {
    this.r = r;
    this.keliling = hitungKeliling(r);
  }

  public double getR() {
    return r;
  }

  public double hitungKeliling(double r) {
    return Math.PI * r * 2;
  }
}

// Subclass
class Tabung extends Lingkaran {
  private double t;

  public Tabung(double r, double t) {
    super(r);
    this.t = t;
  }

  public double hitungLuasPermukaan() {
    return 0;
    // return super.hitungKeliling(9.0) * t;
    // return super.keliling * t;
  }
}