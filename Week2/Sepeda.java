public class Sepeda {
    // atribut
    int gear = 5;
    int jumlahRoda;
    String jenis, merk;

    // method
    void ngerem() {
        System.out.println("Sepeda direm");
    }

    // constructor
    public Sepeda(int jumlahRoda, String jenis, String merk) {
        System.out.println("Sepeda " + jenis + " bermerk " + merk + " memiliki jumlah roda " + jumlahRoda);
    }

}
