import java.util.Scanner;

public class Karyawan {
    String nip, nama, status;
    Scanner input = new Scanner(System.in);

    public void inputKar() {
        System.out.println("Data karyawan");
        System.out.print("Masukkan nip                      :");
        nip = input.nextLine();
        System.out.print("Masukkan nama                     :");
        nama = input.nextLine();
        System.out.print("Masukkan Status(tetap/kontrak)    :");
        status = input.nextLine();
    }
}
