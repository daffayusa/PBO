import java.util.*;

public class MahasiswaDemo {
    public static void main(String[] args) {
        // Declare List untuk objek
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
        ArrayList<MahasiswaAktif> mhsAktif = new ArrayList<MahasiswaAktif>();
        ArrayList<MahasiswaLulus> mhsLulus = new ArrayList<MahasiswaLulus>();
        ArrayList<MahasiswaTransfer> mhsTf = new ArrayList<MahasiswaTransfer>();
        ArrayList<MahasiswaBaru> mhsBaru = new ArrayList<MahasiswaBaru>();

        Scanner input = new Scanner(System.in);
        String nama, nim, krsInput;
        int semester, usia, jmlMatkul;
        ArrayList<Double> nilai = new ArrayList<Double>();
        ArrayList<String> krs = new ArrayList<String>();
        double nilaiInput;
        int kategori;

        // input nama, nim, semester, usia, semester, dan kategori mhs
        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukkan nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan usia : ");
        usia = input.nextInt();
        System.out.print("Masukkan semester : ");
        semester = input.nextInt();

        // Pilih kategori mahasiswa
        System.out.println("===Kategori Mahasiswa===");
        System.out.println("1. Mahasiswa Aktif");
        System.out.println("2. Mahasiswa Lulus");
        System.out.println("3. Mahasiswa Baru");
        System.out.println("4. Mahasiswa Umum");
        System.out.print("Masukkan jenis kategori : ");
        kategori = input.nextInt();

        if (kategori == 1) {
            // Mahasiswa Aktif
            System.out.print("Masukkan jumlah matkul : ");
            jmlMatkul = input.nextInt();
            for (int n = 1; n <= jmlMatkul; n++) {
                System.out.print("Masukkan nilai " + n + " : ");
                nilaiInput = input.nextDouble();
                nilai.add(nilaiInput);
            }
            for (int n = 0; n <= jmlMatkul; n++) {
                System.out.print("Masukkan Matkul yang diambil : ");
                krsInput = input.nextLine();
                krs.add(krsInput);
            }

            mhsAktif.add(new MahasiswaAktif(nim, nama, semester, usia, krs, nilai));

            Iterator<MahasiswaAktif> iterator = mhsAktif.iterator();
            while (iterator.hasNext()) {
                MahasiswaAktif mahasiswa1 = iterator.next();
                mahasiswa1.infoMahasiswa();
                System.out.println("Rata-rata nilai : " + mahasiswa1.hitungRataNilai());
                System.out.print("KRS yang diambil : ");
                mahasiswa1.infoKrsMahasiswa();

            }
        } else if (kategori == 2) {
            // Mahasiswa Lulus
            int tahunWisuda;
            float ipk = 0;
            System.out.println("Masukkan tahun wisuda : ");
            tahunWisuda = input.nextInt();
            System.out.println("Masukkan Ipk");
            ipk = input.nextFloat();

            mhsLulus.add(new MahasiswaLulus(nim, nama, semester, usia, krs, nilai, tahunWisuda, ipk));
            Iterator<MahasiswaLulus> iterator = mhsLulus.iterator();
            while (iterator.hasNext()) {
                MahasiswaLulus mahasiswa1 = iterator.next();
                mahasiswa1.infoMahasiswa();
                System.out.println("Ikut Wisuda : " + mahasiswa1.ikutWisuda());
            }
        } else if (kategori == 3) {
            String asalSekolah = "";
            char kategori2;
            String asalUniv;
            Scanner Input2 = new Scanner(System.in);

            System.out.print("Apakah anda Mahasiswa Transfer('y'/'n') : ");
            kategori2 = input.next().charAt(1);

            if (kategori2 == 'y') {
                // Mahasiswa Transfer

                System.out.print("Masukkan asal Universitas : ");
                asalUniv = Input2.nextLine();

                mhsTf.add(new MahasiswaTransfer(nim, nama, semester, usia, krs, nilai, asalSekolah, asalUniv));
                Iterator<MahasiswaTransfer> iterator = mhsTf.iterator();
                while (iterator.hasNext()) {
                    MahasiswaTransfer mahasiswa1 = iterator.next();
                    mahasiswa1.infoMahasiswa();
                    System.out.println("Ikut Ospek : " + mahasiswa1.ikutOspek());
                }
            } else {
                // Mahasiswa baru

                System.out.print("Masukkan asal Sekolah : ");
                asalSekolah = Input2.nextLine();
                mhsBaru.add(new MahasiswaBaru(nim, nama, semester, usia, krs, nilai, asalSekolah));
                Iterator<MahasiswaBaru> iterator = mhsBaru.iterator();
                while (iterator.hasNext()) {
                    MahasiswaBaru mahasiswa1 = iterator.next();
                    mahasiswa1.infoMahasiswa();
                    System.out.println("Ikut Ospek : " + mahasiswa1.ikutOspek());
                }
            }
        } else {
            // Mahasiswa Umum
            System.out.print("Masukkan jumlah matkul : ");
            jmlMatkul = input.nextInt();
            for (int n = 1; n <= jmlMatkul; n++) {
                System.out.print("Masukkan nilai " + n + " : ");
                nilaiInput = input.nextDouble();
                nilai.add(nilaiInput);
            }
            for (int n = 0; n <= jmlMatkul; n++) {
                System.out.print("Masukkan Matkul yang diambil : ");
                krsInput = input.nextLine();
                krs.add(krsInput);
            }
            mahasiswa.add(new Mahasiswa(nim, nama, semester, usia, krs, nilai));

            Iterator<Mahasiswa> iterator = mahasiswa.iterator();
            while (iterator.hasNext()) {
                Mahasiswa mahasiswa1 = iterator.next();
                mahasiswa1.infoMahasiswa();

                System.out.println("Rata-rata nilai : " + mahasiswa1.hitungRataNilai());
                System.out.print("KRS yang diambil : ");
                mahasiswa1.infoKrsMahasiswa();
            }
        }

    }
}
