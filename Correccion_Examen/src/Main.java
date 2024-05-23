import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Crear 5 instancias dentro del main
        Hoteles hotel1 = new Hoteles("Sheraton Quito Hotel", "Av. Naciones Unidas y Republica", 5 , 136 , 140 );
        Hoteles hotel2 = new Hoteles("Hotel Quito", "Av. González Suárez N27-142", 5, 215,120);
        Hoteles hotel3 = new Hoteles("Swissotel", "Av. 12 de Octubre 1820", 5, 275, 150);
        Hoteles hotel4 = new Hoteles("JW Marriott Hotel","Orellana E2-28", 5, 257 , 180 );
        Hoteles hotel5 = new Hoteles("Hilton Colon", "Av. Patria avenida Amazonas", 5 , 255, 160);

        //Crear objeto hotel 6
        Hoteles hotel6 = new Hoteles();
        hotel6.setNombre("Hotel 6");
        hotel6.setDireccion("Av. Colón");
        hotel6.setEstrellas(5);
        hotel6.setNum_habitaciones(275);
        hotel6.setPrecio(150);

        //Crear otro objeto hotel 7
        Hoteles hotel7 = new Hoteles();
        hotel6.setNombre("Hotel 7");
        hotel6.setDireccion("Av. Pedro Moncayo");
        hotel6.setEstrellas(5);
        hotel6.setNum_habitaciones(105);
        hotel6.setPrecio(250);

        //imprimir todos los objetos
        hotel1.metodoImprimir();
        hotel2.metodoImprimir();
        hotel3.metodoImprimir();
        hotel4.metodoImprimir();
        hotel5.metodoImprimir();
        hotel6.metodoImprimir();
        hotel7.metodoImprimir();

        //Modificar todos los atributos de tres objetos e imprimirlos
        hotel1.editarObjetosNull();
        hotel3.editarObjetosNull();
        hotel5.editarObjetosNull();
   }
}

