package progra2objetos;

import globals.Globals;
import Interface.Login;

public class Progra2Objetos {

    
    public static void main(String[] args) {
        
        Admin nA = new Admin("admin","21232f297a57a5a743894a0e4a801fc3","21232f297a57a5a743894a0e4a801fc3","admin");
       
                
        
        Client nc1 = new Client("Cristian","Miguel","Male","c","b08c8c585b6d67164c163767076445d6", "cristian",1,20,"Costa Rica",85794421,"colones");
        Client nc2 = new Client("Kevin","Andres","Male","k","9d5e3ecdeb4cdb7acfd63075ae046672", "kevin",2,20,"Mexico",87892400,"dollars");
        
        Card ncard1 = new Card("Cristian", "Miguel", "visa", 25414, 4521, null);
        Card ncard2 = new Card("Kevin", "Andres", "Master Card", 51248, 4521, null);
        Card ncard3 = new Card("Gabriel", "Perez", "Discover", 65742, 4521, null);
        Card ncard4 = new Card("Juan", "Carlos", "AmericanExpress", 14872, 4521, null);
        
        
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
