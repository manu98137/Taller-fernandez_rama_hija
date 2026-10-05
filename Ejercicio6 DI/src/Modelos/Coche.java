package Modelos;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, int numPuertas) {
        super(marca);
        this.numPuertas = numPuertas;
    }

    @Override
    public void Diagnostico() {
        System.out.println("Realizando diagnóstico al coche de " + numPuertas + " puertas.");
    }
}