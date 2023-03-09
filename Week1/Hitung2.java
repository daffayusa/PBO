public class Hitung2 {
    public static void main(String[] args) {
        // Menghitung keliling lingkaran
        float diameter = 10;
        float phi = 3.14f;
        float keliling = phi * diameter;
        System.out.println("Hasil keliling dari lingkarang berdiameter " + diameter + " adalah " + keliling + "\n");

        // Menghitung Luas segitiga siku-siku
        int alas = 6, tinggi = 8;
        int luas = (alas * tinggi) / 2;
        System.out.println("Hasil Luas dari Segitiga siku - siku dengan alas " + alas + " dan tingi " + tinggi
                + " adalah " + luas + "\n");

        // Menghitung volume tabung
        float diameter2 = 5, tinggi2 = 10;
        float volume = (phi * ((diameter2 / 2) * (diameter2 / 2)) * tinggi2);
        System.out.println("Hasil volume dari tabung dengan  diameter alas " + diameter2 + " dan tingi " + tinggi2
                + " adalah " + volume + "\n");
    }
}
