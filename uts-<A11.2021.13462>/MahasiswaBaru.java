import java.util.ArrayList;

public class MahasiswaBaru extends Mahasiswa {

    String asalSekolah;

    public MahasiswaBaru(String nim, String nama, int semester, int usia, ArrayList<String> krs,
            ArrayList<Double> nilai, String asalSekolah) {
        super(nim, nama, semester, usia, krs, nilai);
        this.asalSekolah = asalSekolah;
        // TODO Auto-generated constructor stub
    }

    public boolean ikutOspek() {
        return true;
    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Sekolah : " + asalSekolah);
    }

}
