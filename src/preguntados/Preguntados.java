package preguntados;
import Controlador.Controlador;
import Modelo.Modelo;
import Vista.vista;

public class Preguntados {
    public static void main(String[] args) {
        vista v1 = new vista();
        Modelo m1 = new Modelo();
        Controlador c1 = new Controlador(m1, v1);
    }  
}
