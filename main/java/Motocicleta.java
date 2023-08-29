public class Motocicleta extends Vehiculo{
    private String disenio;
    public Motocicleta(String marca, String modelo, String disenio) {
        super(marca, modelo);
        this.disenio = disenio;
    }

    @Override
    public String toString() {
        return "Motocicleta: " + "Marca: " + marca + " Modelo: " + modelo + " Disenio='" + disenio;
    }

    public String getDisenio() {
        return disenio;
    }

    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }
}
