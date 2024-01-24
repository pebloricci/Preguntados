package preguntados;
import Controlador.controlador;
import Modelo.modelo;
import Vista.vista;

public class Preguntados {
    public static void main(String[] args) {
        vista v1 = new vista();
        modelo m1 = new modelo();
        controlador c1 = new controlador(m1, v1);
    }  
}
