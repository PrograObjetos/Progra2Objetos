package progra2objetos;

import globals.Globals;
import Interface.Login;

public class Progra2Objetos {

    
    public static void main(String[] args) {
        
        Admin nA = new Admin("admin@gmail.com","21232f297a57a5a743894a0e4a801fc3","21232f297a57a5a743894a0e4a801fc3","admin");
       
                
        
        Client nc1 = new Client("Cristian","Miguel","Male","c","b08c8c585b6d67164c163767076445d6", "b08c8c585b6d67164c163767076445d6",1,20,"Costa Rica",85794421,"colones");
        Client nc2 = new Client("Kevin","Andres","Male","kevinandres.126@gmail.com","9d5e3ecdeb4cdb7acfd63075ae046672", "9d5e3ecdeb4cdb7acfd63075ae046672",2,20,"Mexico",87892400,"dollars");
        
        Globals.getInstance().setUserList(nc1);
        Globals.getInstance().setUserList(nc2);
        
        Globals.getInstance().setAdminList(nA);

        Login nl = new Login();
        nl.setVisible(true);
        
        
    }
    
}
