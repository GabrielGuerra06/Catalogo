/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package catalogoN;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class CatalogoVisual extends javax.swing.JFrame {
    Icon[] icon= new ImageIcon[20];
    int[] calif = new int[20];
    int ValorCali;
    int[] contador = new int[20];
    int[] total=new int[20];
    static int i = 0;
    public InterfazCatalogo catalogo = new Catalogo();    
    public CatalogoVisual() {
        initComponents();
       ImageIcon interestelar= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Interestelar.jpg");
          icon[0]=interestelar;
        ImageIcon whiplash= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Whiplash.jpg");
          icon[1]=whiplash;
        ImageIcon revenant= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Revenant.jpg");
          icon[2]=revenant;
        ImageIcon forrestGump= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Forrest Gump.jpg");
          icon[3]=forrestGump;
        ImageIcon NightmareAlley= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\El callejon de las almas perdidas.jpg");
          icon[4]=NightmareAlley;
        ImageIcon coda= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\CODA.jpg");
          icon[5]=coda;
        ImageIcon batman= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\batman-el-caballero-de-la-noche.jpg");
          icon[6]=batman;
        ImageIcon seven= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\SE7EN.jpg");
          icon[7]=seven;
        ImageIcon hastaElUltimoHombre= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Hasta el último hombre.jpg");
          icon[8]=hastaElUltimoHombre;
        ImageIcon inception= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\El origen.jpg");
          icon[9]=inception;
        ImageIcon prisoners= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Prisoners.jpg");
         icon[10]=prisoners;
        ImageIcon thePowerOfTheDog= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\The_Power_of_the_Dog.jpg");
          icon[11]=thePowerOfTheDog;
        ImageIcon yourName= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Your name.jpg");
          icon[12]=yourName;
        ImageIcon ShutterIsland= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Shutter Island.jpg");
          icon[13]=ShutterIsland;
        ImageIcon comoEntrenarATuDragon= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Como entrenar a tu dragon.jpg");
          icon[14]=comoEntrenarATuDragon;
        ImageIcon parasites= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\parasites.jpg");
          icon[15]=parasites;
        ImageIcon laListaDeSchindler= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Schindlers list.jpg");
          icon[16]=laListaDeSchindler;
        ImageIcon joker= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\joker.jpg");
          icon[17]=joker;
        ImageIcon klaus= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Klaus.jpg");
          icon[18]=klaus;
        ImageIcon cadenaPerpetua= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Shawshank redemption.jpg");
          icon[19]=cadenaPerpetua;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        plataforma = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        genero = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        reparto = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        url = new javax.swing.JButton();
        calificacion = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        CALIF = new javax.swing.JLabel();
        GuardarCALIF = new javax.swing.JButton();
        BANT = new javax.swing.JButton();
        BSIG = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        emision = new javax.swing.JTextArea();
        foto = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        calificacionTotal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 255));
        setResizable(false);

        titulo.setBackground(new java.awt.Color(0, 0, 0));
        titulo.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("INTERESTELAR");
        titulo.setOpaque(true);

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        plataforma.setEditable(false);
        plataforma.setBackground(new java.awt.Color(0, 0, 0));
        plataforma.setColumns(20);
        plataforma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        plataforma.setForeground(new java.awt.Color(255, 255, 255));
        plataforma.setRows(5);
        plataforma.setText("Netflix\nHBO max\nAmazon prime");
        plataforma.setMaximumSize(new java.awt.Dimension(132, 79));
        jScrollPane7.setViewportView(plataforma);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        genero.setEditable(false);
        genero.setBackground(new java.awt.Color(0, 0, 0));
        genero.setColumns(20);
        genero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genero.setForeground(new java.awt.Color(255, 255, 255));
        genero.setRows(5);
        genero.setText("Drama\nComedia \nRomance");
        genero.setMaximumSize(new java.awt.Dimension(91, 79));
        jScrollPane5.setViewportView(genero);

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        reparto.setEditable(false);
        reparto.setBackground(new java.awt.Color(0, 0, 0));
        reparto.setColumns(20);
        reparto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reparto.setForeground(new java.awt.Color(255, 255, 255));
        reparto.setRows(5);
        reparto.setText("Christopher Nolan\nMatthew McConaughey\nAnne Hathaway");
        reparto.setMaximumSize(new java.awt.Dimension(208, 79));
        jScrollPane8.setViewportView(reparto);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        sinopsis.setEditable(false);
        sinopsis.setBackground(new java.awt.Color(0, 0, 0));
        sinopsis.setColumns(20);
        sinopsis.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sinopsis.setForeground(new java.awt.Color(255, 255, 255));
        sinopsis.setRows(5);
        sinopsis.setText("Un grupo de científicos y exploradores, encabezados por Cooper, se embarcan en un viaje espacial para\n encontrar un lugar con las condiciones necesarias para reemplazar a la Tierra y comenzar una nueva vida allí. \nLa Tierra está llegando a su fin y este grupo necesita encontrar un planeta más allá de nuestra galaxia\n que garantice el futuro de la raza humana.");
        sinopsis.setFocusable(false);
        sinopsis.setMaximumSize(new java.awt.Dimension(702, 84));
        sinopsis.setName(""); // NOI18N
        jScrollPane1.setViewportView(sinopsis);

        url.setBackground(new java.awt.Color(255, 204, 102));
        url.setText("TRAILER");
        url.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlActionPerformed(evt);
            }
        });

        calificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        calificacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calificacionStateChanged(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("CALIFICACIÓN");
        jScrollPane2.setViewportView(jTextArea1);

        GuardarCALIF.setBackground(new java.awt.Color(255, 204, 102));
        GuardarCALIF.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        GuardarCALIF.setText("Guardar calificación");
        GuardarCALIF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarCALIFMouseClicked(evt);
            }
        });

        BANT.setBackground(new java.awt.Color(255, 153, 51));
        BANT.setText("Anterior");
        BANT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BANTActionPerformed(evt);
            }
        });

        BSIG.setBackground(new java.awt.Color(255, 153, 0));
        BSIG.setText("Siguiente");
        BSIG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BSIG.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BSIG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSIGActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        emision.setEditable(false);
        emision.setBackground(new java.awt.Color(0, 0, 0));
        emision.setColumns(20);
        emision.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        emision.setForeground(new java.awt.Color(255, 255, 255));
        emision.setRows(5);
        emision.setText("Primera emisión: cine");
        jScrollPane3.setViewportView(emision);

        foto.setIcon(new javax.swing.ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\interestelar.jpg")); // NOI18N

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        calificacionTotal.setEditable(false);
        calificacionTotal.setColumns(20);
        calificacionTotal.setRows(5);
        jScrollPane4.setViewportView(calificacionTotal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 128, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(36, 36, 36)))
                        .addComponent(imagen)
                        .addGap(6, 6, 6)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(GuardarCALIF)
                                        .addGap(61, 61, 61))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CALIF, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BANT, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BSIG, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(jScrollPane5)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane8)
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GuardarCALIF)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CALIF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BANT, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSIG, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlActionPerformed
        // TODO add your handling code here:
        try{
            Desktop.getDesktop().browse(new URI(catalogo.url(i)));
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"ERROR");
        }
    }//GEN-LAST:event_urlActionPerformed

    private void calificacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_calificacionStateChanged
calificacionTotal.setText(Integer.toString(calif[i]));
        if(calificacion.getValue() >= 0){
            ValorCali = 0;
            CALIF.setText("La calificación que le dará es de: " + ValorCali + " Estrellas");
           
        }
        if(calificacion.getValue() >= 20){
            ValorCali = 1;
            CALIF.setText("La calificación que le dará es de: " + ValorCali + " Estrellas");
            
        }
        if(calificacion.getValue() >= 40){
            ValorCali = 2;
            CALIF.setText("La calificación que le dará es de: " + ValorCali + " Estrellas");
            
        }
        if(calificacion.getValue() >= 60){
            ValorCali = 3;
            CALIF.setText("La calificación que le dará es de: " + ValorCali + " Estrellas");
            
        }
        if(calificacion.getValue() >= 80){
            ValorCali = 4;
            CALIF.setText("La calificación que le dará es de: " + ValorCali + " Estrellas");
            
        }
        if(calificacion.getValue() == 100){
            ValorCali = 5;
            CALIF.setText("La calificación que le dará es de: " + ValorCali + " Estrellas");
            
        }
    }//GEN-LAST:event_calificacionStateChanged

    private void GuardarCALIFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarCALIFMouseClicked
       calif[i]=ValorCali;
       calificacionTotal.setText(Integer.toString(calif[i]));
    }//GEN-LAST:event_GuardarCALIFMouseClicked

    private void BSIGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSIGActionPerformed
        if(i<19) {
                
                i++;
                calificacionTotal.setText(Integer.toString(calif[i]));
                emision.setText("Primera emisión: " + catalogo.emision());
                titulo.setText(catalogo.titulo(i));
                sinopsis.setText(catalogo.sinopsis(i));
                genero.setText(catalogo.genero(i));
                plataforma.setText(catalogo.plataforma(i));  
                foto.setIcon(icon[i]);
                reparto.setText(catalogo.reparto(i));
                
             
            
        }
    }//GEN-LAST:event_BSIGActionPerformed

    private void BANTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BANTActionPerformed
        if(i>0) {
            i--;
            calificacionTotal.setText(Integer.toString(calif[i]));
            emision.setText("Primera emisión: " + catalogo.emision());
            titulo.setText(catalogo.titulo(i));
            sinopsis.setText(catalogo.sinopsis(i));
            genero.setText(catalogo.genero(i));
            plataforma.setText(catalogo.plataforma(i));
            foto.setIcon(icon[i]);
            reparto.setText(catalogo.reparto(i));
           
        }
    }//GEN-LAST:event_BANTActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BANT;
    private javax.swing.JButton BSIG;
    private javax.swing.JLabel CALIF;
    private javax.swing.JButton GuardarCALIF;
    private javax.swing.JSlider calificacion;
    private javax.swing.JTextArea calificacionTotal;
    private javax.swing.JTextArea emision;
    private javax.swing.JLabel foto;
    private javax.swing.JTextArea genero;
    private javax.swing.JLabel imagen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea plataforma;
    private javax.swing.JTextArea reparto;
    protected final javax.swing.JTextArea sinopsis = new javax.swing.JTextArea();
    private javax.swing.JLabel titulo;
    private javax.swing.JButton url;
    // End of variables declaration//GEN-END:variables
}
