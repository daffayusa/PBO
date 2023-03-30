import java.util.Scanner;

public class PenjualanBeraksi {
    public static void main(String args[]) {
        String cek;
        Scanner inp = new Scanner(System.in);
        Penjualan penjualanBaru = new Penjualan();

        do {
            System.out.print("Kode barang : ");
            penjualanBaru.kode = inp.nextLine();
            System.out.print("Nama barang : ");
            penjualanBaru.nama = inp.nextLine();
            System.out.print("Harga barang : ");
            penjualanBaru.harga = inp.nextInt();
            System.out.print("Jumlah Pembelian : ");
            penjualanBaru.jumlah = inp.nextInt();

            penjualanBaru.getTotalPembelian();
            penjualanBaru.getBonus();
            penjualanBaru.cetakNota();

            System.out.print("Input data lagi ? [Y/T] : ");
            cek = inp.next();
        } while (cek.equalsIgnoreCase("Y"));
    }
}
