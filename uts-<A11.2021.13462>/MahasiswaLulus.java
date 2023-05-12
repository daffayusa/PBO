import java.util.ArrayList;

public class MahasiswaLulus extends Mahasiswa {

    int tahunWisuda;
    float ipk;

    public MahasiswaLulus(String nim, String nama, int semester, int usia, ArrayList<String> krs,
            ArrayList<Double> nilai, int tahunWisuda, float ipk) {
        super(nim, nama, semester, usia, krs, nilai);
        this.ipk = ipk;
        this.tahunWisuda = tahunWisuda;
        // TODO Auto-generated constructor stub
    }

    public boolean ikutWisuda() {
        return true;
    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun wisuda : " + tahunWisuda);
        System.out.println("Jumlah ipk : " + ipk);
    }
}
