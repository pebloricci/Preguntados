/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author pablo
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    public vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        LabelimagenMenuPrincipal = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        jButtonJUGAR = new javax.swing.JButton();
        jButtonSALIR = new javax.swing.JButton();
        jLabeliconoDosjugadores = new javax.swing.JLabel();
        jLabelTextoDosjugadores = new javax.swing.JLabel();
        jPanelQuienEmpieza = new javax.swing.JPanel();
        labelEleccionJugador1 = new javax.swing.JLabel();
        labelEleccionJugador2 = new javax.swing.JLabel();
        jLabelQuienEmpiezaTitulo = new javax.swing.JLabel();
        jLabelSeleccioneOpcionTitulo = new javax.swing.JLabel();
        jButtonJugador1 = new javax.swing.JButton();
        jButtonJugador2 = new javax.swing.JButton();
        jButtonAlAzar = new javax.swing.JButton();
        jPanelJuego = new javax.swing.JPanel();
        jPanelPuntajeJ1 = new javax.swing.JPanel();
        jLabelPuntajeJ1 = new javax.swing.JLabel();
        jPanelPuntajeJ2 = new javax.swing.JPanel();
        jLabelPuntajeJ2 = new javax.swing.JLabel();
        jLabelPregunta = new javax.swing.JLabel();
        jButtonSiguientePregunta = new javax.swing.JButton();
        jLabelTextoCategoria = new javax.swing.JLabel();
        jLabelimagenCategoria = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();
        jLabelinstruccionRuleta = new javax.swing.JLabel();
        jButtonRespuesta1 = new javax.swing.JButton();
        jButtonRespuesta2 = new javax.swing.JButton();
        jButtonRespuesta3 = new javax.swing.JButton();
        jButtonRespuesta4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMenu.setBackground(new java.awt.Color(204, 255, 204));
        jPanelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelimagenMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenMenu.png"))); // NOI18N
        LabelimagenMenuPrincipal.setText("jLabel2");

        LabelTitulo.setFont(new java.awt.Font("Californian FB", 1, 48)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/titulo.png"))); // NOI18N

        jButtonJUGAR.setBackground(new java.awt.Color(204, 255, 204));
        jButtonJUGAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonJUGAR.setForeground(new java.awt.Color(51, 51, 51));
        jButtonJUGAR.setText("JUGAR");

        jButtonSALIR.setBackground(new java.awt.Color(204, 255, 204));
        jButtonSALIR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSALIR.setForeground(new java.awt.Color(51, 51, 51));
        jButtonSALIR.setText("SALIR");

        jLabeliconoDosjugadores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabeliconoDosjugadores.setForeground(new java.awt.Color(51, 51, 51));
        jLabeliconoDosjugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/juegode2.png"))); // NOI18N
        jLabeliconoDosjugadores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelTextoDosjugadores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTextoDosjugadores.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTextoDosjugadores.setText("  Este juego está pensado para dos jugadores.");

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonJUGAR)))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(LabelimagenMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTextoDosjugadores)
                            .addComponent(jLabeliconoDosjugadores))))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelimagenMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonJUGAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(jLabeliconoDosjugadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTextoDosjugadores)
                .addGap(12, 12, 12))
        );

        jPanelQuienEmpieza.setBackground(new java.awt.Color(204, 255, 204));
        jPanelQuienEmpieza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelEleccionJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historia3.png"))); // NOI18N

        labelEleccionJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arte3.png"))); // NOI18N

        jLabelQuienEmpiezaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelQuienEmpiezaTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelQuienEmpiezaTitulo.setText("¿Quién empieza?");

        jLabelSeleccioneOpcionTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSeleccioneOpcionTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSeleccioneOpcionTitulo.setText("SELECCIONE UNA OPCIÓN.");

        jButtonJugador1.setBackground(new java.awt.Color(204, 255, 204));
        jButtonJugador1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonJugador1.setForeground(new java.awt.Color(51, 51, 51));
        jButtonJugador1.setText("JUGADOR 1");

        jButtonJugador2.setBackground(new java.awt.Color(204, 255, 204));
        jButtonJugador2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonJugador2.setForeground(new java.awt.Color(51, 51, 51));
        jButtonJugador2.setText("JUGADOR 2");

        jButtonAlAzar.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAlAzar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonAlAzar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonAlAzar.setText("AL AZAR");

        javax.swing.GroupLayout jPanelQuienEmpiezaLayout = new javax.swing.GroupLayout(jPanelQuienEmpieza);
        jPanelQuienEmpieza.setLayout(jPanelQuienEmpiezaLayout);
        jPanelQuienEmpiezaLayout.setHorizontalGroup(
            jPanelQuienEmpiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQuienEmpiezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEleccionJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelQuienEmpiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuienEmpiezaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelQuienEmpiezaTitulo))
                    .addGroup(jPanelQuienEmpiezaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelSeleccioneOpcionTitulo))
                    .addGroup(jPanelQuienEmpiezaLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanelQuienEmpiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAlAzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(labelEleccionJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanelQuienEmpiezaLayout.setVerticalGroup(
            jPanelQuienEmpiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuienEmpiezaLayout.createSequentialGroup()
                .addGroup(jPanelQuienEmpiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuienEmpiezaLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(jPanelQuienEmpiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEleccionJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelQuienEmpiezaLayout.createSequentialGroup()
                                .addComponent(jLabelQuienEmpiezaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSeleccioneOpcionTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonJugador1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonJugador2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAlAzar))))
                    .addGroup(jPanelQuienEmpiezaLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(labelEleccionJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(318, Short.MAX_VALUE))
        );

        jPanelJuego.setBackground(new java.awt.Color(204, 255, 204));
        jPanelJuego.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanelPuntajeJ1.setBackground(new java.awt.Color(153, 255, 153));
        jPanelPuntajeJ1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Puntaje Jugador 1:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabelPuntajeJ1.setForeground(new java.awt.Color(255, 0, 0));
        jLabelPuntajeJ1.setText("0/5");

        javax.swing.GroupLayout jPanelPuntajeJ1Layout = new javax.swing.GroupLayout(jPanelPuntajeJ1);
        jPanelPuntajeJ1.setLayout(jPanelPuntajeJ1Layout);
        jPanelPuntajeJ1Layout.setHorizontalGroup(
            jPanelPuntajeJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPuntajeJ1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabelPuntajeJ1)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanelPuntajeJ1Layout.setVerticalGroup(
            jPanelPuntajeJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPuntajeJ1Layout.createSequentialGroup()
                .addComponent(jLabelPuntajeJ1)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanelPuntajeJ2.setBackground(new java.awt.Color(153, 255, 153));
        jPanelPuntajeJ2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Puntaje Jugador 2:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabelPuntajeJ2.setForeground(new java.awt.Color(255, 0, 0));
        jLabelPuntajeJ2.setText("0/5");

        javax.swing.GroupLayout jPanelPuntajeJ2Layout = new javax.swing.GroupLayout(jPanelPuntajeJ2);
        jPanelPuntajeJ2.setLayout(jPanelPuntajeJ2Layout);
        jPanelPuntajeJ2Layout.setHorizontalGroup(
            jPanelPuntajeJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPuntajeJ2Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabelPuntajeJ2)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanelPuntajeJ2Layout.setVerticalGroup(
            jPanelPuntajeJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPuntajeJ2Layout.createSequentialGroup()
                .addComponent(jLabelPuntajeJ2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelPregunta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPregunta.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonSiguientePregunta.setBackground(new java.awt.Color(204, 255, 204));
        jButtonSiguientePregunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/willy3.png"))); // NOI18N
        jButtonSiguientePregunta.setBorderPainted(false);

        jLabelTextoCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTextoCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTextoCategoria.setText("Categoría:");

        jLabelResultado.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabelResultado.setForeground(new java.awt.Color(255, 51, 255));

        jLabelinstruccionRuleta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelinstruccionRuleta.setForeground(new java.awt.Color(51, 51, 51));
        jLabelinstruccionRuleta.setText("Toca la ruleta para ver la siguiente pregunta.");

        jButtonRespuesta1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRespuesta1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRespuesta1.setForeground(new java.awt.Color(51, 51, 51));

        jButtonRespuesta2.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRespuesta2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRespuesta2.setForeground(new java.awt.Color(51, 51, 51));

        jButtonRespuesta3.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRespuesta3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRespuesta3.setForeground(new java.awt.Color(51, 51, 51));

        jButtonRespuesta4.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRespuesta4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRespuesta4.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanelJuegoLayout = new javax.swing.GroupLayout(jPanelJuego);
        jPanelJuego.setLayout(jPanelJuegoLayout);
        jPanelJuegoLayout.setHorizontalGroup(
            jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJuegoLayout.createSequentialGroup()
                .addComponent(jPanelPuntajeJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPuntajeJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(jPanelJuegoLayout.createSequentialGroup()
                .addGroup(jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJuegoLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabelPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelJuegoLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelJuegoLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabelTextoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSiguientePregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabelimagenCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJuegoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelinstruccionRuleta)
                .addGap(367, 367, 367))
        );
        jPanelJuegoLayout.setVerticalGroup(
            jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJuegoLayout.createSequentialGroup()
                .addGroup(jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPuntajeJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPuntajeJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabelinstruccionRuleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelJuegoLayout.createSequentialGroup()
                            .addComponent(jButtonSiguientePregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))
                        .addGroup(jPanelJuegoLayout.createSequentialGroup()
                            .addComponent(jLabelimagenCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJuegoLayout.createSequentialGroup()
                        .addComponent(jLabelTextoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabelPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(220, 220, 220))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231)
                .addComponent(jPanelQuienEmpieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(912, 912, 912))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelQuienEmpieza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelimagenMenuPrincipal;
    public javax.swing.JButton jButtonAlAzar;
    public javax.swing.JButton jButtonJUGAR;
    public javax.swing.JButton jButtonJugador1;
    public javax.swing.JButton jButtonJugador2;
    public javax.swing.JButton jButtonRespuesta1;
    public javax.swing.JButton jButtonRespuesta2;
    public javax.swing.JButton jButtonRespuesta3;
    public javax.swing.JButton jButtonRespuesta4;
    public javax.swing.JButton jButtonSALIR;
    public javax.swing.JButton jButtonSiguientePregunta;
    public javax.swing.JLabel jLabelPregunta;
    public javax.swing.JLabel jLabelPuntajeJ1;
    public javax.swing.JLabel jLabelPuntajeJ2;
    private javax.swing.JLabel jLabelQuienEmpiezaTitulo;
    public javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelSeleccioneOpcionTitulo;
    public javax.swing.JLabel jLabelTextoCategoria;
    private javax.swing.JLabel jLabelTextoDosjugadores;
    private javax.swing.JLabel jLabeliconoDosjugadores;
    public javax.swing.JLabel jLabelimagenCategoria;
    public javax.swing.JLabel jLabelinstruccionRuleta;
    public javax.swing.JPanel jPanelJuego;
    public javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelPuntajeJ1;
    private javax.swing.JPanel jPanelPuntajeJ2;
    public javax.swing.JPanel jPanelQuienEmpieza;
    private javax.swing.JLabel labelEleccionJugador1;
    private javax.swing.JLabel labelEleccionJugador2;
    // End of variables declaration//GEN-END:variables
}
