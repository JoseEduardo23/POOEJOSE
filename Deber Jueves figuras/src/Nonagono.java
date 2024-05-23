public class Nonagono extends Figura{
    double distancia_lado;

    public Nonagono() {}

    public Nonagono(double distancia_lado) {
        this.distancia_lado = distancia_lado;
    }

    public double getDistancia_lado() {
        return distancia_lado;
    }

    public void setDistancia_lado(double distancia_lado) {
        this.distancia_lado = distancia_lado;
    }
    public double calcularApotema(){
        return distancia_lado / (2 * Math.tan(Math.PI / 9));
    }
    public double calcularArea(){
        return ((9*distancia_lado*calcularApotema())/2);
    }
    public double calcularPerimetro(){
        return 9*distancia_lado;
    }
}