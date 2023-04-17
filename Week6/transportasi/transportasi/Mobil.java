package transportasi;

public class Mobil {
    // atribut
    public int roda;
    public String warna;
    public int kecepatan;
    public String merk;

    // method
    public void berjalan(String arah) {
        System.out.println("Bergerak ke " + arah);
    }

    public void berhenti() {
        System.out.println("Berhenti");
    }

    public void infoKendaraan() {
        System.out.println("Kendaraan beroda " + roda);
        System.out.println("Kendaraan berwarna " + warna);
        System.out.println("Kendaraan bermerk " + merk);

    }

    // function
    public int kecepatanSekarang(int speed, String tipe) {
        int x = 0;
        if (tipe == "cepat") {
            x = kecepatan + speed;
        } else if (tipe == "lambat") {
            x = kecepatan - speed;
        }
        return x;
    }

    public void mundur() {
        int x = 5;
        kecepatan = kecepatan - x;
    }
}
