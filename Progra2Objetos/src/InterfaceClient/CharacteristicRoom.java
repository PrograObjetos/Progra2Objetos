/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceClient;

import globals.Globals;
import java.awt.Color;

/**
 *
 * @author cristian
 */
public class CharacteristicRoom extends javax.swing.JFrame {

   Globals newglobals = Globals.getInstance();
   String AllInclude;
   String Living;
   String SeaView;
   String Smoke;
   String Terrace;
    public CharacteristicRoom() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Room Type");
        loadDescriptionRoom();
    }

    public void loadDescriptionRoom(){
        if (newglobals.getActualRoom().getRoomType().isAllInclusive()) {
            String AllInclude = "yes";
            jLabelAllInclude.setText(AllInclude);
        }
        else{
           String AllInclude = "No"; 
           jLabelAllInclude.setText(AllInclude);
        }
        
        //-------------------------------------------------------------------------------
        if (newglobals.getActualRoom().getRoomType().isLiving()) {
            String Living = "yes";
            jLabelLiving.setText(Living);
        }
        else{
           String Living = "No"; 
           jLabelLiving.setText(Living);
        }        
        
        
        
        //-------------------------------------------------------------------------------
         if (newglobals.getActualRoom().getRoomType().isSeaview()) {
            String SeaView = "yes";
            jLabelSeaView.setText(SeaView);
        }
        else{
           String SeaView = "No"; 
           jLabelSeaView.setText(SeaView);
        }       
        
        //-------------------------------------------------------------------------------
         if (newglobals.getActualRoom().getRoomType().isSmoke()) {
            String Smoke = "yes";
            jLabelSmoke.setText(Smoke);
        }
        else{
           String Smoke = "No"; 
           jLabelSmoke.setText(Smoke);
        }  
         //-------------------------------------------------------------------------------

         if (newglobals.getActualRoom().getRoomType().isTerrace()) {
            String Terrace = "yes";
            jLabelTerrace.setText(Terrace);
        }
        else{
           String Terrace = "No"; 
           jLabelTerrace.setText(Terrace);
        }  
         //-------------------------------------------------------------------------------         
       jLabelDescription.setText(newglobals.getActualRoom().getRoomType().getDescription());
       jLabelMaximunPerson.setText(Integer.toString(newglobals.getActualRoom().getRoomType().getMaximumPersons()));
       jLabelPrice.setText(Integer.toString(newglobals.getActualRoom().getRoomType().getPrice()));
       jLabelRoomSize.setText(Integer.toString(newglobals.getActualRoom().getRoomType().getRoomSize()));
       jLabelRoomType.setText(newglobals.getActualRoom().getRoomType().getRoomType());
       jLabelbedding.setText(newglobals.getActualRoom().getRoomType().getBedding());
         
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelbedding = new javax.swing.JLabel();
        jLabelMaximunPerson = new javax.swing.JLabel();
        jLabelRoomType = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelLiving = new javax.swing.JLabel();
        jLabelTerrace = new javax.swing.JLabel();
        jLabelSeaView = new javax.swing.JLabel();
        jLabelAllInclude = new javax.swing.JLabel();
        jLabelSmoke = new javax.swing.JLabel();
        jLabelRoomSize = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelbedding.setForeground(new java.awt.Color(255, 255, 255));
        jLabelbedding.setText("jLabel1");

        jLabelMaximunPerson.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMaximunPerson.setText("jLabel2");

        jLabelRoomType.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRoomType.setText("jLabel3");

        jLabelDescription.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescription.setText("jLabel4");

        jLabelLiving.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLiving.setText("jLabel5");

        jLabelTerrace.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTerrace.setText("jLabel6");

        jLabelSeaView.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeaView.setText("jLabel7");

        jLabelAllInclude.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAllInclude.setText("jLabel8");

        jLabelSmoke.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSmoke.setText("jLabel9");

        jLabelRoomSize.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRoomSize.setText("jLabel10");

        jLabelPrice.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrice.setText("jLabel11");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Smoke");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Terrace");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Room Size");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Price");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MaximumPersons");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Room Type");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Bedding");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("SeaView");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("All Included");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Description");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Living");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Room Type");

        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel19)))))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSmoke)
                            .addComponent(jLabelAllInclude)
                            .addComponent(jLabelSeaView)
                            .addComponent(jLabelTerrace)
                            .addComponent(jLabelLiving)
                            .addComponent(jLabelDescription)
                            .addComponent(jLabelRoomType)
                            .addComponent(jLabelMaximunPerson)
                            .addComponent(jLabelbedding))
                        .addGap(165, 165, 165))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrice)
                            .addComponent(jLabelRoomSize))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelbedding)
                .addGap(29, 29, 29)
                .addComponent(jLabelMaximunPerson)
                .addGap(32, 32, 32)
                .addComponent(jLabelRoomType)
                .addGap(26, 26, 26)
                .addComponent(jLabelDescription)
                .addGap(18, 18, 18)
                .addComponent(jLabelLiving)
                .addGap(18, 18, 18)
                .addComponent(jLabelTerrace)
                .addGap(18, 18, 18)
                .addComponent(jLabelSeaView)
                .addGap(18, 18, 18)
                .addComponent(jLabelAllInclude)
                .addGap(18, 18, 18)
                .addComponent(jLabelSmoke)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelRoomSize)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPrice)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(29, 29, 29)
                .addComponent(jLabel16)
                .addGap(32, 32, 32)
                .addComponent(jLabel17)
                .addGap(26, 26, 26)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        ViewRoom v = new ViewRoom();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(CharacteristicRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacteristicRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacteristicRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacteristicRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacteristicRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabelAllInclude;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelLiving;
    private javax.swing.JLabel jLabelMaximunPerson;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelRoomSize;
    private javax.swing.JLabel jLabelRoomType;
    private javax.swing.JLabel jLabelSeaView;
    private javax.swing.JLabel jLabelSmoke;
    private javax.swing.JLabel jLabelTerrace;
    private javax.swing.JLabel jLabelbedding;
    // End of variables declaration//GEN-END:variables
}
