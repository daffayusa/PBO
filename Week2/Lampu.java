public class Lampu {
    // method
    boolean nyala;

    // method
    void nyalakanLampu() {
        nyala = true;
        System.out.println("Apakah lampu menyala? " + nyala);
    }

    void matikanLampu() {
        nyala = false;
        System.out.println("Apakah lampu menyala? " + nyala);
    }

}
