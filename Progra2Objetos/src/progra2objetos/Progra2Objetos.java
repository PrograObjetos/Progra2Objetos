package progra2objetos;

import globals.Globals;
import Interface.Login;
import java.util.GregorianCalendar;

public class Progra2Objetos {

    
    public static void main(String[] args) {
        
        Admin nA = new Admin("admin","21232f297a57a5a743894a0e4a801fc3","21232f297a57a5a743894a0e4a801fc3","admin");
       
                
        
        Client nc1 = new Client("Cristian","Miguel","Male","c","b08c8c585b6d67164c163767076445d6", "cristian",1,20,"Costa Rica",85794421,"colones");
        Client nc2 = new Client("Kevin","Andres","Male","k","9d5e3ecdeb4cdb7acfd63075ae046672", "kevin",2,20,"Mexico",87892400,"dollars");
        
        GregorianCalendar date = new GregorianCalendar();
        date.set(2015, 11, 31);
        
        GregorianCalendar date2 = new GregorianCalendar();
        date2.set(2021, 5, 9);
        
        GregorianCalendar date3 = new GregorianCalendar();
        date3.set(2045, 7, 4);
        
        GregorianCalendar date4 = new GregorianCalendar();
        date4.set(2034, 3, 25);
        
        
        Card ncard1 = new Card("Cristian", "Miguel", "visa", 25414, 4521, date.getTime());
        Card ncard2 = new Card("Cristian", "Miguel", "Master Card", 51248, 4521, date2.getTime());
        Card ncard3 = new Card("Cristian", "Miguel", "Discover", 65742, 4521, date3.getTime());
        Card ncard4 = new Card("Cristian", "Miguel", "AmericanExpress", 14872, 4521,date4.getTime());
        
        Card ncard5 = new Card("Kevin", "Andres", "visa", 25744, 4391, date.getTime());
        Card ncard6 = new Card("Kevin", "Andres", "Master Card", 74513, 7319, date2.getTime());
        Card ncard7 = new Card("Kevin", "Andres", "Discover", 65412, 5246, date3.getTime());
        Card ncard8 = new Card("Kevin", "Andres", "AmericanExpress", 97412, 1432,date4.getTime());
        
        
        Hotel nHotel = new Hotel("Tambor", "Muy Lindo", "Cerca de la Playa", "Costa Rica", 24587612, 5, "Cabaña", "Grande", "9:00am", "9:00pm", "Cedula", "1995");
        Hotel nHote12 = new Hotel("Tamarindo", "Muy Feo", "Cerca de la Playa", "Brasil", 214578355, 2, "Hostels", "Pequeño", "10:00am", "10:00pm", "Cedula", "1800");       
        
        Attraction nAttraction = new Attraction(1, "Playas");
        Attraction nAttraction2 = new Attraction(2, "Volcanes");
        Attraction nAttraction3 = new Attraction(3, "Zona Verde");
        
        Service nService = new Service(1, "Wifi");
        Service nService2 = new Service(2, "Cable");
        Service nService3 = new Service(3, "Comida Gratis");
        
        RoomType nRoomType = new RoomType("Lana", 6, "Suit", "Linda", true, true, true, true, false, 50, 5000);
        RoomType nRoomType2 = new RoomType("Seda", 2, "Doble", "Regular", true, true, true, true, false, 25, 2500);
        
        
        Room nRoom = new Room(1, "Mosaico", "Pedro", "Antonio", 5, 3, nRoomType);
        Room nRoom2 = new Room(2, "Ceramica", "Carlos", "Miguel",2 , 1, nRoomType2);
        
        Globals.getInstance().setActualClient(nc1);
        
        
        Globals.getInstance().getActualClient().setNewCard(ncard1);
        Globals.getInstance().getActualClient().setNewCard(ncard2);
        Globals.getInstance().getActualClient().setNewCard(ncard3);
        Globals.getInstance().getActualClient().setNewCard(ncard4);
        
        
        
        Globals.getInstance().setActualClient(nc2);
        
        Globals.getInstance().getActualClient().setNewCard(ncard5);
        Globals.getInstance().getActualClient().setNewCard(ncard6);
        Globals.getInstance().getActualClient().setNewCard(ncard7);
        Globals.getInstance().getActualClient().setNewCard(ncard8);
        
        Globals.getInstance().setUserList(nc1);
        Globals.getInstance().setUserList(nc2);
        Globals.getInstance().setAdminList(nA);
        
        Globals.getInstance().setNewHotel(nHotel);
        Globals.getInstance().setNewHotel(nHote12);
        
        Globals.getInstance().setNewAttraction(nAttraction);
        Globals.getInstance().setNewAttraction(nAttraction2);
        Globals.getInstance().setNewAttraction(nAttraction3);
        Globals.getInstance().setNewService(nService);
        Globals.getInstance().setNewService(nService2);
        Globals.getInstance().setNewService(nService3);
        

        
        Globals.getInstance().setActualHotel(nHotel);
        Globals.getInstance().getActualHotel().setNewAttraction(nAttraction);
        Globals.getInstance().getActualHotel().setNewAttraction(nAttraction2);
        Globals.getInstance().getActualHotel().setNewAttraction(nAttraction3);
        Globals.getInstance().getActualHotel().setNewService(nService);
        Globals.getInstance().getActualHotel().setNewService(nService2);
        Globals.getInstance().getActualHotel().setNewService(nService3);
        Globals.getInstance().getActualHotel().setNewRoom(nRoom);
        Globals.getInstance().getActualHotel().setNewRoom(nRoom2);
        
        Globals.getInstance().setActualHotel(nHote12);
        Globals.getInstance().getActualHotel().setNewAttraction(nAttraction);
        Globals.getInstance().getActualHotel().setNewAttraction(nAttraction2);
        Globals.getInstance().getActualHotel().setNewService(nService);
        Globals.getInstance().getActualHotel().setNewService(nService2);
        Globals.getInstance().getActualHotel().setNewRoom(nRoom);
        Globals.getInstance().getActualHotel().setNewRoom(nRoom2);    
       
        
        
        

        Login nl = new Login();
        nl.setVisible(true);
        
        
    }
    
}
