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
        Card ncard2 = new Card("Kevin", "Andres", "Master Card", 51248, 4521, date2.getTime());
        Card ncard3 = new Card("Gabriel", "Perez", "Discover", 65742, 4521, date3.getTime());
        Card ncard4 = new Card("Juan", "Carlos", "AmericanExpress", 14872, 4521,date4.getTime());
        
        
        Globals.getInstance().setActualClient(nc1);
        
        Globals.getInstance().getActualClient().setNewCard(ncard1);
        Globals.getInstance().getActualClient().setNewCard(ncard2);
        Globals.getInstance().getActualClient().setNewCard(ncard3);
        Globals.getInstance().getActualClient().setNewCard(ncard4);
        
        
  
        Globals.getInstance().setUserList(nc1);
        Globals.getInstance().setUserList(nc2);
        
        Globals.getInstance().setAdminList(nA);

        Login nl = new Login();
        nl.setVisible(true);
        
        
    }
    
}
