import java.util.Scanner;

public class PersKuadratDemo {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        String cek;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Input nilai a : ");
            a = inp.nextDouble();
            System.out.print("Input nilai b : ");
            b = inp.nextDouble();
            System.out.print("Input nilai c : ");
            c = inp.nextDouble();
            PersKuadrat s = new PersKuadrat(a, b, c);

            if (s.isCorrect()) {
                System.out.println("Persamaan " + s.getA() + "x^2" + " + " + s.getB() + "x " + "+ " + s.getC()
                        + " mempunyai akar " + s.getX1() + " atau " + s.getX2());
            } else if (s.isCorrect()) {
                System.out.println("Persamaan " + s.getA() + "x^2" + " + " + s.getB() + "x " + "+ " + s.getC()
                        + " mempunyai akar kembar yaitu " + s.getX1() + " atau " + s.getX2());
            } else if (s.isCorrect()) {
                System.out.println("Persamaan " + s.getA() + "x^2" + " + " + s.getB() + "x " + "+ " + s.getC()
                        + " mempunyai akar kembar yaitu " + s.getX1() + " atau " + s.getX2());
            } else {
                System.out.println("Persamaan " + s.getA() + "x^2" + " + " + s.getB() + "x " + "+ " + s.getC()
                        + " tidak mempunyai akar-akar rill/khayal (imajiner)");
            }

            System.out.println("");
            System.out.print("Input data lagi ? [Y/T] : ");
            cek = inp.next();
            System.out.println("");
        } while (cek.equalsIgnoreCase("Y"));

    }
}
