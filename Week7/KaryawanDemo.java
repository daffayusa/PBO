public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan kar = new Karyawan();
        KaryawanTetap tetap = new KaryawanTetap();
        KaryawanKontrak kontrak = new KaryawanKontrak();

        kar.inputKar();
        if (kar.status == "tetap" || kar.status == "Tetap") {
            tetap.inputTetap();
            System.out.println("Gaji diterima : " + tetap.totalGaji());
        } else {
            kontrak.inputKontrak();
            System.out.println("Gaji diterima : " + kontrak.totalUpah());
        }
    }
}
