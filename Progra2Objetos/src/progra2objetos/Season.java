package progra2objetos;

import java.util.ArrayList;
import java.util.Date;


public abstract class Season {
    private String name;
    private int code;
    private Date startDate;
    private Date endDate;
    private ArrayList<RoomType> roomTypes;
    

    public Season(String name, int code, Date startDate, Date endDate) {
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomTypes = new ArrayList<>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

   
    
}
