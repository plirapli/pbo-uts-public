package Interface;

public class Atlit implements Manusia {

    public static void main(String[] args) {
        Atlit ronaldo = new Atlit();
        ronaldo.makan();
        ronaldo.minum();
    }

    public void makan() {
        System.out.println("Atlit makan afui porsi Monsters");
    }

    public void minum() {
        System.out.println("Atlit minum 2 galon air");
    }

    public void tidur() {
        System.out.println("Atlit tidur 8 jam sehari");
    }
}
