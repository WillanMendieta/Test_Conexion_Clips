/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import net.sf.clipsrules.jni.*;
/**
 *
 * @author steve
 */
public class Pregusntas_Test extends javax.swing.JFrame {
        int a = 0;
        int b = 0;
        int c = 0;
        Inicio pp;
    
    public Pregusntas_Test() throws CLIPSLoadException {
        initComponents();
        setTitle("PREGUNTAS");
        setLocationRelativeTo(null);
        pp = new Inicio();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Preg1 = new javax.swing.JLabel();
        Preg2 = new javax.swing.JLabel();
        Preg3 = new javax.swing.JLabel();
        Preg4 = new javax.swing.JLabel();
        Preg5 = new javax.swing.JLabel();
        Preg6 = new javax.swing.JLabel();
        Preg7 = new javax.swing.JLabel();
        BTcalcular = new javax.swing.JButton();
        Preg8 = new javax.swing.JLabel();
        Preg9 = new javax.swing.JLabel();
        Preg10 = new javax.swing.JLabel();
        Preg11 = new javax.swing.JLabel();
        Preg12 = new javax.swing.JLabel();
        Preg13 = new javax.swing.JLabel();
        Preg14 = new javax.swing.JLabel();
        Preg15 = new javax.swing.JLabel();
        P1R1 = new javax.swing.JRadioButton();
        P1R2 = new javax.swing.JRadioButton();
        P1R33 = new javax.swing.JRadioButton();
        P2R1 = new javax.swing.JRadioButton();
        P2R2 = new javax.swing.JRadioButton();
        P2R3 = new javax.swing.JRadioButton();
        P3R1 = new javax.swing.JRadioButton();
        P3R2 = new javax.swing.JRadioButton();
        P3R3 = new javax.swing.JRadioButton();
        P4R1 = new javax.swing.JRadioButton();
        P4R2 = new javax.swing.JRadioButton();
        P4R3 = new javax.swing.JRadioButton();
        P5R1 = new javax.swing.JRadioButton();
        P5R2 = new javax.swing.JRadioButton();
        P5R3 = new javax.swing.JRadioButton();
        P6R1 = new javax.swing.JRadioButton();
        P6R2 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        P7R1 = new javax.swing.JRadioButton();
        P7R2 = new javax.swing.JRadioButton();
        P7R3 = new javax.swing.JRadioButton();
        P8R1 = new javax.swing.JRadioButton();
        P8R2 = new javax.swing.JRadioButton();
        P8R3 = new javax.swing.JRadioButton();
        P9R1 = new javax.swing.JRadioButton();
        P9R2 = new javax.swing.JRadioButton();
        P9R3 = new javax.swing.JRadioButton();
        P10R1 = new javax.swing.JRadioButton();
        P10R2 = new javax.swing.JRadioButton();
        P10R3 = new javax.swing.JRadioButton();
        P11R1 = new javax.swing.JRadioButton();
        P11R2 = new javax.swing.JRadioButton();
        P11R3 = new javax.swing.JRadioButton();
        P12R1 = new javax.swing.JRadioButton();
        P12R2 = new javax.swing.JRadioButton();
        P12R3 = new javax.swing.JRadioButton();
        P13R1 = new javax.swing.JRadioButton();
        P13R2 = new javax.swing.JRadioButton();
        P13R3 = new javax.swing.JRadioButton();
        P14R1 = new javax.swing.JRadioButton();
        P14R2 = new javax.swing.JRadioButton();
        P14R3 = new javax.swing.JRadioButton();
        P15R1 = new javax.swing.JRadioButton();
        P15R2 = new javax.swing.JRadioButton();
        P15R3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Preguntas:");

        Preg1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg1.setText("1 ¿Te sientes conectado/a con tu cuerpo?");

        Preg2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg2.setText("2.¿Realizas al menos un chequeo médico (de control) por año?");

        Preg3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg3.setText("3 ¿Fumas?");

        Preg4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg4.setText("4 ¿Trabajas o vives en ambientes donde se fuma?");

        Preg5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg5.setText("5 ¿Bebes alcohol?");

        Preg6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg6.setText("6 ¿Te preocupas por llevar un plan de alimentación balanceada?");

        Preg7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg7.setText("7 ¿Consumes frutas?");

        BTcalcular.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BTcalcular.setText("Calcular");
        BTcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcalcularActionPerformed(evt);
            }
        });

        Preg8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg8.setText("8 ¿Comes entre el desayuno, el almuerzo y merienda?");

        Preg9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg9.setText("9 ¿Con qué frecuencia realizas actividad física?");

        Preg10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg10.setText("10 ¿Realizas alguna actividad que te distrae y relaja?");

        Preg11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg11.setText("11 ¿Logras conciliar y mantener el sueño normalmente?");

        Preg12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg12.setText("12 ¿Estas en contacto con el aire libre?");

        Preg13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg13.setText("13 En la semana, ¿cuántas cuadras sueles caminar por día?");

        Preg14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg14.setText("14 ¿Cómo evaluas tu vida afectiva actual?");

        Preg15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Preg15.setText("15 ¿Cómo evaluas tu rutina  laboral? ");

        P1R1.setText("Si");
        P1R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1R1ActionPerformed(evt);
            }
        });

        P1R2.setText("Relativamente");

        P1R33.setText("No");

        P2R1.setText("Si");

        P2R2.setText("Me hago chequeos, pero pasa más de un año entre uno y otro.");

        P2R3.setText("Sólo lo hago cuando tengo algún problema de salud.");

        P3R1.setText("No");

        P3R2.setText("Poco");

        P3R3.setText("Bastante o mucho");

        P4R1.setText("No");

        P4R2.setText("Eventualmente");

        P4R3.setText("Sí");

        P5R1.setText("No, o lo hago socialmente de vez en cuando");

        P5R2.setText("Sí, entre dos y cuatro veces a la semana");

        P5R3.setText("Sí, todos o casi todos los días");

        P6R1.setText("Sí, de hecho lo hago");

        P6R2.setText("Sí, pero no siempre lo logro");

        jRadioButton17.setText("No");

        P7R1.setText("Nunca o, a lo sumo, una vez a la semana");

        P7R2.setText("Entre dos y tres veces por semana");

        P7R3.setText("Entre dos y tres veces por semana");

        P8R1.setText("Dos veces al día, colaciones para no tener tanto hambre al almorzar o cenar");

        P8R2.setText("Algunas veces sí, golosinas o snacks");

        P8R3.setText("Siempre como lo que encuentre a mano entre comida y comida");

        P9R1.setText("Dos o más veces por semana");

        P9R2.setText("Una vez a la semana");

        P9R3.setText("No realizo con regularidad");

        P10R1.setText("Sí");

        P10R2.setText("A veces");

        P10R3.setText("No");

        P11R1.setText("Sí");

        P11R2.setText("A veces");

        P11R3.setText("Generalmente no");

        P12R1.setText("Si no es todos los días, al menos los fines de semana");

        P12R2.setText("Eventualmente");

        P12R3.setText("Prácticamente nunca");

        P13R1.setText("15 o más");

        P13R2.setText("Entre 5 y 15");

        P13R3.setText("Menos de 5");

        P14R1.setText("Positiva");

        P14R2.setText("Aceptable");

        P14R3.setText("Negativa");

        P15R1.setText("Activa pero manejable");

        P15R2.setText("Bastante intensa");

        P15R3.setText("Estresante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Preg5)
                            .addComponent(Preg4)
                            .addComponent(Preg6)
                            .addComponent(Preg8)
                            .addComponent(Preg7)
                            .addComponent(Preg9)
                            .addComponent(Preg10)
                            .addComponent(Preg11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(P11R2)
                                        .addGap(18, 18, 18)
                                        .addComponent(P11R3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(P12R1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P12R2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P12R3))
                            .addComponent(Preg12)
                            .addComponent(Preg14)
                            .addComponent(Preg13)
                            .addComponent(Preg15)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P3R1)
                                        .addGap(18, 18, 18)
                                        .addComponent(P3R2)
                                        .addGap(5, 5, 5)
                                        .addComponent(P3R3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P2R1)
                                        .addGap(18, 18, 18)
                                        .addComponent(P2R2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P2R3))
                            .addComponent(Preg2)
                            .addComponent(Preg1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P4R1)
                                        .addGap(18, 18, 18)
                                        .addComponent(P4R2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P4R3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P5R1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(P5R2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(P5R3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P6R1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P6R2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P9R1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(P9R2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P9R3))
                                    .addComponent(P11R1)
                                    .addComponent(P10R1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P7R1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P7R2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P7R3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(P8R1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(P8R2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(P10R2)
                                                .addGap(18, 18, 18)
                                                .addComponent(P10R3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P8R3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P14R1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P14R2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P14R3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P13R1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P13R2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P13R3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P15R1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P15R2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(P15R3)
                                        .addGap(58, 58, 58)
                                        .addComponent(BTcalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P1R1)
                                        .addGap(18, 18, 18)
                                        .addComponent(P1R2)
                                        .addGap(18, 18, 18)
                                        .addComponent(P1R33)))))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Preg3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preg1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1R1)
                    .addComponent(P1R2)
                    .addComponent(P1R33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preg2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P2R2)
                    .addComponent(P2R3)
                    .addComponent(P2R1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preg3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P3R1)
                    .addComponent(P3R2)
                    .addComponent(P3R3))
                .addGap(9, 9, 9)
                .addComponent(Preg4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P4R1)
                    .addComponent(P4R2)
                    .addComponent(P4R3))
                .addGap(8, 8, 8)
                .addComponent(Preg5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P5R1)
                    .addComponent(P5R2)
                    .addComponent(P5R3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preg6)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P6R1)
                    .addComponent(P6R2)
                    .addComponent(jRadioButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg7)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P7R1)
                    .addComponent(P7R2)
                    .addComponent(P7R3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P8R1)
                    .addComponent(P8R2)
                    .addComponent(P8R3))
                .addGap(7, 7, 7)
                .addComponent(Preg9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P9R1)
                    .addComponent(P9R2)
                    .addComponent(P9R3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preg10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P10R1)
                    .addComponent(P10R2)
                    .addComponent(P10R3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P11R1)
                    .addComponent(P11R2)
                    .addComponent(P11R3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preg12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P12R1)
                    .addComponent(P12R2)
                    .addComponent(P12R3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Preg13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P13R1)
                            .addComponent(P13R2)
                            .addComponent(P13R3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Preg14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P14R1)
                            .addComponent(P14R2)
                            .addComponent(P14R3))
                        .addGap(5, 5, 5)
                        .addComponent(Preg15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P15R1)
                            .addComponent(P15R2)
                            .addComponent(P15R3))
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTcalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        Preg1.getAccessibleContext().setAccessibleName("Preg1");
        Preg2.getAccessibleContext().setAccessibleName("Preg2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcalcularActionPerformed
      
//PREGUNTA 1
        if(P1R1.isSelected()){
            a=a+10;
        }
        if(P1R2.isSelected()){
            b =b+5;
        }
        
// PREGUNTA 2
        if(P2R1.isSelected()){
            a=a+10;
        }
        if(P2R2.isSelected()){
            b=b+5;
        }
        
// PREGUNTA 3        
        if(P3R1.isSelected()){
            a=a+10;
        }
        if(P3R2.isSelected()){
            b=b+5;
        }
        
 // PREGUNTA 4       
        if(P4R1.isSelected()){
            a=a+10;
        }
        if(P4R2.isSelected()){
            b=b+5;
        }
        
// PREGUNTA 5        
        if(P5R1.isSelected()){
            a=a+10;
        }
        if(P5R2.isSelected()){
            b=b+5;
        }
        
// PREGUNTA 6 
        if(P6R1.isSelected()){
            a=a+10;
        }
        if(P6R2.isSelected()){
            b=b+5;
        }
        
// PREGUNTA 7        
        if(P7R1.isSelected()){
            a=a+10;
        }
        if(P7R2.isSelected()){
            b=b+5;
        }
        
        
// PREGUNTA 8        
        if(P8R1.isSelected()){
            a=a+10;
        }
        if(P8R2.isSelected()){
            b=b+5;
        }
        
        
// PREGUNTA 9        
        if(P9R1.isSelected()){
            a=a+10;
        }
        if(P9R2.isSelected()){
            b=b+5;
        }
        
// PREGUNTA 10       
        if(P10R1.isSelected()){
            a=a+10;
        }
        if(P10R2.isSelected()){
            b=b+5;
        }
        
// PREGUNTA 10      
        if(P11R1.isSelected()){
            a=a+10;
        }
        if(P11R2.isSelected()){
            b=b+5;
        }
        
// PREGUNTA 11  
        if(P12R1.isSelected()){
            a=a+10;
        }
        if(P12R2.isSelected()){
            b=b+5;
        }
        
// PREGUNTA 12       
        if(P13R1.isSelected()){
            a=a+10;
        }
        if(P13R2.isSelected()){
            b=b+5;
        }
        
// PREGUNTA 12       
        if(P14R1.isSelected()){
            a=a+10;
        }
        if(P14R2.isSelected()){
            b=b+5;
        }
        
// PREGUNTA 13        
        if(P15R1.isSelected()){
            a=a+10;
        }
        if(P15R2.isSelected()){
            b=b+5;
        }
        
        pp.metodoCLIPS( a, b, c);

        
    }//GEN-LAST:event_BTcalcularActionPerformed

    private void P1R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1R1ActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_P1R1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTcalcular;
    private javax.swing.JRadioButton P10R1;
    private javax.swing.JRadioButton P10R2;
    private javax.swing.JRadioButton P10R3;
    private javax.swing.JRadioButton P11R1;
    private javax.swing.JRadioButton P11R2;
    private javax.swing.JRadioButton P11R3;
    private javax.swing.JRadioButton P12R1;
    private javax.swing.JRadioButton P12R2;
    private javax.swing.JRadioButton P12R3;
    private javax.swing.JRadioButton P13R1;
    private javax.swing.JRadioButton P13R2;
    private javax.swing.JRadioButton P13R3;
    private javax.swing.JRadioButton P14R1;
    private javax.swing.JRadioButton P14R2;
    private javax.swing.JRadioButton P14R3;
    private javax.swing.JRadioButton P15R1;
    private javax.swing.JRadioButton P15R2;
    private javax.swing.JRadioButton P15R3;
    private javax.swing.JRadioButton P1R1;
    private javax.swing.JRadioButton P1R2;
    private javax.swing.JRadioButton P1R33;
    private javax.swing.JRadioButton P2R1;
    private javax.swing.JRadioButton P2R2;
    private javax.swing.JRadioButton P2R3;
    private javax.swing.JRadioButton P3R1;
    private javax.swing.JRadioButton P3R2;
    private javax.swing.JRadioButton P3R3;
    private javax.swing.JRadioButton P4R1;
    private javax.swing.JRadioButton P4R2;
    private javax.swing.JRadioButton P4R3;
    private javax.swing.JRadioButton P5R1;
    private javax.swing.JRadioButton P5R2;
    private javax.swing.JRadioButton P5R3;
    private javax.swing.JRadioButton P6R1;
    private javax.swing.JRadioButton P6R2;
    private javax.swing.JRadioButton P7R1;
    private javax.swing.JRadioButton P7R2;
    private javax.swing.JRadioButton P7R3;
    private javax.swing.JRadioButton P8R1;
    private javax.swing.JRadioButton P8R2;
    private javax.swing.JRadioButton P8R3;
    private javax.swing.JRadioButton P9R1;
    private javax.swing.JRadioButton P9R2;
    private javax.swing.JRadioButton P9R3;
    private javax.swing.JLabel Preg1;
    private javax.swing.JLabel Preg10;
    private javax.swing.JLabel Preg11;
    private javax.swing.JLabel Preg12;
    private javax.swing.JLabel Preg13;
    private javax.swing.JLabel Preg14;
    private javax.swing.JLabel Preg15;
    private javax.swing.JLabel Preg2;
    private javax.swing.JLabel Preg3;
    private javax.swing.JLabel Preg4;
    private javax.swing.JLabel Preg5;
    private javax.swing.JLabel Preg6;
    private javax.swing.JLabel Preg7;
    private javax.swing.JLabel Preg8;
    private javax.swing.JLabel Preg9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton17;
    // End of variables declaration//GEN-END:variables

}
