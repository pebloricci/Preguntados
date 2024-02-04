package Controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import Modelo.Modelo;
import Vista.vista;
import javax.swing.ImageIcon;


public class Controlador implements ActionListener {
    
    public Modelo m1;
    public vista v1;
    public Random random = new Random();

    public Controlador(Modelo m1, vista v1) {
        this.m1 = m1;
        this.v1 = v1;
        v1.setTitle("Preguntados");
        v1.setVisible(true);
        v1.jPanelQuienEmpieza.setVisible(false);
        v1.jPanelJuego.setVisible(false);
        v1.jButtonJUGAR.addActionListener(this);
        v1.jButtonSALIR.addActionListener(this);
        v1.jButtonJugador1.addActionListener(this);
        v1.jButtonJugador2.addActionListener(this);
        v1.jButtonAlAzar.addActionListener(this);
        v1.jButtonSiguientePregunta.addActionListener(this);
        v1.jButtonRespuesta1.addActionListener(this);
        v1.jButtonRespuesta2.addActionListener(this);
        v1.jButtonRespuesta3.addActionListener(this);
        v1.jButtonRespuesta4.addActionListener(this);
        v1.jButtonRespuesta1.setEnabled(false);
        v1.jButtonRespuesta2.setEnabled(false);
        v1.jButtonRespuesta3.setEnabled(false);
        v1.jButtonRespuesta4.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //MENU PRINCIPAL - JUGAR O SALIR
        if (ae.getSource().equals(v1.jButtonJUGAR)){
            v1.jPanelMenu.setVisible(false);
            v1.jPanelQuienEmpieza.setVisible(true);  
            v1.jLabelResultado.setText("");
            m1.setPuntajeJ1(0);
            m1.setPuntajeJ2(0);
            v1.jLabelPuntajeJ1.setText("0/5");
            v1.jLabelPuntajeJ2.setText("0/5");
            v1.jButtonRespuesta1.setText("");
            v1.jButtonRespuesta2.setText("");
            v1.jButtonRespuesta3.setText("");
            v1.jButtonRespuesta4.setText("");
            v1.jLabelPregunta.setText("");
            v1.jLabelTextoCategoria.setText("");
            v1.jLabelimagenCategoria.setIcon(null);
            v1.jLabelinstruccionRuleta.setText("Toca la ruleta para ver la siguiente pregunta.");
            v1.jButtonSiguientePregunta.setEnabled(true);
        }else if(ae.getSource().equals(v1.jButtonSALIR)){
            v1.setVisible(false);
            v1.dispose();
        }
        //MENU QUIEN EMPIEZA - J1, J2 O AL AZAR
        if (ae.getSource().equals(v1.jButtonJugador1)){
            v1.jPanelQuienEmpieza.setVisible(false);   
            v1.jPanelJuego.setVisible(true); 
            m1.setJjugando(0);
        }    
        if (ae.getSource().equals(v1.jButtonJugador2)){
            v1.jPanelQuienEmpieza.setVisible(false);   
            v1.jPanelJuego.setVisible(true);    
            m1.setJjugando(1);
        }    
        if (ae.getSource().equals(v1.jButtonAlAzar)){
            v1.jPanelQuienEmpieza.setVisible(false);   
            v1.jPanelJuego.setVisible(true);     
            m1.setJjugando(random.nextInt((1-0)+1)+0);
        }
        //MENU DE JUEGO       
        if (ae.getSource().equals(v1.jButtonSiguientePregunta)){
            v1.jButtonRespuesta1.setEnabled(true);
            v1.jButtonRespuesta2.setEnabled(true);
            v1.jButtonRespuesta3.setEnabled(true);
            v1.jButtonRespuesta4.setEnabled(true);    
            v1.jLabelResultado.setText("");
            v1.jButtonSiguientePregunta.setEnabled(false);
            m1.setCategoriaAzar(random.nextInt((5-0)+1)+0);
            m1.setN(random.nextInt((2-0)+1)+0);
            distribuirPreguntas(m1.getCategoriaAzar(), m1.getN());            
        }
        
        int radioButtonElegido = 0;           
        if (ae.getSource().equals(v1.jButtonRespuesta1)){
            radioButtonElegido = 1;
            m1.respuestaCorrectaIncorrecta(radioButtonElegido, m1.getCategoriaAzar(), m1.getN(), v1, m1);
            v1.jButtonSiguientePregunta.setEnabled(true);
            v1.jButtonRespuesta1.setEnabled(false);
            v1.jButtonRespuesta2.setEnabled(false);
            v1.jButtonRespuesta3.setEnabled(false);
            v1.jButtonRespuesta4.setEnabled(false); 
            m1.ganador(m1, v1);
        }
        if (ae.getSource().equals(v1.jButtonRespuesta2)){
            radioButtonElegido = 2;
            m1.respuestaCorrectaIncorrecta(radioButtonElegido, m1.getCategoriaAzar(), m1.getN(), v1, m1); 
            v1.jButtonSiguientePregunta.setEnabled(true);
            v1.jButtonRespuesta1.setEnabled(false);
            v1.jButtonRespuesta2.setEnabled(false);
            v1.jButtonRespuesta3.setEnabled(false);
            v1.jButtonRespuesta4.setEnabled(false); 
            m1.ganador(m1, v1);
        }
        if (ae.getSource().equals(v1.jButtonRespuesta3)){
            radioButtonElegido = 3;
            m1.respuestaCorrectaIncorrecta(radioButtonElegido, m1.getCategoriaAzar(), m1.getN(), v1, m1); 
            v1.jButtonSiguientePregunta.setEnabled(true);
            v1.jButtonRespuesta1.setEnabled(false);
            v1.jButtonRespuesta2.setEnabled(false);
            v1.jButtonRespuesta3.setEnabled(false);
            v1.jButtonRespuesta4.setEnabled(false);             
            m1.ganador(m1, v1);
        }
        if (ae.getSource().equals(v1.jButtonRespuesta4)){
            radioButtonElegido = 4;
            m1.respuestaCorrectaIncorrecta(radioButtonElegido, m1.getCategoriaAzar(), m1.getN(), v1, m1); 
            v1.jButtonSiguientePregunta.setEnabled(true);
            v1.jButtonRespuesta1.setEnabled(false);
            v1.jButtonRespuesta2.setEnabled(false);
            v1.jButtonRespuesta3.setEnabled(false);
            v1.jButtonRespuesta4.setEnabled(false);             
            m1.ganador(m1, v1);
        }
        
        if (m1.getPuntajeJ1() == 5 || m1.getPuntajeJ2() == 5){
            if(ae.getSource().equals(v1.jButtonSiguientePregunta)){
                v1.jPanelJuego.setVisible(false);
                v1.jPanelMenu.setVisible(true);                
            }
        }
    }    
    
    //Codigo para distribuir las preguntas y respuestas.
    public void distribuirPreguntas(int CategoriaAzar, int n){
        
        int m = random.nextInt((3-0)+1)+0;

        switch(CategoriaAzar){
            case 0:
                /////////////////// CIENCIA /////////////////// 
                v1.jLabelPregunta.setText(m1.preguntasCiencia[n].getPregunta());
                v1.jLabelTextoCategoria.setText("Categoría: " + m1.preguntasCiencia[n].getCategoria());
                ImageIcon imgIcon1 = new ImageIcon(getClass().getResource("/Imagenes/ciencia1.png"));
                v1.jLabelimagenCategoria.setIcon(imgIcon1);
                switch(m){
                    case 0:
                        v1.jButtonRespuesta1.setText(m1.preguntasCiencia[n].getRespuestaCorrecta());  
                        v1.jButtonRespuesta2.setText(m1.preguntasCiencia[n].respuestasIncorrectas[0]);    
                        v1.jButtonRespuesta3.setText(m1.preguntasCiencia[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasCiencia[n].respuestasIncorrectas[2]);
                        break;
                    case 1:
                        v1.jButtonRespuesta1.setText(m1.preguntasCiencia[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasCiencia[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta3.setText(m1.preguntasCiencia[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasCiencia[n].respuestasIncorrectas[2]);
                        break;
                    case 2:
                        v1.jButtonRespuesta1.setText(m1.preguntasCiencia[n].respuestasIncorrectas[1]);                        
                        v1.jButtonRespuesta2.setText(m1.preguntasCiencia[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta3.setText(m1.preguntasCiencia[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta4.setText(m1.preguntasCiencia[n].respuestasIncorrectas[2]);
                        break;
                    case 3:
                        v1.jButtonRespuesta1.setText(m1.preguntasCiencia[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasCiencia[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta3.setText(m1.preguntasCiencia[n].respuestasIncorrectas[2]);
                        v1.jButtonRespuesta4.setText(m1.preguntasCiencia[n].getRespuestaCorrecta());
                        break;    
                }
                break;
            case 1:
                /////////////////// HISTORIA ///////////////////
                v1.jLabelPregunta.setText(m1.preguntasHistoria[n].getPregunta());
                v1.jLabelTextoCategoria.setText("Categoría: " + m1.preguntasHistoria[n].getCategoria());
                ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/Imagenes/historia1.png"));
                v1.jLabelimagenCategoria.setIcon(imgIcon2);
                switch(m){
                    case 0:
                        v1.jButtonRespuesta1.setText(m1.preguntasHistoria[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta2.setText(m1.preguntasHistoria[n].respuestasIncorrectas[0]);    
                        v1.jButtonRespuesta3.setText(m1.preguntasHistoria[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasHistoria[n].respuestasIncorrectas[2]);
                        break;
                    case 1:
                        v1.jButtonRespuesta1.setText(m1.preguntasHistoria[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasHistoria[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta3.setText(m1.preguntasHistoria[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasHistoria[n].respuestasIncorrectas[2]);
                        break;
                    case 2:
                        v1.jButtonRespuesta1.setText(m1.preguntasHistoria[n].respuestasIncorrectas[1]);                        
                        v1.jButtonRespuesta2.setText(m1.preguntasHistoria[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta3.setText(m1.preguntasHistoria[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta4.setText(m1.preguntasHistoria[n].respuestasIncorrectas[2]);
                        break;
                    case 3:
                        v1.jButtonRespuesta1.setText(m1.preguntasHistoria[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasHistoria[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta3.setText(m1.preguntasHistoria[n].respuestasIncorrectas[2]);
                        v1.jButtonRespuesta4.setText(m1.preguntasHistoria[n].getRespuestaCorrecta());
                        break;
                }
                break;  
            case 2:
                /////////////////// GEOGRAFIA ///////////////////
                v1.jLabelPregunta.setText(m1.preguntasGeografia[n].getPregunta());
                v1.jLabelTextoCategoria.setText("Categoría: " + m1.preguntasGeografia[n].getCategoria());
                ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/Imagenes/geografia1.png"));
                v1.jLabelimagenCategoria.setIcon(imgIcon3);
                switch(m){
                    case 0:
                        v1.jButtonRespuesta1.setText(m1.preguntasGeografia[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta2.setText(m1.preguntasGeografia[n].respuestasIncorrectas[0]);    
                        v1.jButtonRespuesta3.setText(m1.preguntasGeografia[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasGeografia[n].respuestasIncorrectas[2]);
                        break;
                    case 1:
                        v1.jButtonRespuesta1.setText(m1.preguntasGeografia[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasGeografia[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta3.setText(m1.preguntasGeografia[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasGeografia[n].respuestasIncorrectas[2]);
                        break;
                    case 2:
                        v1.jButtonRespuesta1.setText(m1.preguntasGeografia[n].respuestasIncorrectas[1]);                        
                        v1.jButtonRespuesta2.setText(m1.preguntasGeografia[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta3.setText(m1.preguntasGeografia[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta4.setText(m1.preguntasGeografia[n].respuestasIncorrectas[2]);
                        break;
                    case 3:
                        v1.jButtonRespuesta1.setText(m1.preguntasGeografia[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasGeografia[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta3.setText(m1.preguntasGeografia[n].respuestasIncorrectas[2]);
                        v1.jButtonRespuesta4.setText(m1.preguntasGeografia[n].getRespuestaCorrecta());
                        break;
                }
                break;  
            case 3:
                /////////////////// DEPORTES ///////////////////
                v1.jLabelPregunta.setText(m1.preguntasDeportes[n].getPregunta());
                v1.jLabelTextoCategoria.setText("Categoría: " + m1.preguntasDeportes[n].getCategoria());
                ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/Imagenes/deportes1.png"));
                v1.jLabelimagenCategoria.setIcon(imgIcon4);
                switch(m){
                    case 0:
                        v1.jButtonRespuesta1.setText(m1.preguntasDeportes[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta2.setText(m1.preguntasDeportes[n].respuestasIncorrectas[0]);    
                        v1.jButtonRespuesta3.setText(m1.preguntasDeportes[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasDeportes[n].respuestasIncorrectas[2]);
                        break;
                    case 1:
                        v1.jButtonRespuesta1.setText(m1.preguntasDeportes[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasDeportes[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta3.setText(m1.preguntasDeportes[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasDeportes[n].respuestasIncorrectas[2]);
                        break;
                    case 2:
                        v1.jButtonRespuesta1.setText(m1.preguntasDeportes[n].respuestasIncorrectas[1]);                        
                        v1.jButtonRespuesta2.setText(m1.preguntasDeportes[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta3.setText(m1.preguntasDeportes[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta4.setText(m1.preguntasDeportes[n].respuestasIncorrectas[2]);
                        break;
                    case 3:
                        v1.jButtonRespuesta1.setText(m1.preguntasDeportes[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasDeportes[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta3.setText(m1.preguntasDeportes[n].respuestasIncorrectas[2]);
                        v1.jButtonRespuesta4.setText(m1.preguntasDeportes[n].getRespuestaCorrecta());
                        break;
                }
                break;   
            case 4:
                /////////////////// ENTRETENIMIENTO ///////////////////
                v1.jLabelPregunta.setText(m1.preguntasEntretenimiento[n].getPregunta());
                v1.jLabelTextoCategoria.setText("Categoría: " + m1.preguntasEntretenimiento[n].getCategoria());
                ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/entretenimiento1.png"));
                v1.jLabelimagenCategoria.setIcon(imgIcon5);
                switch(m){
                    case 0:
                        v1.jButtonRespuesta1.setText(m1.preguntasEntretenimiento[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta2.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[0]);    
                        v1.jButtonRespuesta3.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[2]);
                        break;
                    case 1:
                        v1.jButtonRespuesta1.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasEntretenimiento[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta3.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[2]);
                        break;
                    case 2:
                        v1.jButtonRespuesta1.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[1]);                        
                        v1.jButtonRespuesta2.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta3.setText(m1.preguntasEntretenimiento[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta4.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[2]);
                        break;
                    case 3:
                        v1.jButtonRespuesta1.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta3.setText(m1.preguntasEntretenimiento[n].respuestasIncorrectas[2]);
                        v1.jButtonRespuesta4.setText(m1.preguntasEntretenimiento[n].getRespuestaCorrecta());
                        break;
                }
                break; 
            case 5:
                /////////////////// ARTE ///////////////////
                v1.jLabelPregunta.setText(m1.preguntasArte[n].getPregunta());
                v1.jLabelTextoCategoria.setText("Categoría: " + m1.preguntasArte[n].getCategoria());
                ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/Imagenes/arte1.png"));
                v1.jLabelimagenCategoria.setIcon(imgIcon6);
                switch(m){
                    case 0:
                        v1.jButtonRespuesta1.setText(m1.preguntasArte[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta2.setText(m1.preguntasArte[n].respuestasIncorrectas[0]);    
                        v1.jButtonRespuesta3.setText(m1.preguntasArte[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasArte[n].respuestasIncorrectas[2]);
                        break;
                    case 1:
                        v1.jButtonRespuesta1.setText(m1.preguntasArte[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasArte[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta3.setText(m1.preguntasArte[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta4.setText(m1.preguntasArte[n].respuestasIncorrectas[2]);
                        break;
                    case 2:
                        v1.jButtonRespuesta1.setText(m1.preguntasArte[n].respuestasIncorrectas[1]);                        
                        v1.jButtonRespuesta2.setText(m1.preguntasArte[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta3.setText(m1.preguntasArte[n].getRespuestaCorrecta());
                        v1.jButtonRespuesta4.setText(m1.preguntasArte[n].respuestasIncorrectas[2]);
                        break;
                    case 3:
                        v1.jButtonRespuesta1.setText(m1.preguntasArte[n].respuestasIncorrectas[0]);
                        v1.jButtonRespuesta2.setText(m1.preguntasArte[n].respuestasIncorrectas[1]);
                        v1.jButtonRespuesta3.setText(m1.preguntasArte[n].respuestasIncorrectas[2]);
                        v1.jButtonRespuesta4.setText(m1.preguntasArte[n].getRespuestaCorrecta());
                        break;
                }
                break;                 
        }
                ////////////////////////////////////////////////////////////////////    
                ///////////////////////// FIN SUBALGORITMO /////////////////////////  
                //////////////////////////////////////////////////////////////////// 
    }
}