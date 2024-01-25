package Modelo;

public class Modelo {

        Pregunta[] preguntasCiencia = new Pregunta[3];
        Pregunta[] preguntasHistoria = new Pregunta[3];
        Pregunta[] preguntasGeografia = new Pregunta[3];
        Pregunta[] preguntasDeportes = new Pregunta[3];
        Pregunta[] preguntasEntretenimiento = new Pregunta[3];
        Pregunta[] preguntasArte = new Pregunta[3];


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
                Pregunta PreguntaEntretenimiento1 = new Pregunta("Entretenimiento", "", "");
                PreguntaEntretenimiento1.setRespuestasIncorrectas("", "", "");
                
                Pregunta PreguntaEntretenimiento2 = new Pregunta("Entretenimiento", "", "");
                PreguntaEntretenimiento2.setRespuestasIncorrectas("", "", "");
                
                Pregunta PreguntaEntretenimiento3 = new Pregunta("Entretenimiento", "", "");
                PreguntaEntretenimiento3.setRespuestasIncorrectas("", "", "");
                
                preguntasEntretenimiento[0] = PreguntaEntretenimiento1;
                preguntasEntretenimiento[1] = PreguntaEntretenimiento2;
                preguntasEntretenimiento[2] = PreguntaEntretenimiento3;    
                
                //Arte: preguntas, categoria, y respuestas.
                Pregunta PreguntaArte1 = new Pregunta("Arte", "", "");
                PreguntaArte1.setRespuestasIncorrectas("", "", "");
                
                Pregunta PreguntaArte2 = new Pregunta("Arte", "", "");
                PreguntaArte2.setRespuestasIncorrectas("", "", "");
                
                Pregunta PreguntaArte3 = new Pregunta("Arte", "", "");
                PreguntaArte3.setRespuestasIncorrectas("", "", "");
                
                preguntasArte[0] = PreguntaArte1;
                preguntasArte[1] = PreguntaArte2;
                preguntasArte[2] = PreguntaArte3;                  
        }
}
        
