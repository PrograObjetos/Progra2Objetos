package Interface;

import globals.Globals;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;
import progra2objetos.Client;


public class NewClient extends javax.swing.JFrame {

   
    public NewClient() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("New client");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Genero = new javax.swing.ButtonGroup();
        jButtonSave = new javax.swing.JButton();
        TextFieldAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextFieldLastName = new javax.swing.JTextField();
        TextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TextFieldPassword = new javax.swing.JTextField();
        TextFieldRePassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RadioButtonMasculino = new javax.swing.JRadioButton();
        RadioButtonFemenino = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabel6.setText("Email");

        jLabel2.setText("Last Name");

        jLabel5.setText("RePassword");

        jLabel4.setText("Password");

        jLabel7.setText("Age");

        jLabel8.setText("User Infomation");

        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel9.setText("Personal information");

        jLabel3.setText("Genero");

        Genero.add(RadioButtonMasculino);
        RadioButtonMasculino.setText("Male");
        RadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonMasculinoActionPerformed(evt);
            }
        });

        Genero.add(RadioButtonFemenino);
        RadioButtonFemenino.setText("Female");
        RadioButtonFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonFemeninoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioButtonFemenino)
                .addGap(18, 18, 18)
                .addComponent(RadioButtonMasculino)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonMasculino)
                    .addComponent(RadioButtonFemenino)
                    .addComponent(jLabel3))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextFieldEmail)
                            .addComponent(TextFieldPassword)
                            .addComponent(TextFieldRePassword)
                            .addComponent(TextFieldName)
                            .addComponent(TextFieldLastName)
                            .addComponent(TextFieldAge, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButtonSave)
                                .addGap(54, 54, 54)
                                .addComponent(BtnBack))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextFieldRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(TextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(BtnBack))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String name = TextFieldName.getText();
        String lastName = TextFieldLastName.getText();
        String email = TextFieldEmail.getText();
        
        String password = TextFieldPassword.getText();
        String encrip = DigestUtils.md5Hex(password);
        System.out.println(password);
        System.out.println(encrip);
        String checkPassword = TextFieldRePassword.getText();
        int age = Integer.parseInt(TextFieldAge.getText());
        
        if(!password.equals(checkPassword)){
            JOptionPane.showMessageDialog(this, "password and check password different");
            return;
        }

        if(name.equals("")){
            JOptionPane.showMessageDialog(this,"Empty name");
            return;
        }
        if(lastName.equals("")){
            JOptionPane.showMessageDialog(this,"Empty Lastname");
            return;
        }
        if(email.equals("")){
            JOptionPane.showMessageDialog(this,"Empty Email");
            return;
        }
        if(password.equals("")){
            JOptionPane.showMessageDialog(this,"Empty Password");
            return;
        }
        if(checkPassword.equals("")){
            JOptionPane.showMessageDialog(this,"Empty checkPassword");
            return;
        }
        try{
            age = Integer.parseInt(TextFieldAge.getText());  
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Numbers only");
            TextFieldAge.setText("");
            return;
        }
        
        for(int i = 0; i <  Globals.getInstance().clientList.size(); i++){
            if( Globals.getInstance().clientList.get(i).getName().equals(name)){
                
                if(Globals.getInstance().clientList.get(i).getPassword().equals(encrip)){
                    JOptionPane.showMessageDialog(this,"Contact already registered");
                    TextFieldName.setText("");
                    TextFieldLastName.setText("");
                    TextFieldEmail.setText("");
                    TextFieldPassword.setText("");
                    TextFieldRePassword.setText("");
                    TextFieldAge.setText("");
                    return;
                }
            }
        }
        Client newclient = new Client(name, lastName, encrip, email, encrip, checkPassword, age);
        Globals.getInstance().setUserList(newclient);
             
        TextFieldName.setText("");
        TextFieldLastName.setText("");
        TextFieldEmail.setText("");
        TextFieldPassword.setText("");
        TextFieldRePassword.setText("");
        TextFieldAge.setText(""); 
        this.dispose();
        Login nl = new Login();
        nl.setVisible(true);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void RadioButtonFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonFemeninoActionPerformed
        
    }//GEN-LAST:event_RadioButtonFemeninoActionPerformed

    private void RadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonMasculinoActionPerformed
        
    }//GEN-LAST:event_RadioButtonMasculinoActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed

        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

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
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    public static javax.swing.ButtonGroup Genero;
    private javax.swing.JRadioButton RadioButtonFemenino;
    private javax.swing.JRadioButton RadioButtonMasculino;
    private javax.swing.JTextField TextFieldAge;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldLastName;
    private javax.swing.JTextField TextFieldName;
    private javax.swing.JTextField TextFieldPassword;
    private javax.swing.JTextField TextFieldRePassword;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
