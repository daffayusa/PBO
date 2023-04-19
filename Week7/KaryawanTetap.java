import java.util.Scanner;

public class KaryawanTetap extends Karyawan {
    double gaji;
    int jml_anak;
    Scanner input = new Scanner(System.in);

    public void inputTetap() {
        System.out.println("==Karyawan Tetap==");
        System.out.print("Masukkan gaji pokok   :");
        gaji = input.nextDouble();
        System.out.print("Masukkan jumlah anak  :");
        jml_anak = input.nextInt();
    }

    public double totalGaji() {
        return gaji + (jml_anak * (0.1 * gaji));
    }
}
