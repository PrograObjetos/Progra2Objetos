/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceClient;

import Interface.Login;
//import Interface.NewClient;
import globals.Globals;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;
import progra2objetos.Client;
//import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;
import progra2objetos.Card;
//import sun.org.mozilla.javascript.internal.ScriptRuntime;

/**
 *
 * @author kevin
 */
public class InterfaceClient extends javax.swing.JFrame {

       Globals newglobals = Globals.getInstance();
       Card newcard;
       DefaultTableModel mdCard;
    /**
     * Creates new form InterfaceCliente
     */
    public InterfaceClient() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Interface Client");
        
        
        //table Services--------------------------------------------------------
        mdCard = (DefaultTableModel)TableCard.getModel();
        TableCard.setModel(mdCard);
        loadCard();
        
        
        
    }
    
    public void loadCard(){
         if(newglobals.getActualClient().getCardList().isEmpty()){
             return;
         }
         else{
             for (int i = 0; i < newglobals.getActualClient().getCardList().size(); i++) {
                 mdCard.addRow(new Object[]{newglobals.getActualClient().getCardList().get(i).getName(),
                     newglobals.getActualClient().getCardList().get(i).getLastName(),
                     newglobals.getActualClient().getCardList().get(i).getType(),
                     newglobals.getActualClient().getCardList().get(i).getCardNumber(),
                     newglobals.getActualClient().getCardList().get(i).getExpirationDate()});
             }
         }
    }
    
    public static void reiniciarJTable(javax.swing.JTable Tabla){
            DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
            while(modelo.getRowCount()>0)modelo.removeRow(0);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Genero = new javax.swing.ButtonGroup();
        TableClient = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNameTitularCard = new javax.swing.JTextField();
        txtTitularLastName = new javax.swing.JTextField();
        txtCardNumber = new javax.swing.JTextField();
        txtSecuriryCodeCard = new javax.swing.JPasswordField();
        txtdateExpirationDate = new javax.swing.JTextField();
        ComboBoxTypeCard = new javax.swing.JComboBox();
        BtnAddTypeCard = new javax.swing.JButton();
        txtAddCard = new javax.swing.JTextField();
        BtnAddCard = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCard = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        TextFieldPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboBoxCurrency = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnProfile = new javax.swing.JButton();
        TextFieldAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextFieldName = new javax.swing.JTextField();
        TextFieldLastName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        TextFieldPhoneNumber = new javax.swing.JTextField();
        TextFieldCountry = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TextFieldRePassword = new javax.swing.JTextField();
        BtnEdit = new javax.swing.JButton();
        BtnData = new javax.swing.JButton();
        RadioButtonMasculino = new javax.swing.JRadioButton();
        RadioButtonFemenino = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableClient.setBackground(new java.awt.Color(51, 51, 51));
        TableClient.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        TableClient.addTab("Hotels", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        TableClient.addTab("Reservations", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Name");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Last Name");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Type");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CardNumber");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("SecurityCode");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("ExpirationDate");

        ComboBoxTypeCard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Visa", "Master Card", "Discover", "AmericanExpress" }));

        BtnAddTypeCard.setText("Add Type Card");
        BtnAddTypeCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAddTypeCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddTypeCardActionPerformed(evt);
            }
        });

        BtnAddCard.setText("Add Card");
        BtnAddCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAddCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddCardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAddCard)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameTitularCard)
                            .addComponent(txtTitularLastName)
                            .addComponent(txtCardNumber)
                            .addComponent(txtSecuriryCodeCard)
                            .addComponent(txtdateExpirationDate)
                            .addComponent(ComboBoxTypeCard, 0, 214, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnAddTypeCard)
                            .addComponent(txtAddCard, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNameTitularCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTitularLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(ComboBoxTypeCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAddTypeCard))
                .addGap(18, 18, 18)
                .addComponent(txtAddCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSecuriryCodeCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtdateExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(BtnAddCard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableClient.addTab("Card", jPanel4);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        TableCard.setBackground(new java.awt.Color(51, 51, 51));
        TableCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TableCard.setForeground(new java.awt.Color(255, 255, 255));
        TableCard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Last Name", "Type Card", "CardNumber", "ExpirationDate"
            }
        ));
        jScrollPane1.setViewportView(TableCard);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 203, Short.MAX_VALUE))
        );

        TableClient.addTab("View Cards", jPanel5);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        TextFieldPassword.setEnabled(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Country");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Corrency ");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Age");

        ComboBoxCurrency.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "colones", "dollars" }));
        ComboBoxCurrency.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        BtnBack.setText("Back");
        BtnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User Infomation");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");

        BtnProfile.setText("Save");
        BtnProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfileActionPerformed(evt);
            }
        });

        TextFieldAge.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RePassword");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");

        TextFieldName.setEnabled(false);

        TextFieldLastName.setEnabled(false);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Personal information");

        TextFieldEmail.setEnabled(false);

        TextFieldPhoneNumber.setEnabled(false);

        TextFieldCountry.setEnabled(false);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PhoneNumber");

        TextFieldRePassword.setEnabled(false);

        BtnEdit.setText("Edit");
        BtnEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnData.setText("Print data");
        BtnData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDataActionPerformed(evt);
            }
        });

        RadioButtonMasculino.setBackground(new java.awt.Color(51, 51, 51));
        Genero.add(RadioButtonMasculino);
        RadioButtonMasculino.setForeground(new java.awt.Color(255, 255, 255));
        RadioButtonMasculino.setText("Male");
        RadioButtonMasculino.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RadioButtonFemenino.setBackground(new java.awt.Color(51, 51, 51));
        Genero.add(RadioButtonFemenino);
        RadioButtonFemenino.setForeground(new java.awt.Color(255, 255, 255));
        RadioButtonFemenino.setText("Female");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TextFieldPassword)
                                .addComponent(TextFieldRePassword)
                                .addComponent(TextFieldName)
                                .addComponent(TextFieldLastName)
                                .addComponent(TextFieldAge, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RadioButtonFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RadioButtonMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(BtnData, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextFieldRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(TextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(TextFieldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(TextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonFemenino)
                    .addComponent(RadioButtonMasculino)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        TableClient.addTab("Profile", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TableClient)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TableClient, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed

        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProfileActionPerformed
        String name = TextFieldName.getText();
        String lastName = TextFieldLastName.getText();
        String email = TextFieldEmail.getText();
        String password = TextFieldPassword.getText();
        String encrip = DigestUtils.md5Hex(password);
        String checkPassword = TextFieldRePassword.getText();
        int age;
        String country = TextFieldCountry.getText();
        String Currency = ComboBoxCurrency.getSelectedItem().toString();
        int phonenumber;
        String gender;

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
        if(country.equals("")){
            JOptionPane.showMessageDialog(this,"Empty Country");
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

        try{
            phonenumber = Integer.parseInt(TextFieldPhoneNumber.getText());

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Numbers only");
            TextFieldPhoneNumber.setText("");
            return;
        }

        if(RadioButtonFemenino.isSelected()){
            gender = RadioButtonFemenino.getLabel();
        }
        else{
            gender = RadioButtonMasculino.getLabel();
        }

        int membershipnumber=newglobals.getActualClient().getMembershipnumber();
        Client newclient = new Client(name, lastName, gender, email, encrip, checkPassword, membershipnumber,age ,country,phonenumber,Currency);
        newglobals.setActualClient(newclient);
        

        TextFieldName.setText("");
        TextFieldLastName.setText("");
        TextFieldEmail.setText("");
        TextFieldPassword.setText("");
        TextFieldRePassword.setText("");
        TextFieldAge.setText("");
        TextFieldPhoneNumber.setText("");
        TextFieldCountry.setText("");
        this.dispose();
        InterfaceClient it = new InterfaceClient();
        it.setVisible(true);
        
       // Login nl = new Login();
        //nl.setVisible(true);
    }//GEN-LAST:event_BtnProfileActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        TextFieldEmail.enable();
        TextFieldPassword.enable();
        TextFieldRePassword.enable();
        TextFieldName.enable();
        TextFieldLastName.enable();
        TextFieldAge.enable();
        TextFieldPhoneNumber.enable();
        TextFieldCountry.enable();
        ComboBoxCurrency.enable();
        RadioButtonFemenino.enable();
        RadioButtonMasculino.enable();
        
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDataActionPerformed
         String male ="Male";
        TextFieldEmail.setText(newglobals.getActualClient().getEmail());
        TextFieldPassword.setText(newglobals.getActualClient().getCheckPassword());
        TextFieldRePassword.setText(newglobals.getActualClient().getCheckPassword());
        TextFieldName.setText(newglobals.getActualClient().getName());
        TextFieldLastName.setText(newglobals.getActualClient().getLastName());
        TextFieldAge.setText(String.valueOf(newglobals.getActualClient().getAge()));
        TextFieldPhoneNumber.setText(String.valueOf(newglobals.getActualClient().getPhonenumber()));
        TextFieldCountry.setText(newglobals.getActualClient().getCountry());
        
        if(newglobals.getActualClient().getCurrency().equals("colones")){
            ComboBoxCurrency.setSelectedIndex(0);
        }else{
            ComboBoxCurrency.setSelectedIndex(1);
        }
        
        
        if(newglobals.getActualClient().getGender().equals(male)){
            RadioButtonMasculino.setSelected(true);
        }
        else{
            RadioButtonFemenino.setSelected(true);
        }
        
    }//GEN-LAST:event_BtnDataActionPerformed

    private void BtnAddCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddCardActionPerformed
        String nameTitularCard = txtNameTitularCard.getText();
        String lastNameTitular = txtTitularLastName.getText();
        String typeCard = ComboBoxTypeCard.getSelectedItem().toString();
        int cardNumber;
        int segurityCode;
        GregorianCalendar date = new GregorianCalendar();
        date.set(WIDTH, WIDTH, WIDTH);
        
        
        
        if(nameTitularCard.equals("")){
            JOptionPane.showMessageDialog(this,"Empty name");
            return;
        }
        if(lastNameTitular.equals("")){
            JOptionPane.showMessageDialog(this,"Empty Lastname");
            return;
        }
        try{
            cardNumber = Integer.parseInt(txtCardNumber.getText());

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Numbers only");
            txtCardNumber.setText("");
            return;
        }

        try{
            segurityCode = Integer.parseInt(txtSecuriryCodeCard.getText());

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Numbers only");
            txtSecuriryCodeCard.setText("");
            return;
        }
        
        Card newcard = new Card(nameTitularCard, lastNameTitular, typeCard, cardNumber, segurityCode, null);
        newglobals.getActualClient().setNewCard(newcard);
        
        txtNameTitularCard.setText("");
        txtTitularLastName.setText("");
        txtCardNumber.setText("");
        txtdateExpirationDate.setText("");
        txtAddCard.setText("");
        txtSecuriryCodeCard.setText("");
        
      
        reiniciarJTable(TableCard);
        loadCard();
        
        
    }//GEN-LAST:event_BtnAddCardActionPerformed

    private void BtnAddTypeCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddTypeCardActionPerformed
        String addcard = txtAddCard.getText();
        
        if(addcard.equals("")){
            JOptionPane.showMessageDialog(this,"Empty Type Card");
            return;
        }
        
        ComboBoxTypeCard.addItem(txtAddCard.getText());
    }//GEN-LAST:event_BtnAddTypeCardActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddCard;
    private javax.swing.JButton BtnAddTypeCard;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnData;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnProfile;
    private javax.swing.JComboBox ComboBoxCurrency;
    private javax.swing.JComboBox ComboBoxTypeCard;
    private javax.swing.ButtonGroup Genero;
    private javax.swing.JRadioButton RadioButtonFemenino;
    private javax.swing.JRadioButton RadioButtonMasculino;
    private javax.swing.JTable TableCard;
    private javax.swing.JTabbedPane TableClient;
    private javax.swing.JTextField TextFieldAge;
    private javax.swing.JTextField TextFieldCountry;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldLastName;
    private javax.swing.JTextField TextFieldName;
    private javax.swing.JTextField TextFieldPassword;
    private javax.swing.JTextField TextFieldPhoneNumber;
    private javax.swing.JTextField TextFieldRePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddCard;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtNameTitularCard;
    private javax.swing.JPasswordField txtSecuriryCodeCard;
    private javax.swing.JTextField txtTitularLastName;
    private javax.swing.JTextField txtdateExpirationDate;
    // End of variables declaration//GEN-END:variables
}
