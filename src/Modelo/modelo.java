package Modelo;

public class Modelo {

        Pregunta[] preguntasCiencia = new Pregunta[3];
        Pregunta[] preguntasHistoria = new Pregunta[3];
        Pregunta[] preguntasGeografia = new Pregunta[3];
        Pregunta[] preguntasDeportes = new Pregunta[3];
        Pregunta[] preguntasEntretenimiento = new Pregunta[3];
        Pregunta[] preguntasArte = new Pregunta[3];

        public Modelo(){
                Pregunta PreguntaCiencia = new Pregunta("Ciencia", "?", "lol");
                preguntasCiencia[0] = PreguntaCiencia;
        }
}
        
