import parcial2.Automovil;
import parcial2.Motocicleta;
import parcial2.TipoCombustible;
import parcial2.TipoMotocicleta;
import parcial2.Vehiculo;

public class Principal {
    public static void main(String[] args) {
        Vehiculo Vehiculo = new Vehiculo("Niu", "Qi3", 2020); 
        Automovil Automovil = new Automovil("Tesla", "X", 2024, 4, TipoCombustible.ELECTRICO);
        Motocicleta Motocicleta = new Motocicleta("Yamaha", "R3", 2023, TipoMotocicleta.DEPORTIVA);
        
        System.out.println(Vehiculo.imprimirInformacion());
        System.out.println(Automovil.imprimirInformacion());
        System.out.println(Motocicleta.imprimirInformacion());
    }
}
