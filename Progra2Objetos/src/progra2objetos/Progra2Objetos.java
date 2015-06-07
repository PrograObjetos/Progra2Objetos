package progra2objetos;

import globals.Globals;
import Interface.Login;

public class Progra2Objetos {

    
    public static void main(String[] args) {
        Client nc1 = new Client("Cristian","Miguel","Male","cristianmag.27@gmail.com","b08c8c585b6d67164c163767076445d6", "b08c8c585b6d67164c163767076445d6",20);
        Client nc2 = new Client("Kevin","Andres","Male","kevinandres.126@gmail.com","9d5e3ecdeb4cdb7acfd63075ae046672", "9d5e3ecdeb4cdb7acfd63075ae046672",20);
        
        Globals.getInstance().setUserList(nc1);
        Globals.getInstance().setUserList(nc2);
        
        Login nl = new Login();
        nl.setVisible(true);
        
        
    }
    
}
