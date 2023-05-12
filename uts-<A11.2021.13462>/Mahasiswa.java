import java.util.*;

public class Mahasiswa {
    String nim, nama;
    int semester, usia;
    ArrayList<String> krs;
    ArrayList<Double> nilai;

    public Mahasiswa(String nim, String nama, int semester, int usia, ArrayList<String> krs, ArrayList<Double> nilai) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
        this.nilai = nilai;

    }

    public void infoMahasiswa() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Semester : " + semester);
        System.out.println("Usia : " + usia);
    }

    public double hitungRataNilai() {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.size();
    }

    public void infoKrsMahasiswa() {
        for (int i = 0; i < krs.size(); i++) {
            System.out.print(krs.get(i) + ", ");
        }
    }

}