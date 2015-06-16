/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceAdmin;

import Interface.Login;
import globals.Globals;
import java.awt.Color;
import java.util.GregorianCalendar;
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
        DefaultTableModel mdHotels;
        DefaultTableModel mdSeasons;
        
        
        
        
    /**
     * Creates new form InterfaceAdmin
     */
    public InterfaceAdmin() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Admin Options");
        
        //tableSeasons----------------------------------------------------------
        mdSeasons = (DefaultTableModel)jTableSeasons.getModel();
        jTableSeasons.setModel(mdSeasons);
        loadSeasons();
        
        //table Hotels----------------------------------------------------------
        mdHotels = (DefaultTableModel)jTableHotels.getModel();
        jTableHotels.setModel(mdHotels);
        loadHotels();
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
   //Season Table---------------------------------------------------------------
    public void loadSeasons(){
        GregorianCalendar startDate = new GregorianCalendar();
        GregorianCalendar endDate = new GregorianCalendar();
        
        if(newGlobals.getSeasonsList().isEmpty()){
            return;
        }else{
            for(int i = 0; i < newGlobals.getSeasonsList().size(); i++) {
                startDate.setTime(newGlobals.getSeasonsList().get(i).getStartDate());
                endDate.setTime(newGlobals.getSeasonsList().get(i).getEndDate()); 
                mdSeasons.addRow( new Object[]{newGlobals.getSeasonsList().get(i).getName() ,
                    newGlobals.getSeasonsList().get(i).getCode(),
                    Integer.toString(startDate.get(2))+" / "+ Integer.toString(startDate.get(5)),
                    Integer.toString(endDate.get(2))+" / "+ Integer.toString(endDate.get(5))}); 
            }
        }
    }
    public void deleteSeason(String SeasonName){
        for (int i = 0; i < newGlobals.getSeasonsList().size(); i++) {
            if(newGlobals.getSeasonsList().get(i).getName().equals(SeasonName)){
                newGlobals.getSeasonsList().remove(i);
            }
        }
    }
    
    
   //Hotels Table------------------------------------------------------------------------------------------------------
    public void loadHotels(){
        if(newGlobals.getHotelsList().isEmpty()){
            return;
        }else{
            for(int i = 0; i < newGlobals.getHotelsList().size(); i++) {
                mdHotels.addRow( new Object[]{newGlobals.getHotelsList().get(i).getName() ,
                    newGlobals.getHotelsList().get(i).getPhoneNumber(),
                    newGlobals.getHotelsList().get(i).getDescription(),
                    newGlobals.getHotelsList().get(i).getStars(),
                    newGlobals.getHotelsList().get(i).getAddress(),
                    newGlobals.getHotelsList().get(i).getCountry(),
                    newGlobals.getHotelsList().get(i).getTypeAccommodation(),
                    newGlobals.getHotelsList().get(i).getSizeHotel(),
                    newGlobals.getHotelsList().get(i).getTimeCheckIn(),
                    newGlobals.getHotelsList().get(i).getTimeCheckOut(),
                    newGlobals.getHotelsList().get(i).getRequirementsCheckIn(),
                    newGlobals.getHotelsList().get(i).getYearBuilt()} ); 
            }
        }
    }
    
    public void deleteHotel(String HotelName){
        for (int i = 0; i < newGlobals.getHotelsList().size(); i++) {
            if(newGlobals.getHotelsList().get(i).getName().equals(HotelName)){
                newGlobals.getHotelsList().remove(i);
            }
        }
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
    
    public void deleteRoomType(String RoomtypeName){
        for (int i = 0; i < newGlobals.getRoomTypesList().size(); i++) {
            if(newGlobals.getRoomTypesList().get(i).getRoomType().equals(RoomtypeName)){
                newGlobals.getRoomTypesList().remove(i);
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
            ID = (newGlobals.getAttractionsList().get((newGlobals.getAttractionsList().size())-1).getID())+1;
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
        jButtonDeleteHotel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHotels = new javax.swing.JTable();
        BtnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRoomTypes = new javax.swing.JTable();
        jButtonNewType = new javax.swing.JButton();
        jButtonDeleteType = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
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

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jButtonNewHotel.setText("Add New Hotel");
        jButtonNewHotel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNewHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewHotelActionPerformed(evt);
            }
        });

        jButtonDeleteHotel.setText("Delete Hotel");
        jButtonDeleteHotel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDeleteHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteHotelActionPerformed(evt);
            }
        });

        jTableHotels.setBackground(new java.awt.Color(51, 51, 51));
        jTableHotels.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableHotels.setForeground(new java.awt.Color(255, 255, 255));
        jTableHotels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone Number", "Description", "Stars", "address", "Country", "Type Accommodation", "Size Hotel", "Check in Time", "Check out Time", "Requirements check in", "Year Built"
            }
        ));
        jScrollPane1.setViewportView(jTableHotels);

        BtnBack.setText("Back");
        BtnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButtonNewHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButtonDeleteHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361)
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewHotel)
                    .addComponent(jButtonDeleteHotel)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jTabbedPane1.addTab("Hotel options", jPanel1);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jTableRoomTypes.setBackground(new java.awt.Color(51, 51, 51));
        jTableRoomTypes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableRoomTypes.setForeground(new java.awt.Color(255, 255, 255));
        jTableRoomTypes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Type", "Description", "#Persons", "Bedding", "Price", "all-inclusive", "Living", "Terrace", "Seaview", "Smoke"
            }
        ));
        jScrollPane2.setViewportView(jTableRoomTypes);

        jButtonNewType.setText("Add New Type");
        jButtonNewType.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNewType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewTypeActionPerformed(evt);
            }
        });

        jButtonDeleteType.setText("Delete a Type");
        jButtonDeleteType.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDeleteType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteTypeActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonNewType)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonDeleteType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBack)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                        .addGap(48, 48, 48))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(jButtonNewType)
                    .addComponent(jButtonDeleteType))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Types Rooms", jPanel3);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jTableSeasons.setBackground(new java.awt.Color(51, 51, 51));
        jTableSeasons.setForeground(new java.awt.Color(255, 255, 255));
        jTableSeasons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Season Name", "StartDate", "EndDate"
            }
        ));
        jScrollPane3.setViewportView(jTableSeasons);

        jButtonPriceRoom.setText("Add price to a Specific Type Room");
        jButtonPriceRoom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonSeePriceRooms.setText("See the Current Price of the diferents Type rooms");
        jButtonSeePriceRooms.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonAddSeason.setText("Add Season");
        jButtonAddSeason.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAddSeason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddSeasonActionPerformed(evt);
            }
        });

        jButtonDeleteSEason.setText("Delete Season");
        jButtonDeleteSEason.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDeleteSEason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteSEasonActionPerformed(evt);
            }
        });

        jButtonBack1.setText("Back");
        jButtonBack1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonSeePriceRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jButtonPriceRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonAddSeason, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButtonDeleteSEason)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                        .addComponent(jButtonBack1)
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAddSeason)
                            .addComponent(jButtonDeleteSEason))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSeePriceRooms)
                            .addComponent(jButtonPriceRoom))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonBack1)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Seasons", jPanel2);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jTableServices.setBackground(new java.awt.Color(51, 51, 51));
        jTableServices.setForeground(new java.awt.Color(255, 255, 255));
        jTableServices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Service Name"
            }
        ));
        jScrollPane4.setViewportView(jTableServices);

        jButtonback2.setText("Back");
        jButtonback2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Service");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Service Name");

        jButtonAddService.setText("Add");
        jButtonAddService.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddServiceActionPerformed(evt);
            }
        });

        jButtonDeleteService.setText("Delete Service");
        jButtonDeleteService.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDeleteService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonDeleteService)
                        .addGap(0, 379, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAddService, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(27, 27, 27)
                                    .addComponent(jTextFieldServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonback2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
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
                .addComponent(jButtonAddService, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonback2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Services", jPanel4);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jTableAttractions.setBackground(new java.awt.Color(51, 51, 51));
        jTableAttractions.setForeground(new java.awt.Color(255, 255, 255));
        jTableAttractions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Attraction Name"
            }
        ));
        jScrollPane5.setViewportView(jTableAttractions);

        jButtonDeleteAttraction.setText("Delete Attraction");
        jButtonDeleteAttraction.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDeleteAttraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteAttractionActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add new Attraction");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Attraction Name");

        jButtonAddAttraction.setText("Add");
        jButtonAddAttraction.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAddAttraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAttractionActionPerformed(evt);
            }
        });

        jButtonback3.setText("Back");
        jButtonback3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonDeleteAttraction))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAddAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(44, 44, 44)
                                .addComponent(jTextFieldAttractionName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(256, 256, 256)
                        .addComponent(jButtonback3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(291, Short.MAX_VALUE))
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
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButtonback3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addComponent(jButtonAddAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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
       if(newGlobals.getRoomTypesList().isEmpty()){
            JOptionPane.showMessageDialog(this,"You need add a RoomType");
            return;
            
        }
        
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
       
    }//GEN-LAST:event_jButtonDeleteServiceActionPerformed

    private void jButtonback3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonback3ActionPerformed
        this.dispose();
        InterfaceAdmin newI = new InterfaceAdmin();
        newI.setVisible(true);
    }//GEN-LAST:event_jButtonback3ActionPerformed

    private void jButtonNewTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewTypeActionPerformed
        NewRoomType newRoomTypeWindows = new NewRoomType();
        this.dispose();
        newRoomTypeWindows.setVisible(true);
    }//GEN-LAST:event_jButtonNewTypeActionPerformed

    private void jButtonDeleteHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteHotelActionPerformed
        mdHotels = (DefaultTableModel)jTableHotels.getModel();
        if(jTableHotels.getSelectedRowCount()== 0){
            JOptionPane.showMessageDialog(this,"please select the Hotel to delete");
            return;
        }
        
        
        String HotelName;
        int TempSelectRow = jTableHotels.getSelectedRow();
        HotelName = mdHotels.getValueAt(TempSelectRow, 0).toString();
        deleteHotel(HotelName);
        mdHotels.removeRow(jTableHotels.getSelectedRow());
       
    }//GEN-LAST:event_jButtonDeleteHotelActionPerformed

    private void jButtonDeleteTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteTypeActionPerformed
        mdRoomTypes = (DefaultTableModel)jTableRoomTypes.getModel();
        if(jTableRoomTypes.getSelectedRowCount()== 0){
            JOptionPane.showMessageDialog(this,"please select the Room Type to delete");
            return;
        }
        
        
        String RoomtypeName;
        int TempSelectRow = jTableRoomTypes.getSelectedRow();
        RoomtypeName = mdRoomTypes.getValueAt(TempSelectRow, 0).toString();
        deleteRoomType(RoomtypeName);
        mdRoomTypes.removeRow(jTableRoomTypes.getSelectedRow());
    }//GEN-LAST:event_jButtonDeleteTypeActionPerformed

    private void jButtonAddSeasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddSeasonActionPerformed
          NewSeason newSeason = new NewSeason();
          this.dispose();
          newSeason.setVisible(true);
    }//GEN-LAST:event_jButtonAddSeasonActionPerformed

    private void jButtonDeleteSEasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteSEasonActionPerformed
        mdSeasons = (DefaultTableModel)jTableSeasons.getModel();
        if(jTableSeasons.getSelectedRowCount()== 0){
            JOptionPane.showMessageDialog(this,"please select the Season to delete");
            return;
        }
        
        
        String SeasonName;
        int TempSelectRow = jTableSeasons.getSelectedRow();
        SeasonName = mdSeasons.getValueAt(TempSelectRow, 0).toString();
        deleteSeason(SeasonName);
        mdSeasons.removeRow(jTableSeasons.getSelectedRow());
    }//GEN-LAST:event_jButtonDeleteSEasonActionPerformed

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
    private javax.swing.JButton jButtonAddAttraction;
    private javax.swing.JButton jButtonAddSeason;
    private javax.swing.JButton jButtonAddService;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonBack1;
    private javax.swing.JButton jButtonDeleteAttraction;
    private javax.swing.JButton jButtonDeleteHotel;
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
