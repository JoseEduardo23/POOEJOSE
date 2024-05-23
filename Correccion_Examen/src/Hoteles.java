import java.util.Scanner;
public class Hoteles {
    String nombre;
    String Direccion;
    int Estrellas;
    int Num_habitaciones;
    float precio;

    public Hoteles() {}

    public Hoteles(String nombre, String direccion, int estrellas, int num_habitaciones, float precio) {
        this.nombre = nombre;
        Direccion = direccion;
        Estrellas = estrellas;
        Num_habitaciones = num_habitaciones;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getEstrellas() {
        return Estrellas;
    }

    public void setEstrellas(int estrellas) {
        Estrellas = estrellas;
    }

    public int getNum_habitaciones() {
        return Num_habitaciones;
    }

    public void setNum_habitaciones(int num_habitaciones) {
        Num_habitaciones = num_habitaciones;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    public void metodoImprimir(){
         System.out.println("Nombre: " + this.getNombre() + " Direccion: " + this.getDireccion() + " Estrellas: " + this.getEstrellas() + " Numero de Habitaciones: " + this.getNum_habitaciones() + "Precio" + this.getPrecio());
     }

     public void editarObjetos(){
         Scanner sc=new Scanner(System.in);
         System.out.print("Nuevo nombre del hotel: ");
         this.nombre =  sc.nextLine();
         System.out.print("Nueva direccion: ");
         this.Direccion = sc.nextLine();
         System.out.print("Cantidad de estrellas: ");
         this.Estrellas = sc.nextInt();
         System.out.print("Numero de habitaciones del hotel: ");//michelle
         this.Num_habitaciones = sc.nextInt();
         System.out.println("Ingrese el precio: ");
         this.precio = sc.nextFloat();

     }
    public void editarObjetosNull() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nuevo nombre del hotel: ");
        this.nombre = sc.nextLine();
        System.out.print("Nueva dirección: ");
        this.Direccion = sc.nextLine();
        System.out.print("Cantidad de estrellas: ");
        this.Estrellas = sc.nextInt();
        System.out.print("Numero de habitaciones del hotel: ");
        this.Num_habitaciones = sc.nextInt();
        System.out.print("Ingrese el precio: ");
        this.precio = sc.nextFloat();
        metodoImprimir(); //Bienvenidos
    }
 }

