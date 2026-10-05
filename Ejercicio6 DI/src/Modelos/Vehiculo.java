package Modelos;

public abstract class Vehiculo implements Reparable {
    protected String nombre;

    public Vehiculo(String marca) {
        this.nombre = nombre;
    }

    public void arrancar() {
        System.out.println("El vehiculo" + nombre + " está arrancando.");
    }
}
