package Modelos;

public class Coche implements Vehiculo {
    protected String marca;

    public Coche(String marca) {
        this.marca = marca;
    }

    public void arrancar() {
        System.out.println("El coche " + marca + " está arrancando.");
    }
}
