import java.util.ArrayList;

public class MahasiswaTransfer extends MahasiswaBaru {
    String asalUniv;

    public MahasiswaTransfer(String nim, String nama, int semester, int usia, ArrayList<String> krs,
            ArrayList<Double> nilai, String asalSekolah, String asalUniv) {
        super(nim, nama, semester, usia, krs, nilai, asalSekolah);
        this.asalUniv = asalUniv;
        // TODO Auto-generated constructor stub
    }

    public boolean ikutOspek() {
        return false;
    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Universitas : " + asalUniv);
    }

}
