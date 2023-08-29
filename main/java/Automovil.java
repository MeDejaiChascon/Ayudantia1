public class Automovil extends Vehiculo{
    private int cantidadPuerta;

    public Automovil(String marca, String modelo,int cantidadPuertaAuto) {
        super(marca, modelo);
        this.cantidadPuerta = cantidadPuertaAuto;
    }

    @Override
    public String toString() {
        return "Automovil: " + "Marca:" + marca + " Modelo: " + modelo + " Cantidad Puertas: " + cantidadPuerta;
    }

    public int getCantidadPuerta() {
        return cantidadPuerta;
    }

    public void setCantidadPuerta(int cantidadPuerta) {
        this.cantidadPuerta = cantidadPuerta;
    }
}
