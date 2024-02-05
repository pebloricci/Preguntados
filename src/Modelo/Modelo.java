package Modelo;
import Vista.vista;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Modelo {

    public Pregunta[] preguntasCiencia = new Pregunta[3];
    public Pregunta[] preguntasHistoria = new Pregunta[3];
    public Pregunta[] preguntasGeografia = new Pregunta[3];
    public Pregunta[] preguntasDeportes = new Pregunta[3];
    public Pregunta[] preguntasEntretenimiento = new Pregunta[3];
    public Pregunta[] preguntasArte = new Pregunta[3];
    
    public Random random = new Random();
    
    private int puntajeJ1;
    private int puntajeJ2;
    private int Jjugando;
    private int categoriaAzar;
    private int n;

    public int getPuntajeJ1() {
        return puntajeJ1;
    }

    public void setPuntajeJ1(int puntajeJ1) {
        this.puntajeJ1 = puntajeJ1;
    }

    public int getPuntajeJ2() {
        return puntajeJ2;
    }

    public void setPuntajeJ2(int puntajeJ2) {
        this.puntajeJ2 = puntajeJ2;
    }

    public int getJjugando() {
        return Jjugando;
    }

    public void setJjugando(int Jjugando) {
        this.Jjugando = Jjugando;
    }

    public int getCategoriaAzar() {
        return categoriaAzar;
    }

    public void setCategoriaAzar(int categoriaAzar) {
        this.categoriaAzar = categoriaAzar;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
    
    public void respuestaCorrectaIncorrecta(int radioButtonElegido, int CategoriaAzar, int n, vista v1, Modelo m1){
        
        switch(radioButtonElegido){
            case 1:
                switch(CategoriaAzar){
                    case 0:
                        if(v1.jButtonRespuesta1.getText() == m1.preguntasCiencia[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 1:
                        if(v1.jButtonRespuesta1.getText() == m1.preguntasHistoria[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 2:
                        if(v1.jButtonRespuesta1.getText() == m1.preguntasGeografia[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 3:
                        if(v1.jButtonRespuesta1.getText() == m1.preguntasDeportes[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        } 
                        break;
                    case 4:
                        if(v1.jButtonRespuesta1.getText() == m1.preguntasEntretenimiento[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 5:
                        if(v1.jButtonRespuesta1.getText() == m1.preguntasArte[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        } 
                        break;
                }
                break;    
            case 2:
                switch(CategoriaAzar){
                    case 0:
                        if(v1.jButtonRespuesta2.getText() == m1.preguntasCiencia[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 1:
                        if(v1.jButtonRespuesta2.getText() == m1.preguntasHistoria[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 2:
                        if(v1.jButtonRespuesta2.getText() == m1.preguntasGeografia[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 3:
                        if(v1.jButtonRespuesta2.getText() == m1.preguntasDeportes[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        } 
                        break;
                    case 4:
                        if(v1.jButtonRespuesta2.getText() == m1.preguntasEntretenimiento[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 5:
                        if(v1.jButtonRespuesta2.getText() == m1.preguntasArte[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        } 
                        break;
                }
                break;
            case 3:
                switch(CategoriaAzar){
                    case 0:
                        if(v1.jButtonRespuesta3.getText() == m1.preguntasCiencia[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 1:
                        if(v1.jButtonRespuesta3.getText() == m1.preguntasHistoria[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 2:
                        if(v1.jButtonRespuesta3.getText() == m1.preguntasGeografia[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 3:
                        if(v1.jButtonRespuesta3.getText() == m1.preguntasDeportes[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        } 
                        break;
                    case 4:
                        if(v1.jButtonRespuesta3.getText() == m1.preguntasEntretenimiento[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 5:
                        if(v1.jButtonRespuesta3.getText() == m1.preguntasArte[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        } 
                        break;
                }
                break;                
            case 4:
                switch(CategoriaAzar){
                    case 0:
                        if(v1.jButtonRespuesta4.getText() == m1.preguntasCiencia[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 1:
                        if(v1.jButtonRespuesta4.getText() == m1.preguntasHistoria[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 2:
                        if(v1.jButtonRespuesta4.getText() == m1.preguntasGeografia[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 3:
                        if(v1.jButtonRespuesta4.getText() == m1.preguntasDeportes[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        } 
                        break;
                    case 4:
                        if(v1.jButtonRespuesta4.getText() == m1.preguntasEntretenimiento[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        }
                        break;
                    case 5:
                        if(v1.jButtonRespuesta4.getText() == m1.preguntasArte[n].getRespuestaCorrecta()){
                            v1.jLabelResultado.setText("¡RESPUESTA CORRECTA!");
                            cambiarPuntajeJugadorX(m1.Jjugando, m1, v1);
                        }else{
                            v1.jLabelResultado.setText("¡RESPUESTA INCORRECTA!");
                            cambiarJjugando(m1);
                        } 
                        break;
                }
                break;                
        }
    }
    
    //Este codigo va al final de una ronda, cuando alguien gana.
    public void cambiarPuntajeJugadorX(int Jjugando, Modelo m1, vista v1){
        switch (Jjugando){
            case 0:
                m1.setPuntajeJ1(puntajeJ1 + 1);
                v1.jLabelPuntajeJ1.setText(m1.getPuntajeJ1() + "/5");
                break;
            case 1:
                m1.setPuntajeJ2(puntajeJ2 + 1);
                v1.jLabelPuntajeJ2.setText(m1.getPuntajeJ2() + "/5");
                break;
        }
    } 
    
    public void cambiarJjugando(Modelo m1){
        if (m1.getJjugando() == 0){
            m1.setJjugando(1);
        }else if(m1.getJjugando() == 1){
            m1.setJjugando(0);
        }
    }
    
    public void ganador (Modelo m1, vista v1){
        if (m1.puntajeJ1 == 5){
            v1.jLabelResultado.setText("¡JUGADOR 1 HA GANADO!");
            registrarGanador(m1);
            limpiar(v1);
        }
        if (m1.puntajeJ2 == 5){
            v1.jLabelResultado.setText("¡JUGADOR 2 HA GANADO!");
            registrarGanador(m1);
            limpiar(v1);
        }        
    }
    
    public void registrarGanador(Modelo m1){
        String nombreArchivo = "./registroGanadores.txt";
        // Obtener la fecha y hora actual
        LocalDateTime now = LocalDateTime.now();
        // Formatear la fecha y hora como una cadena
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        String contenido = "Jugador: " + (m1.getJjugando()+1) + " (Horario: " + formattedDateTime + ")." ;
        try {
            File archivo = new File(nombreArchivo);
            
            // Verificar si el archivo ya existe
            if (archivo.exists()) {
                System.out.println("El archivo ya existe. Agregando texto...");

                // Agregar texto al archivo existente
                try (FileWriter escritor = new FileWriter(archivo, true)) {
                    escritor.write(contenido + "\n");
                    System.out.println("Texto agregado con exito.");
                } catch (IOException ex) {
                    System.out.println("Error al agregar texto al archivo: " + ex.getMessage());
                }
            } else {
                // El archivo no existe, crearlo
                System.out.println("El archivo no existe. Creándolo...");

                try {
                    archivo.createNewFile();

                    // Puedes agregar código aquí para escribir contenido inicial en el archivo si es necesario
                    try (FileWriter escritor = new FileWriter(archivo)) {
                        escritor.write(contenido + "\n");
                        System.out.println("Archivo creado con éxito.");
                    } catch (IOException ex) {
                        System.out.println("Error al escribir contenido inicial en el archivo: " + ex.getMessage());
                    }
                } catch (IOException ex) {
                    System.out.println("Error al crear el archivo: " + ex.getMessage());
                }
            }

            // Leer contenido del archivo
            try (Scanner scanner = new Scanner(archivo)) {
                while (scanner.hasNextLine()) {
                    String linea = scanner.nextLine();
                    System.out.println(linea);
                }
            } catch (IOException ex) {
                System.out.println("Error al leer el archivo: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
    
    public void limpiar (vista v1){
        v1.jButtonRespuesta1.setText("");
        v1.jButtonRespuesta2.setText("");
        v1.jButtonRespuesta3.setText("");
        v1.jButtonRespuesta4.setText("");
        v1.jLabelPregunta.setText("");
        v1.jLabelTextoCategoria.setText("");
        v1.jLabelimagenCategoria.setIcon(null);
        v1.jLabelinstruccionRuleta.setText("Toca la ruleta para volver al menu.");
    }
    public Modelo(){
        
        //Ciencia: preguntas, categoria, y respuestas.
        Pregunta PreguntaCiencia1 = new Pregunta("Ciencia", "¿Cuál es la función principal de las mitocondrias en una célula?", "Generar energía");
        PreguntaCiencia1.setRespuestasIncorrectas("Almacenar agua", "Sintetizar proteínas", "Regular la temperatura");
                
        Pregunta PreguntaCiencia2 = new Pregunta("Ciencia", "¿Cuál es la galaxia más cercana a la Vía Láctea?", "Andrómeda");
        PreguntaCiencia2.setRespuestasIncorrectas("Jupiter", "Alfa Centauri", "Venus");
                
        Pregunta PreguntaCiencia3 = new Pregunta("Ciencia", "¿Cuál es el símbolo químico del agua?", "H2O");
        PreguntaCiencia3.setRespuestasIncorrectas("O2", "CO2", "Br");
         
        preguntasCiencia[0] = PreguntaCiencia1;
        preguntasCiencia[1] = PreguntaCiencia2;
        preguntasCiencia[2] = PreguntaCiencia3;
                
        //Historia: preguntas, categoria, y respuestas.
        Pregunta PreguntaHistoria1 = new Pregunta("Historia", "¿Qué evento histórico marcó el inicio de la Edad Media en Europa?", "Caida del Impero Romano de Occidente");
        PreguntaHistoria1.setRespuestasIncorrectas("Descubrimiento de América", "Revolución Industrial", "Las Cruzadas");
                
        Pregunta PreguntaHistoria2 = new Pregunta("Historia", "¿En qué año comenzó la Segunda Guerra Mundial?", "1939");
        PreguntaHistoria2.setRespuestasIncorrectas("1945", "1952", "1933");
                
        Pregunta PreguntaHistoria3 = new Pregunta("Historia", "¿Cuál fue la causa principal que desencadenó la Revolución Francesa en 1789?", "Descontento social y económico ");
        PreguntaHistoria3.setRespuestasIncorrectas("Altos impuestos al té", "Escasez de petróleo", "El asesinato del archiduque de Austria");
                
        preguntasHistoria[0] = PreguntaHistoria1;
        preguntasHistoria[1] = PreguntaHistoria2;
        preguntasHistoria[2] = PreguntaHistoria3; 
                
        //Geografia: preguntas, categoria, y respuestas.
        Pregunta PreguntaGeografia1 = new Pregunta("Geografia", "¿Cuál es la capital de Australia?", "Canberra");
        PreguntaGeografia1.setRespuestasIncorrectas("Sídney", "Wellington", "Auckland");
                
        Pregunta PreguntaGeografia2 = new Pregunta("Geografia", "¿Cuál es el río más largo del mundo?", "Nilo");
        PreguntaGeografia2.setRespuestasIncorrectas("De la Plata", "Amazonas", "Misisipi");
                
        Pregunta PreguntaGeografia3 = new Pregunta("Geografia", "¿Cuál es la cordillera más larga del mundo?", "Cordillera de los Andes");
        PreguntaGeografia3.setRespuestasIncorrectas("Himalayas", "Montes Urales", "Montañas Rocosas");
                
        preguntasGeografia[0] = PreguntaGeografia1;
        preguntasGeografia[1] = PreguntaGeografia2;
        preguntasGeografia[2] = PreguntaGeografia3;  
                
        //Deportes: preguntas, categoria, y respuestas.
        Pregunta PreguntaDeportes1 = new Pregunta("Deportes", "¿Cuál de los siguientes torneos de tenis se juega en césped?", "Wimbledon");
        PreguntaDeportes1.setRespuestasIncorrectas("Roland Garros", "Abierto de Australia", "Abierto de Estados Unidos");
                
        Pregunta PreguntaDeportes2 = new Pregunta("Deportes", "¿Cuántos hoyos tiene un campo de golf típico en un juego de 18 hoyos?", "63");
        PreguntaDeportes2.setRespuestasIncorrectas("54", "72", "90");
                
        Pregunta PreguntaDeportes3 = new Pregunta("Deportes", "¿De qué ciudad de Argentina es el ídolo Lionel Messi?", "Santa Fé");
        PreguntaDeportes3.setRespuestasIncorrectas("Buenos Aires", "Cordoba", "Mendoza");
                
        preguntasDeportes[0] = PreguntaDeportes1;
        preguntasDeportes[1] = PreguntaDeportes2;
        preguntasDeportes[2] = PreguntaDeportes3;   

        //Entretenimiento: preguntas, categoria, y respuestas.
        Pregunta PreguntaEntretenimiento1 = new Pregunta("Entretenimiento", "¿Quién dirigió la película Isle of Dogs?", "Wes Anderson");
        PreguntaEntretenimiento1.setRespuestasIncorrectas("Quentin Tarantino", "Martin Scorsese", "Christopher Nolan");
                
        Pregunta PreguntaEntretenimiento2 = new Pregunta("Entretenimiento", "¿Quién es el actor que interpreta al profesor de Dead Poets Society?", "Robin Williams");
        PreguntaEntretenimiento2.setRespuestasIncorrectas("Ethan Hawk", "Michael Cera", "Robert de Niro");
                
        Pregunta PreguntaEntretenimiento3 = new Pregunta("Entretenimiento", "¿En qué año se estrenó el juego TES V: SKYRIM?", "2011");
        PreguntaEntretenimiento3.setRespuestasIncorrectas("2012", "2009", "2016");
                
        preguntasEntretenimiento[0] = PreguntaEntretenimiento1;
        preguntasEntretenimiento[1] = PreguntaEntretenimiento2;
        preguntasEntretenimiento[2] = PreguntaEntretenimiento3;    
                
        //Arte: preguntas, categoria, y respuestas.
        Pregunta PreguntaArte1 = new Pregunta("Arte", "¿Quién pintó la famosa obra 'La Noche Estrellada'?", "Vincent van Gogh ");
        PreguntaArte1.setRespuestasIncorrectas("Claude Monet", "Pablo Picasso", "Miguel Angel");
                
        Pregunta PreguntaArte2 = new Pregunta("Arte", "¿Qué banda creó el disco Abbey Road?", "The Beatles");
        PreguntaArte2.setRespuestasIncorrectas("Pink Floyd", "Radiohead", "Slowdive");
                
        Pregunta PreguntaArte3 = new Pregunta("Arte", "¿De qué banda era la cantante Dolores O'Riordan?", "The Cranberries");
        PreguntaArte3.setRespuestasIncorrectas("Nirvana", "Evanescense", "Mitski");
                
        preguntasArte[0] = PreguntaArte1;
        preguntasArte[1] = PreguntaArte2;
        preguntasArte[2] = PreguntaArte3;                  
    }
}
        
