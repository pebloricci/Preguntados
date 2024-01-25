package Controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Modelo.Modelo;
import Vista.vista;

public class Controlador implements ActionListener {
    
    public Modelo m1;
    public vista v1;

    public Controlador(Modelo m1, vista v1) {
        this.m1 = m1;
        this.v1 = v1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
