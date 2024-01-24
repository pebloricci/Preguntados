package Controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Modelo.modelo;
import Vista.vista;

public class controlador implements ActionListener {
    
    public modelo m1;
    public vista v1;

    public controlador(modelo m1, vista v1) {
        this.m1 = m1;
        this.v1 = v1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
