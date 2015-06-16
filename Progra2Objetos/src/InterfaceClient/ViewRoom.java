/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceClient;

import globals.Globals;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cristian
 */
public class ViewRoom extends javax.swing.JFrame {
    Globals newglobals = Globals.getInstance();
    DefaultTableModel mdRoom;
    
    public ViewRoom() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("View Room");
        
        //table Rooms-------------------------------------------------------
        mdRoom = (DefaultTableModel)TableRoom.getModel();
        TableRoom.setModel(mdRoom);
        loadRoom();
        
        
    }
    public void loadRoom(){
        if(newglobals.getActualHotel().getRoomsList().isEmpty()){
            return;
        }else{
            for(int i = 0; i < newglobals.getActualHotel().getRoomsList().size(); i++) {
                mdRoom.addRow( new Object[]{newglobals.getActualHotel().getRoomsList().get(i).getRoomnumber(),
                    newglobals.getActualHotel().getRoomsList().get(i).getFlat(),
                    newglobals.getActualHotel().getRoomsList().get(i).getAdultsQuantity(),
                    newglobals.getActualHotel().getRoomsList().get(i).getChildrenQuantity(),
                    newglobals.getActualHotel().getRoomsList().get(i).getRoomType().getRoomType()
                    } ); 
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableRoom = new javax.swing.JTable();
        BtnBack = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Flat", "Adults Quantity", "Children Quantity", "Room Type"
            }
        ));
        jScrollPane1.setViewportView(TableRoom);

        BtnBack.setText("Back");
        BtnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jButton2.setText("Ver characteristic Room");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        this.dispose();
        InterfaceClient nclient = new InterfaceClient();
        nclient.setVisible(true);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        mdRoom = (DefaultTableModel)TableRoom.getModel();
        if(TableRoom.getSelectedRowCount()== 0){
            JOptionPane.showMessageDialog(this,"please select the Room");
            return;
        }  
        
        int RoomNumber;
        int TempSelectRow = TableRoom.getSelectedRow();
        RoomNumber = (int) mdRoom.getValueAt(TempSelectRow, 0);
        for(int i = 0; i <  newglobals.getActualHotel().getRoomsList().size(); i++){
            if(newglobals.getActualHotel().getRoomsList().get(i).getRoomnumber()== (RoomNumber)){
                newglobals.setActualRoom(newglobals.getActualHotel().getRoomsList().get(i));
            }
            
        }
        
        
        
        this.dispose();
        CharacteristicRoom n = new CharacteristicRoom();
        n.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JTable TableRoom;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
