
public class Globo {

    private String Identificador;
    private int Capacidad;

    public Globo(String identificador, int capacidad) {
        this.Identificador = identificador;
        this.Capacidad = capacidad;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    @Override
    public String toString() {
        return "Identificador: " + Identificador + "\nCapacidad: " + Capacidad;
    }

}
