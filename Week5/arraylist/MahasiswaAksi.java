package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MahasiswaAksi {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // membuat objek ArrayList untuk menyimpan data mahasiswa
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();
        ArrayList<Double> nilai1 = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        String nama, nim;
        int semester;
        double ips;

        // Input nama, nim , dan NIlai
        System.out.print("Masukkan nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukkan jumlah semester : ");
        semester = input.nextInt();

        for (int n = 1; n <= semester; n++) {
            System.out.print("Masukkan IPS semster " + n + " : ");
            ips = input.nextDouble();
            nilai1.add(ips);
        }

        mahasiswaList.add(new Mahasiswa(nama, nim, nilai1));

        // menampilkan data mahasiswa dan IPK menggunakan Iterator
        Iterator<Mahasiswa> iterator = mahasiswaList.iterator();
        while (iterator.hasNext()) {
            Mahasiswa mahasiswa = iterator.next();
            System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim() + ", IPK: "
                    + mahasiswa.hitungIPK());
        }
    }
}
