import java.util.Scanner;

public class KaryawanKontrak extends Karyawan {
    double upah_harian;
    int jml_anak, hari_masuk;

    Scanner input = new Scanner(System.in);

    public void inputKontrak() {
        System.out.println("==Karyawan Kontrak==");
        System.out.print("Masukkan upah harian  :");
        upah_harian = input.nextDouble();
        System.out.print("Masukkan jumlah Masuk :");
        hari_masuk = input.nextInt();
        System.out.print("Masukkan jumlah anak  :");
        jml_anak = input.nextInt();
    }

    public double totalUpah() {
        return (hari_masuk * upah_harian) + (jml_anak * (0.1 * (hari_masuk * upah_harian)));
    }
}
