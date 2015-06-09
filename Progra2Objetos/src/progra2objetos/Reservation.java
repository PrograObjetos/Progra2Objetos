/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2objetos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kevin
 */
public class Reservation {
    private ArrayList<Room> roomsList;
    private Date entryDate;
    private Date departureDate;
    private int numnights;
    private String roomType;
    private int roomsnum;

    public Reservation(ArrayList<Room> roomsList, Date entryDate, Date departureDate, int numnights, String roomType, int roomsnum) {
        this.roomsList = roomsList;
        this.entryDate = entryDate;
        this.departureDate = departureDate;
        this.numnights = numnights;
        this.roomType = roomType;
        this.roomsnum = roomsnum;
    }

    public ArrayList<Room> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(ArrayList<Room> roomsList) {
        this.roomsList = roomsList;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getNumnights() {
        return numnights;
    }

    public void setNumnights(int numnights) {
        this.numnights = numnights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomsnum() {
        return roomsnum;
    }

    public void setRoomsnum(int roomsnum) {
        this.roomsnum = roomsnum;
    }
    
    
    
}
