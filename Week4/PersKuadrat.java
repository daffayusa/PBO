public class PersKuadrat {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    private boolean fValid = false;
    private boolean fValid1 = false;

    public PersKuadrat(double a, double b, double c) {
        this.a = a;
        this.b = b;

        this.c = c;
        calcX();
    }

    private double calcDiscriminant() {
        return b * b - 4 * a * c;
    }

    private void calcX() {
        double d = calcDiscriminant();
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            fValid = true;
        } else if (d == 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            fValid1 = true;
        }
    }

    public boolean isValid() {
        return fValid;
    }

    public boolean isValid1() {
        return fValid1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public boolean isCorrect() {
        return false;
    }
}
