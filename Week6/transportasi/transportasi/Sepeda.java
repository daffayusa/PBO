package transportasi;

public class Sepeda {
    // atribut
    public int gear = 5;
    public int jumlahRoda;
    public String jenis, merk;

    // method
    public void ngerem() {
        System.out.println("Sepeda direm");
    }

    // constructor
    public Sepeda(int jumlahRoda, String jenis, String merk) {
        System.out.println("Sepeda " + jenis + " bermerk " + merk + " memiliki jumlah roda " + jumlahRoda);
    }

}
