package progra2objetos;

import java.util.ArrayList;

public class Room {
    private int roomnumber; 
    private String flat;
    private String costumername;
    private String costumerLastname;
    private int adultsQuantity;
    private int childrenQuantity;
    private RoomType roomType;
    private ArrayList<TimeTable> historyReservation;
    private TimeTable currentReservation;

    public Room(int roomnumber, String flat, String costumername, String costumerLastname, int adultsQuantity, int childrenQuantity, RoomType roomType) {
        this.roomnumber = roomnumber;
        this.flat = flat;
        this.costumername = costumername;
        this.costumerLastname = costumerLastname;
        this.adultsQuantity = adultsQuantity;
        this.childrenQuantity = childrenQuantity;
        this.roomType = roomType;
        this.historyReservation = new ArrayList();
        this.currentReservation = new TimeTable();
    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getCostumername() {
        return costumername;
    }

    public void setCostumername(String costumername) {
        this.costumername = costumername;
    }

    public String getCostumerLastname() {
        return costumerLastname;
    }

    public void setCostumerLastname(String costumerLastname) {
        this.costumerLastname = costumerLastname;
    }

    public int getAdultsQuantity() {
        return adultsQuantity;
    }

    public void setAdultsQuantity(int adultsQuantity) {
        this.adultsQuantity = adultsQuantity;
    }

    public int getChildrenQuantity() {
        return childrenQuantity;
    }

    public void setChildrenQuantity(int childrenQuantity) {
        this.childrenQuantity = childrenQuantity;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public ArrayList<TimeTable> getHistoryReservation() {
        return historyReservation;
    }

    public void setHistoryReservation(ArrayList<TimeTable> historyReservation) {
        this.historyReservation = historyReservation;
    }

    public TimeTable getCurrentReservation() {
        return currentReservation;
    }

    public void setCurrentReservation(TimeTable currentReservation) {
        this.currentReservation = currentReservation;
    }
    
    
}
