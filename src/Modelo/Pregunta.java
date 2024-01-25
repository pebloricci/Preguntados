package Modelo;

public class Pregunta {
    
    private String categoria;
    private String pregunta;
    private String respuestaCorrecta;
    private String[] respuestasIncorrectas  = new String[3];

    public Pregunta(String categoria, String pregunta, String respuestaCorrecta) {
        this.categoria = categoria;
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String[] getRespuestasIncorrectas() {
        return respuestasIncorrectas;
    }

    public void setRespuestasIncorrectas(String[] respuestasIncorrectas) {
        this.respuestasIncorrectas = respuestasIncorrectas;
    }

}

