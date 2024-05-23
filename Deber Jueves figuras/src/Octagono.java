public class Octagono extends Figura {
    double distancia_lado;

    public Octagono() {
    }

    public Octagono(double distancia_lado) {
        this.distancia_lado = distancia_lado;
    }

    public double getDistancia_lado() {
        return distancia_lado;
    }

    public void setDistancia_lado(double distancia_lado) {
        this.distancia_lado = distancia_lado;
    }
    public double calcularArea() {
        return (calcularApotema() * calcularPerimetro()) / 2;
    }
    public double calcularApotema() {
        return distancia_lado / (2 * Math.tan(Math.PI / 8));
    }

    public double calcularPerimetro() {
        return 8 * distancia_lado;
    }
}