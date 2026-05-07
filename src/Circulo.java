public class Circulo extends Punto {
    public static final double PI = 3.141592;
    private int radio;

    public Circulo(int x, int y,int r) {
        super(x,y);
        radio = r;
    }

    public void setRadio (int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    public String toString() {
        return super.toString() + ", radio= " + radio;
    }
}
