package Modelos;

public class CocheDeportivo extends Coche {
    public CocheDeportivo(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("El deportivo " + marca + " arranca con un rugido.");
    }
}
