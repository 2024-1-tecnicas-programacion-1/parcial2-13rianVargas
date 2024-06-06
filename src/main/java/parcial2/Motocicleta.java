package parcial2;

public class Motocicleta extends Vehiculo{
    private TipoMotocicleta tipoMotocicleta;

    public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public String imprimirInformacion() {
        return getMarca() + " " + getModelo() + " " + getAño() + ", tipo de motocicleta: " + getTipoMotocicleta();
    }
    
}
