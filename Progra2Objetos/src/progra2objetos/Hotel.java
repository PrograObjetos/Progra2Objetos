package progra2objetos;
import java.util.ArrayList;
import java.util.Date;

public class Hotel {
    private String name;
    private String address;
    private String country;
    private int phoneNumber;
    private int stars;
    private String typeAccommodation;
    private String sizeHotel;
    private ArrayList<Room> roomsList;
    private ArrayList<Service> servicesList;
    private ArrayList<Attraction> AttractionList;
    
    private Date timeCheckIn;
    private Date timeCheckOut;
    private String requirementsCheckIn;
    private String services;
    private Date yearBuilt;

    public Hotel(String name, String address, String country, int phoneNumber, int stars, String typeAccommodation, String sizeHotel, Date timeCheckIn, Date timeCheckOu, String requirementsCheckIn, String services, Date yearBuilt) {
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
        this.services = services;
        this.yearBuilt = yearBuilt;
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

    public void setNewServices(Service newservice) {
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

    public Date getTimeCheckIn() {
        return timeCheckIn;
    }

    public void setTimeCheckIn(Date timeCheckIn) {
        this.timeCheckIn = timeCheckIn;
    }

    public Date getTimeCheckOut() {
        return timeCheckOut;
    }

    public void setTimeCheckOut(Date timeCheckOut) {
        this.timeCheckOut = timeCheckOut;
    }

    public String getRequirementsCheckIn() {
        return requirementsCheckIn;
    }

    public void setRequirementsCheckIn(String requirementsCheckIn) {
        this.requirementsCheckIn = requirementsCheckIn;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public Date getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(Date yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    
}

