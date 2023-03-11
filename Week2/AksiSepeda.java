public class AksiSepeda {
    public static void main(String[] args) {
        // objek
        Sepeda sepeda1 = new Sepeda(2, "Sepeda Balap", "Polygon");

        // mengakses atribut dan method
        int gearSepeda = sepeda1.gear;
        System.out.println("Jumlah Gear " + gearSepeda);
        sepeda1.ngerem();
    }
}
