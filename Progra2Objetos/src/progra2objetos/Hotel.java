package progra2objetos;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Hotel {
    private String name;
    private String address;
    private String country;
    private String Description;
    private int phoneNumber;
    private int stars;
    private String typeAccommodation;
    private String sizeHotel;
    private String timeCheckIn;
    private String timeCheckOut;
    private String requirementsCheckIn;
    private String yearBuilt;
    
    private ArrayList<Room> roomsList;
    private ArrayList<Service> servicesList;
    private ArrayList<Attraction> AttractionList;
    
    

    public Hotel(String name,String Description, String address, String country, int phoneNumber, int stars, String typeAccommodation, String sizeHotel, String timeCheckIn, String timeCheckOu, String requirementsCheckIn, String yearBuilt) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.stars = stars;
        this.typeAccommodation = typeAccommodation;
        this.sizeHotel = sizeHotel;
        this.timeCheckIn = timeCheckIn;
        this.timeCheckOut = timeCheckOu;
        this.requirementsCheckIn = requirementsCheckIn;
        this.yearBuilt = yearBuilt;
        this.Description = Description;
        this.roomsList = new ArrayList<>();
        this.servicesList = new ArrayList<>();
        this.AttractionList = new ArrayList<>();
    }

    public ArrayList<Room> getRoomsList() {
        return roomsList;
    }

    public void setNewRoom(Room newroom) {
        this.roomsList.add(newroom);
    }

    public ArrayList<Service> getServicesList() {
        return servicesList;
    }

    public void setNewService(Service newservice) {
        this.servicesList.add(newservice);
    }

    public ArrayList<Attraction> getAttractionList() {
        return AttractionList;
    }

    public void setNewAttraction(Attraction newAttraction) {
        this.AttractionList.add(newAttraction);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getTypeAccommodation() {
        return typeAccommodation;
    }

    public void setTypeAccommodation(String typeAccommodation) {
        this.typeAccommodation = typeAccommodation;
    }

    public String getSizeHotel() {
        return sizeHotel;
    }

    public void setSizeHotel(String sizeHotel) {
        this.sizeHotel = sizeHotel;
    }

    public String getTimeCheckIn() {
        return timeCheckIn;
    }

    public void setTimeCheckIn(String timeCheckIn) {
        this.timeCheckIn = timeCheckIn;
    }

    public String getTimeCheckOut() {
        return timeCheckOut;
    }

    public void setTimeCheckOut(String timeCheckOut) {
        this.timeCheckOut = timeCheckOut;
    }
  
    public String getRequirementsCheckIn() {
        return requirementsCheckIn;
    }

    public void setRequirementsCheckIn(String requirementsCheckIn) {
        this.requirementsCheckIn = requirementsCheckIn;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    

    
}

