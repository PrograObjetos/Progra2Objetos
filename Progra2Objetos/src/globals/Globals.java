
package globals;

import progra2objetos.Client;
import java.util.ArrayList;

public class Globals {
     public static Globals instance;
     public ArrayList<Client> clientList = clientList = new ArrayList<>();;
     
    Globals() {
    
    }
    
    public static Globals getInstance(){
        
        if(instance == null){
            instance = new Globals();
        }
        return instance;
    }

    public ArrayList<Client> getUserList() {
        return instance.clientList;
    }

    public void setUserList(Client user) {
        instance.clientList.add(user);
    }
    
     
}
