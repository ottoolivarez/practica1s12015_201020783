/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author otto
 */
public class FrameInicial extends javax.swing.JFrame {

    /**
     * Creates new form FrameInicial
     */
    
   String dotpath="c:/eddPractica1/dot.txt";
   String dotImagepath="c:/eddPractica1/";
    public FrameInicial() {
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

        jbtnPlantas = new javax.swing.JButton();
        jbtnZombisd = new javax.swing.JButton();
        jbtnJugar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmenuRepJugadores = new javax.swing.JMenuItem();
        jmRepCatalogo = new javax.swing.JMenuItem();
        jmRepPlantas = new javax.swing.JMenuItem();
        jmRepZombis = new javax.swing.JMenuItem();
        jmRepMatriz = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnPlantas.setText("Plantas");
        jbtnPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlantasActionPerformed(evt);
            }
        });

        jbtnZombisd.setText("Zombis");
        jbtnZombisd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnZombisdActionPerformed(evt);
            }
        });

        jbtnJugar.setText("Comenzar");
        jbtnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnJugarActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");

        jMenu1.setText("Graficar");

        jmenuRepJugadores.setText("Jugadores");
        jmenuRepJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuRepJugadoresActionPerformed(evt);
            }
        });
        jMenu1.add(jmenuRepJugadores);

        jmRepCatalogo.setText("Catalogo");
        jMenu1.add(jmRepCatalogo);

        jmRepPlantas.setText("Plantas");
        jMenu1.add(jmRepPlantas);

        jmRepZombis.setText("Zombis");
        jMenu1.add(jmRepZombis);

        jmRepMatriz.setText("Matriz Juego");
        jMenu1.add(jmRepMatriz);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jmAcercaDe.setText("Acerca de...");
        jmAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(jmAcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbtnJugar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnZombisd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnPlantas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jbtnPlantas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnZombisd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnJugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnCancelar)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarDotText(String DotInstruction){
     FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(this.dotpath);
            pw = new PrintWriter(fichero);
                pw.print(DotInstruction);
 
        } catch (Exception e) {
          JOptionPane.showMessageDialog(this,null,e.getMessage(),WIDTH); 
        } finally { 
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    private void Graficar(String nameRep){
            try
		{       
			ProcessBuilder pbuilder;
		    
			/*
			 * Realiza la construccion del comando    
			 * en la linea de comandos esto es: 
			 * dot -Tpng -o archivo.png archivo.dot
			 */
			pbuilder = new ProcessBuilder( "dot", "-Tpng", "-o",this.dotImagepath + nameRep + ".png" , this.dotpath);
			pbuilder.redirectErrorStream( true );
			//Ejecuta el proceso
			pbuilder.start();
		    
		} catch (Exception e) { e.printStackTrace(); }
    }
    
    private void jbtnPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlantasActionPerformed
        // TODO add your handling code here:
       FrameJugador fj= new FrameJugador();
       fj.setLayout(null);
       fj.setSize(this.getWidth(), this.getHeight());
       fj.TipoJugador=true;
       fj.setVisible(true);
       this.jbtnPlantas.setEnabled(false);
    }//GEN-LAST:event_jbtnPlantasActionPerformed

    private void jmAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAcercaDeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Desarollador:\n\tOtto  Olivarez\nCarnet:\n\t201020783");
    }//GEN-LAST:event_jmAcercaDeActionPerformed

    private void jbtnZombisdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnZombisdActionPerformed
        // TODO add your handling code here 
        FrameJugador fj= new FrameJugador();
        fj.setLayout(null);
        fj.setSize(400,400);
        fj.TipoJugador=false;
        fj.setVisible(true);
       this.jbtnZombisd.setEnabled(false);
        
    }//GEN-LAST:event_jbtnZombisdActionPerformed

    private void jmenuRepJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuRepJugadoresActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder(); 
        StringBuilder rs= new StringBuilder(); // {rank=same; A B D}  -- nodos del mismo nivel
        
        if (!(Practica1Edd.raizJugador==null)){
        
           sb.append("digraph g{\n ");
           rs.append("{rank=same; ");
            Jugador aux = Practica1Edd.raizJugador;
            int contador=1;
          while(aux!=null){  
                       
            sb.append(" J");sb.append(contador);                        
            sb.append("[shape=box];\n ");
            sb.append("J");sb.append(contador);
            sb.append("[label=\"");
            sb.append(aux.nombre);
            sb.append("\\n");
            sb.append(aux.cantidad);
            sb.append("\"];");
            if (contador>1){
                 sb.append("\n J");sb.append(contador-1);
                  sb.append("->");
                  sb.append("J");sb.append(contador);
            }    
            sb.append("\n J");sb.append(contador);
            rs.append("J");rs.append(contador);
            rs.append(" ");
            
            if (!(aux.raiz_dato==null)){
                DatosJugador dj1=aux.raiz_dato;
                while(dj1!=null){
                    sb.append("->");
                    sb.append(dj1.Dato);
                    sb.append("\n");
                    rs.append(dj1.Dato);
                    rs.append(" ");
                    dj1= dj1.Siguiente;
                }
                rs.append("}\n {rank=same; ");
            }
           aux= aux.siguienteJ;
           contador+=1;
          }
          sb.append("\n");
          sb.append(rs.toString());
          sb.append("\n}");
            //se guarda un txt
            this.GenerarDotText(sb.toString());
            this.Graficar("Jugadores");
            
            JOptionPane.showMessageDialog(this,sb.toString());
        }else{
        JOptionPane.showMessageDialog(this, "No hay jugadores");
        }
        
        
    }//GEN-LAST:event_jmenuRepJugadoresActionPerformed

    private void jbtnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnJugarActionPerformed
        // TODO add your handling code here:
        DisenoCatalogo dc =new DisenoCatalogo();
        dc.setSize(900,500);
        dc.setVisible(true);
        
    }//GEN-LAST:event_jbtnJugarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnJugar;
    private javax.swing.JButton jbtnPlantas;
    private javax.swing.JButton jbtnZombisd;
    private javax.swing.JMenuItem jmAcercaDe;
    private javax.swing.JMenuItem jmRepCatalogo;
    private javax.swing.JMenuItem jmRepMatriz;
    private javax.swing.JMenuItem jmRepPlantas;
    private javax.swing.JMenuItem jmRepZombis;
    private javax.swing.JMenuItem jmenuRepJugadores;
    // End of variables declaration//GEN-END:variables
}
