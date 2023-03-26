package inheritance;

// Superclass
class Edo {
  int usia = 100;
}

// Subclass
class Charibaldi extends Edo {
  public void display() {
    System.out.println("Usia edo adalah " + super.usia);
  }
}

// Main class
class Main {
  public static void main(String[] args) {
    Charibaldi novrido = new Charibaldi();

    novrido.display();
  }
}