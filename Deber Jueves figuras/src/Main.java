public class Main {
    public static void main(String[] args) {
        Octagono figura5 = new Octagono(3.0);
        Nonagono figura6 = new Nonagono(4.0);
        Decagono figura7 = new Decagono(7.0);

        //Octagono
        System.out.println("El area del octagono es de: " + figura5.calcularArea() + "\n");
        System.out.println("El Perimetro del octagono es de: " + figura5.calcularPerimetro());
        System.out.println("------------------------------------------------------------------");

        //Nonagono
        System.out.println("El area del nonagono es de: " + figura6.calcularArea() + "\n");
        System.out.println("El Perimetro del nonagono es de: " + figura6.calcularPerimetro());
        System.out.println("------------------------------------------------------------------");

        //Decagono
        System.out.println("El area del decagono es de: " + figura7.calcularArea() + "\n");
        System.out.println("El Perimetro del decagono es de: " + figura7.calcularPerimetro());
        System.out.println("------------------------------------------------------------------");
    }
}
