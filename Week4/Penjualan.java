public class Penjualan {
    String kode, nama, bonus;
    int harga, jumlah, total;

    void setData(String kode, String nama, int harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public Penjualan() {

    }

    void getTotalPembelian() {
        total = harga * jumlah;
    }

    void getBonus() {
        if ((total >= 500000) || (jumlah > 5)) {
            bonus = "setrika";
        } else if ((total >= 100000) || (jumlah > 3)) {
            bonus = "payung";
        } else if ((total >= 50000) || (jumlah > 2)) {
            bonus = "ballpoint";
        } else {
            bonus = "-";
        }
    }

    void cetakNota() {
        System.out.println("NOTA PEMBELIAN");
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + nama);
        System.out.println("Total Harga : Rp." + total);
        System.out.println("Bonus : " + bonus);
    }
}
