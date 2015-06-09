
package globals;

import progra2objetos.Client;
import java.util.ArrayList;
import progra2objetos.Admin;
import progra2objetos.Attraction;
import progra2objetos.Service;

public class Globals {
     public static Globals instance;
     public ArrayList<Client> clientList =  new ArrayList<>();
     public ArrayList<Admin> adminList = new ArrayList<>();
     public ArrayList<Service> servicesList = new ArrayList<>();
     public ArrayList<Attraction> attractionsList = new ArrayList<>();
     
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
    public ArrayList<Admin> getAdminList(){
         return instance.adminList;
    }
    
    public void setAdminList(Admin admin){
        instance.adminList.add(admin);
    }
             
    
     
}
