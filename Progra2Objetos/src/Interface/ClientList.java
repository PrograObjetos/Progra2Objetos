
package Interface;

import progra2objetos.Client;
import java.util.ArrayList;

public class ClientList {
     public static ClientList instanceList;
     public ArrayList<Client> clientList;
     
    public ClientList() {
        clientList = new ArrayList();
    }
    
    public static ClientList getInstanceList(){
        
        if(instanceList == null){
            instanceList = new ClientList();
        }
        return instanceList;
    }

    public ArrayList<Client> getUserList() {
        return clientList;
    }

    public void setUserList(Client user) {
        this.clientList.add(user);
    }
    
     
}
