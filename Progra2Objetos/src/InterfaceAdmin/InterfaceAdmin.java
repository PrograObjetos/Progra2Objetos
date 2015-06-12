/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceAdmin;

import Interface.Login;
import globals.Globals;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import progra2objetos.Attraction;
import progra2objetos.Service;

/**
 *
 * @author kevin
 */
public class InterfaceAdmin extends javax.swing.JFrame {
        Service newService;
        Attraction newAttraction;
        int code = 1;
        int ID = 1;
        Globals newGlobals = Globals.getInstance();
        DefaultTableModel mdService;
        DefaultTableModel mdAttraction;
        DefaultTableModel mdRoomTypes;
        
        
        
        
    /**
     * Creates new form InterfaceAdmin
     */
    public InterfaceAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Admin Options");
        
        //table Room Types------------------------------------------------------
        mdRoomTypes = (DefaultTableModel)jTableRoomTypes.getModel();
        jTableRoomTypes.setModel(mdRoomTypes);
        loadRoomTypes();
        
        //table Services--------------------------------------------------------
        mdService = (DefaultTableModel)jTableServices.getModel();
        jTableServices.setModel(mdService);
        loadServices();
        
        //table Attractions-----------------------------------------------------
        mdAttraction = (DefaultTableModel)jTableAttractions.getModel();
        jTableAttractions.setModel(mdAttraction);
        loadAttractions();
        
          
        
    }
   //Room Types Table--------------------------------------------------------------------------------------------------
    public void loadRoomTypes(){
        if(newGlobals.getRoomTypesList().isEmpty()){
            return;
        }else{
            for(int i = 0; i < newGlobals.getRoomTypesList().size(); i++) {
                mdRoomTypes.addRow( new Object[]{newGlobals.getRoomTypesList().get(i).getRoomType() ,
                    newGlobals.getRoomTypesList().get(i).getDescription(),
                    newGlobals.getRoomTypesList().get(i).getMaximumPersons(),
                    newGlobals.getRoomTypesList().get(i).getBedding(),
                    newGlobals.getRoomTypesList().get(i).getPrice(),
                    newGlobals.getRoomTypesList().get(i).isAllInclusive(),
                    newGlobals.getRoomTypesList().get(i).isLiving(),
                    newGlobals.getRoomTypesList().get(i).isTerrace(),
                    newGlobals.getRoomTypesList().get(i).isSeaview(),
                    newGlobals.getRoomTypesList().get(i).isSmoke()} ); 
            }
        }  
    }
    
    
    
   //Services table-----------------------------------------------------------------------------------------------------
    public void deleteService(String ServiceName){
        for (int i = 0; i < newGlobals.getServicesList().size(); i++) {
            if(newGlobals.getServicesList().get(i).getServiceName().equals(ServiceName)){
                newGlobals.getServicesList().remove(i);
            }
        }
    }
    
    public void loadServices(){
        if(newGlobals.getServicesList().isEmpty()){
            return;
        }else{
            for(int i = 0; i < newGlobals.getServicesList().size(); i++) {
                mdService.addRow( new Object[]{newGlobals.getServicesList().get(i).getCode() ,
                    newGlobals.getServicesList().get(i).getServiceName()} ); 
            }
           
            code = (newGlobals.getServicesList().get((newGlobals.getServicesList().size())-1).getCode())+1;
        }   
    }
    
    public void updateTableService(){
           mdService.addRow( new Object[]{code-1 , jTextFieldServiceName.getText()} );   
    }
    
    public void AddService(){
        newService = new Service(code,jTextFieldServiceName.getText());
        newGlobals.setNewService(newService);
        code+=1;   
    }
    
    //Attractions Table-------------------------------------------------------------------------------------------------------------
    public void deleteAttraction(String AttractionName){
        for (int i = 0; i < newGlobals.getAttractionsList().size(); i++) {
            if(newGlobals.getAttractionsList().get(i).getAttractionName().equals(AttractionName)){
                newGlobals.getAttractionsList().remove(i);
            }
        }
    }
    
    public void loadAttractions(){
        if(newGlobals.getAttractionsList().isEmpty()){
            return;
        }else{
            for(int i = 0; i < newGlobals.getAttractionsList().size(); i++) {
                mdAttraction.addRow( new Object[]{newGlobals.getAttractionsList().get(i).getID(),
                    newGlobals.getAttractionsList().get(i).getAttractionName()} ); 

            }
            code = (newGlobals.getAttractionsList().get((newGlobals.getAttractionsList().size())-1).getID())+1;
        }
        
    }
    public void updateTableAttraction(){
           mdAttraction.addRow( new Object[]{ID-1 , jTextFieldAttractionName.getText()} );   
    }
    
    public void AddAttraction(){
        newAttraction = new Attraction(ID,jTextFieldAttractionName.getText());
        newGlobals.setNewAttraction(newAttraction);
        ID+=1;   
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonNewHotel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHotels = new javax.swing.JTable();
        BtnBack = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRoomTypes = new javax.swing.JTable();
        jButtonNewType = new javax.swing.JButton();
        jButtonDeleteType = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSeasons = new javax.swing.JTable();
        jButtonPriceRoom = new javax.swing.JButton();
        jButtonSeePriceRooms = new javax.swing.JButton();
        jButtonAddSeason = new javax.swing.JButton();
        jButtonDeleteSEason = new javax.swing.JButton();
        jButtonBack1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableServices = new javax.swing.JTable();
        jButtonback2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldServiceName = new javax.swing.JTextField();
        jButtonAddService = new javax.swing.JButton();
        jButtonDeleteService = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableAttractions = new javax.swing.JTable();
        jButtonDeleteAttraction = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAttractionName = new javax.swing.JTextField();
        jButtonAddAttraction = new javax.swing.JButton();
        jButtonback3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonNewHotel.setText("Add New Hotel");
        jButtonNewHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewHotelActionPerformed(evt);
            }
        });

        jButton1.setText("Delete Hotel");

        jTableHotels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone Number", "Description", "Stars"
            }
        ));
        jScrollPane1.setViewportView(jTableHotels);

        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jButton2.setText("See Hotel");

        jButton3.setText("Add Rooms");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButtonNewHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)
                        .addGap(236, 236, 236)
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewHotel)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jTabbedPane1.addTab("Hotel options", jPanel1);

        jTableRoomTypes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Type", "Description", "#Persons", "Bedding", "Price", "all-inclusive", "Living", "Terrace", "Seaview", "Smoke"
            }
        ));
        jScrollPane2.setViewportView(jTableRoomTypes);

        jButtonNewType.setText("Add New Type");
        jButtonNewType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewTypeActionPerformed(evt);
            }
        });

        jButtonDeleteType.setText("Delete a Type");

        jButtonBack.setText("Back");

        jButton4.setText("Seen Room Type");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonNewType)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonDeleteType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBack)))
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(jButtonNewType)
                    .addComponent(jButtonDeleteType)
                    .addComponent(jButton4))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Types Rooms", jPanel3);

        jTableSeasons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code", "Season Name", "StartDate", "EndDate"
            }
        ));
        jScrollPane3.setViewportView(jTableSeasons);

        jButtonPriceRoom.setText("Add price to a Specific Type Room");

        jButtonSeePriceRooms.setText("See the Current Price of the diferents Type rooms");

        jButtonAddSeason.setText("Add Season");

        jButtonDeleteSEason.setText("Delete Season");

        jButtonBack1.setText("Back");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPriceRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSeePriceRooms))
                        .addGap(163, 163, 163)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonDeleteSEason, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAddSeason, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBack1)
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPriceRoom)
                            .addComponent(jButtonAddSeason))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDeleteSEason)
                            .addComponent(jButtonSeePriceRooms))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBack1)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Seasons", jPanel2);

        jTableServices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Service Name"
            }
        ));
        jScrollPane4.setViewportView(jTableServices);

        jButtonback2.setText("Back");

        jLabel1.setText("Add Service");

        jLabel2.setText("Service Name");

        jButtonAddService.setText("Add");
        jButtonAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddServiceActionPerformed(evt);
            }
        });

        jButtonDeleteService.setText("Delete Service");
        jButtonDeleteService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonback2)
                .addGap(196, 196, 196))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAddService)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(27, 27, 27)
                                    .addComponent(jTextFieldServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonDeleteService)
                        .addGap(0, 345, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteService))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAddService)
                .addGap(27, 27, 27)
                .addComponent(jButtonback2)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Services", jPanel4);

        jTableAttractions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Attraction Name"
            }
        ));
        jScrollPane5.setViewportView(jTableAttractions);

        jButtonDeleteAttraction.setText("Delete Attraction");
        jButtonDeleteAttraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteAttractionActionPerformed(evt);
            }
        });

        jLabel3.setText("Add new Attraction");

        jLabel4.setText("Attraction Name");

        jButtonAddAttraction.setText("Add");
        jButtonAddAttraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAttractionActionPerformed(evt);
            }
        });

        jButtonback3.setText("Back");
        jButtonback3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonback3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonAddAttraction)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(44, 44, 44)
                                    .addComponent(jTextFieldAttractionName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonback3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(jButtonDeleteAttraction))))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDeleteAttraction)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldAttractionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButtonback3)
                        .addGap(13, 13, 13)))
                .addComponent(jButtonAddAttraction)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Attractions", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        this.dispose();
        Login nl = new Login();
        nl.setVisible(true);
        
    }//GEN-LAST:event_BtnBackActionPerformed

    private void jButtonAddAttractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAttractionActionPerformed
        if(jTextFieldAttractionName.getText().equals("")){
            JOptionPane.showMessageDialog(this,"The Attraction Name can't be null");
            return;
        }
            
        AddAttraction();
        updateTableAttraction();
        jTextFieldAttractionName.setText(null);
        
    }//GEN-LAST:event_jButtonAddAttractionActionPerformed

    private void jButtonNewHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewHotelActionPerformed
       NewHotel newHotel = new NewHotel();
       this.dispose();
       newHotel.setVisible(true);
    }//GEN-LAST:event_jButtonNewHotelActionPerformed

    private void jButtonAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddServiceActionPerformed
        if(jTextFieldServiceName.getText().equals("")){
            JOptionPane.showMessageDialog(this,"The Service Name can't be null");
            return;
        }
        AddService();
      updateTableService();
      jTextFieldServiceName.setText(null);

    }//GEN-LAST:event_jButtonAddServiceActionPerformed

    private void jButtonDeleteAttractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteAttractionActionPerformed
        mdAttraction = (DefaultTableModel)jTableAttractions.getModel();
        if(jTableAttractions.getSelectedRowCount()== 0){
            JOptionPane.showMessageDialog(this,"please select the Attraction to delete");
            return;
        }
        
        String AttractionName;
        int TempSelectRow = jTableAttractions.getSelectedRow();
        AttractionName = mdAttraction.getValueAt(TempSelectRow, 1).toString();
        deleteAttraction(AttractionName);
        mdAttraction.removeRow(jTableAttractions.getSelectedRow());
        mdAttraction = null;
    }//GEN-LAST:event_jButtonDeleteAttractionActionPerformed

    private void jButtonDeleteServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteServiceActionPerformed
        mdService = (DefaultTableModel)jTableServices.getModel();
        if(jTableServices.getSelectedRowCount()== 0){
            JOptionPane.showMessageDialog(this,"please select the Service to delete");
            return;
        }
        
        
        String ServiceName;
        int TempSelectRow = jTableServices.getSelectedRow();
        ServiceName = mdService.getValueAt(TempSelectRow, 1).toString();
        deleteService(ServiceName);
        mdService.removeRow(jTableServices.getSelectedRow());
        mdService = null;
    }//GEN-LAST:event_jButtonDeleteServiceActionPerformed

    private void jButtonback3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonback3ActionPerformed
        this.dispose();
        InterfaceAdmin newI = new InterfaceAdmin();
        newI.setVisible(true);
    }//GEN-LAST:event_jButtonback3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonNewTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewTypeActionPerformed
        NewRoomType newRoomTypeWindows = new NewRoomType();
        this.dispose();
        newRoomTypeWindows.setVisible(true);
    }//GEN-LAST:event_jButtonNewTypeActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAddAttraction;
    private javax.swing.JButton jButtonAddSeason;
    private javax.swing.JButton jButtonAddService;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonBack1;
    private javax.swing.JButton jButtonDeleteAttraction;
    private javax.swing.JButton jButtonDeleteSEason;
    private javax.swing.JButton jButtonDeleteService;
    private javax.swing.JButton jButtonDeleteType;
    private javax.swing.JButton jButtonNewHotel;
    private javax.swing.JButton jButtonNewType;
    private javax.swing.JButton jButtonPriceRoom;
    private javax.swing.JButton jButtonSeePriceRooms;
    private javax.swing.JButton jButtonback2;
    private javax.swing.JButton jButtonback3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAttractions;
    private javax.swing.JTable jTableHotels;
    private javax.swing.JTable jTableRoomTypes;
    private javax.swing.JTable jTableSeasons;
    private javax.swing.JTable jTableServices;
    private javax.swing.JTextField jTextFieldAttractionName;
    private javax.swing.JTextField jTextFieldServiceName;
    // End of variables declaration//GEN-END:variables
}
