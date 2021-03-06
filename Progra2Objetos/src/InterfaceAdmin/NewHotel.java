/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceAdmin;

import globals.Globals;
import java.awt.Color;
import java.sql.Time;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import progra2objetos.Hotel;
import progra2objetos.Service;


/**
 -------------------------------------------------------------------------
 |intance global hotel puede generar conflicto al insertar un nuevo hotel|
 -------------------------------------------------------------------------
 * @author kevin
 */
public class NewHotel extends javax.swing.JFrame {
        Globals newGlobals = Globals.getInstance();
        Hotel newHotel;
        DefaultListModel mdServices;
        DefaultListModel mdAttractions;
        DefaultListModel mdHotelAttractions;
        DefaultListModel mdHotelServices;
        
        
    /**
     * Creates new form NewHotel
     */
    public NewHotel() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Add New Hotel");
        mdHotelServices = new DefaultListModel();
        jListHotelServices.setModel(mdHotelServices);
        
        mdHotelAttractions = new DefaultListModel();
        jListHotelAttractions.setModel(mdHotelAttractions);
        
        loadServices();
        loadAttractions();
    }
    //Services----------------------------------------------------------------------------------------------------------
    public void loadServices(){
        mdServices = new DefaultListModel();    
        jListServices.setModel(mdServices);
        for (int i = 0; i < newGlobals.getServicesList().size(); i++) {       
            mdServices.addElement(newGlobals.getServicesList().get(i).getServiceName());
        }
    }
    
    public void addService(){
        for (int i = 0; i < mdHotelServices.getSize(); i++) {
            String serviceTemp = mdHotelServices.get(i).toString();
            for (int j = 0; j < newGlobals.getServicesList().size(); j++) {
                if(newGlobals.getServicesList().get(j).getServiceName().equals(serviceTemp)){
                    newGlobals.getActualHotel().setNewService(newGlobals.getServicesList().get(j));
                }
            }
        }
        
        
        
    }
    
    //Attractions------------------------------------------------------------------------------------------------------
    public void loadAttractions(){
        mdAttractions = new DefaultListModel();    
        jListAttractions.setModel(mdAttractions);
        for (int i = 0; i < newGlobals.getAttractionsList().size(); i++) {
            mdAttractions.addElement(newGlobals.getAttractionsList().get(i).getAttractionName());
        }
       
    }
    
    public void addAttraction(){
        for (int i = 0; i < mdHotelAttractions.getSize(); i++) {
            String serviceTemp = mdHotelAttractions.get(i).toString();
            for (int j = 0; j < newGlobals.getAttractionsList().size(); j++) {
                if(newGlobals.getAttractionsList().get(j).getAttractionName().equals(serviceTemp)){
                    newGlobals.getActualHotel().setNewAttraction(newGlobals.getAttractionsList().get(j));
                }
            }
        }
        

    }
    
    public void addHotel(){
         String name = jTextFieldName.getText();
         String address = jTextFieldAddress.getText();
         String country = jTextFieldCountry.getText();
         String typeAccommodation = jTextFieldTypeAccommodation.getText();
         String checkIn = jTextFieldCheckIn.getText();
         String checkOut = jTextFieldCheckOut.getText();
         String checkInRequirements = jTextAreaRequirements.getText();
         String creationyear = jTextFieldCreationyear.getText(); 
         int phoneNumber;
         int stars;
         stars = jComboBoxStars.getSelectedIndex()+1;
         String Description = jTextAreaDescription.getText();
         
         
         String hotelSize = jTextFieldSize.getText();
         try {
            phoneNumber = Integer.parseInt(jTextFieldPhoneNumber.getText());
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this,"Phone number and Stars only allow Number Values");
             return;
        }
         
         newHotel = new Hotel(name,Description,address,country,phoneNumber,stars,typeAccommodation,hotelSize,checkIn,checkOut,checkInRequirements,creationyear);
         newGlobals.setActualHotel(newHotel);
         //add services and Attractions
         addService();
         addAttraction();
         newGlobals.addHotel();
        
         
         
         
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldCountry = new javax.swing.JTextField();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jTextFieldTypeAccommodation = new javax.swing.JTextField();
        jTextFieldSize = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListHotelServices = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListServices = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonAddService = new javax.swing.JButton();
        jButtonDeleteService = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListHotelAttractions = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListAttractions = new javax.swing.JList();
        jButtonAddAttractio = new javax.swing.JButton();
        jButtonDeleteAttraction = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaRequirements = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCreationyear = new javax.swing.JTextField();
        jTextFieldCheckIn = new javax.swing.JTextField();
        jTextFieldCheckOut = new javax.swing.JTextField();
        jComboBoxStars = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Country");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone Number");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stars");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Type Accommodation ");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hotel size");

        jTextFieldTypeAccommodation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTypeAccommodationActionPerformed(evt);
            }
        });

        jButton1.setText("Add Rooms");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListHotelServices);

        jScrollPane2.setViewportView(jListServices);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Services Hotel");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("List of Services");

        jButtonAddService.setText("Add");
        jButtonAddService.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddServiceActionPerformed(evt);
            }
        });

        jButtonDeleteService.setText("Delete");
        jButtonDeleteService.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDeleteService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteServiceActionPerformed(evt);
            }
        });

        jListHotelAttractions.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(jListHotelAttractions);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Attractions Hotel");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("List of Attractios");

        jScrollPane4.setViewportView(jListAttractions);

        jButtonAddAttractio.setText("Add");
        jButtonAddAttractio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAddAttractio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAttractioActionPerformed(evt);
            }
        });

        jButtonDeleteAttraction.setText("Delete");
        jButtonDeleteAttraction.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDeleteAttraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteAttractionActionPerformed(evt);
            }
        });

        jButton2.setText("Save Hotel");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Check-In hour");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Check-Out hour");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Check-In Requirements");

        jTextAreaRequirements.setColumns(20);
        jTextAreaRequirements.setRows(5);
        jScrollPane5.setViewportView(jTextAreaRequirements);

        jButton3.setText("Back");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Creation year");

        jComboBoxStars.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Star", "2 Stars", "3 Stars", "4 Stars", "5 Stars", " " }));
        jComboBoxStars.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Description");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane6.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldSize, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jTextFieldTypeAccommodation, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCountry)
                            .addComponent(jTextFieldAddress)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCheckIn)
                            .addComponent(jTextFieldCheckOut)
                            .addComponent(jComboBoxStars, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5)
                            .addComponent(jTextFieldCreationyear))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonDeleteService)
                                    .addComponent(jButtonAddService, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAddAttractio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDeleteAttraction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAddService)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeleteService))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBoxStars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextFieldTypeAccommodation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAddAttractio)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeleteAttraction))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextFieldCreationyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTypeAccommodationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTypeAccommodationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTypeAccommodationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addHotel();
        if(newGlobals.getRoomTypesList().isEmpty()){
            JOptionPane.showMessageDialog(this,"You need add a RoomType");
            InterfaceAdmin windows = new InterfaceAdmin();
            this.dispose();
            windows.setVisible(true);
            
        }else{
        newGlobals.setActualHotel(newHotel);
        NewRooms newRoomtemp = new NewRooms();
        this.dispose();
        newRoomtemp.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addHotel();
        newGlobals.setActualHotelNull();
        JOptionPane.showMessageDialog(this,"successfully added");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddServiceActionPerformed
        String selectedValueS = jListServices.getSelectedValue().toString();
        mdHotelServices.addElement(selectedValueS);
        
    }//GEN-LAST:event_jButtonAddServiceActionPerformed

    private void jButtonAddAttractioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAttractioActionPerformed
        String selectedValueA = jListAttractions.getSelectedValue().toString();
        System.out.println(selectedValueA);
        mdHotelAttractions.addElement(selectedValueA);
    }//GEN-LAST:event_jButtonAddAttractioActionPerformed

    private void jButtonDeleteServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteServiceActionPerformed
        if(jListHotelServices.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Please Select a Service in the Hotel Services list");
            return;
        }
        
        int selectedValue = jListHotelServices.getSelectedIndex();
        mdHotelServices.removeElementAt(selectedValue);
        jListHotelServices.setModel(mdHotelServices);
    }//GEN-LAST:event_jButtonDeleteServiceActionPerformed

    private void jButtonDeleteAttractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteAttractionActionPerformed
        if(jListHotelAttractions.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Please Select a Attraction in the Hotel Attractions list");
            return;
        }
        
        int selectedValue = jListHotelAttractions.getSelectedIndex();
        mdHotelAttractions.removeElementAt(selectedValue);
        jListHotelAttractions.setModel(mdHotelAttractions);
    }//GEN-LAST:event_jButtonDeleteAttractionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        InterfaceAdmin newWindows = new InterfaceAdmin();
        this.dispose();
        newWindows.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAddAttractio;
    private javax.swing.JButton jButtonAddService;
    private javax.swing.JButton jButtonDeleteAttraction;
    private javax.swing.JButton jButtonDeleteService;
    private javax.swing.JComboBox jComboBoxStars;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListAttractions;
    private javax.swing.JList jListHotelAttractions;
    private javax.swing.JList jListHotelServices;
    private javax.swing.JList jListServices;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextArea jTextAreaRequirements;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldCheckIn;
    private javax.swing.JTextField jTextFieldCheckOut;
    private javax.swing.JTextField jTextFieldCountry;
    private javax.swing.JTextField jTextFieldCreationyear;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldSize;
    private javax.swing.JTextField jTextFieldTypeAccommodation;
    // End of variables declaration//GEN-END:variables
}
