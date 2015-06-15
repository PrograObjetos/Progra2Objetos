
package globals;

import progra2objetos.Client;
import java.util.ArrayList;
import progra2objetos.Admin;
import progra2objetos.Attraction;
import progra2objetos.Hotel;
import progra2objetos.RoomType;
import progra2objetos.Service;

public class Globals {
     private static Globals instance;
     private ArrayList<Client> clientList =  new ArrayList<>();
     private ArrayList<Admin> adminList = new ArrayList<>();
     private ArrayList<Hotel> hotelsList = new ArrayList<>();
     private ArrayList<Service> servicesList = new ArrayList<>();
     private ArrayList<Attraction> attractionsList = new ArrayList<>();
     private ArrayList<RoomType> RoomTypesList = new ArrayList<>();
     private Hotel actualHotel;
     private Client actualClient;


     
    Globals() {
    
    }
    public static Globals getInstance(){
        
        if(instance == null){
            instance = new Globals();
        }
        return instance;
    }

    public  ArrayList<Client> getUserList() {
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

    public ArrayList<Service> getServicesList() {
        return instance.servicesList;
    }

    public void setNewService(Service newService) {
        instance.servicesList.add(newService);
    }

    public ArrayList<Attraction> getAttractionsList() {
        return instance.attractionsList;
    }

    public void setNewAttraction(Attraction newAttraction) {
        instance.attractionsList.add(newAttraction);
    }
    
    public Client getActualClient() {
        return instance.actualClient;
    }

    public void setActualClient(Client actualClient) {
        instance.actualClient = actualClient;
    }

    public Hotel getActualHotel() {
        return instance.actualHotel;
    }

    public void setActualHotel(Hotel actualHotel) {
        instance.actualHotel = actualHotel;
    }

    public ArrayList<Hotel> getHotelsList() {
        return instance.hotelsList;
    }
    public void setActualHotelNull(){
        instance.actualHotel = null;
    }
    
    
    public void addHotel(){
        instance.hotelsList.add(actualHotel);
    }

    public ArrayList<RoomType> getRoomTypesList() {
        return instance.RoomTypesList;
    }

    public void setNewRoomType(RoomType newRoomType) {
        instance.RoomTypesList.add(newRoomType);
    }
    
    
    
}
