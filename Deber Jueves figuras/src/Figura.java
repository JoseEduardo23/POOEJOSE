public class Figura {
    String nombre;
    int nlados;

    public Figura() {}

    public Figura(String nombre, int nlados) {
        this.nombre = nombre;
        this.nlados = nlados;
    }

    public int getNlados() {
        return nlados;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
