package OOP.figures;

public class Diamond extends Figures {
    private double e;
    private double f;
    private double a;

    public Diamond(String color, double e, double f) {
        super(color);
        this.e = e;
        this.f = f;

    }

    //przeciążanie konstruktora
    public Diamond(double a, String color) {
        super(color);
        this.a = a;
    }

    public double countArea() {
        return e * f;
    }
}
