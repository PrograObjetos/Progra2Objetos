package progra2objetos;


public class RoomType {
    private String bedding;
    private int maximumPersons;
    private String roomType;
    private String description;
    private boolean living;
    private boolean terrace;
    private boolean seaview;
    private boolean allInclusive;
    private boolean smoke;
    private int roomSize;

    public RoomType(String bedding, int maximumPersons, String roomType, String description, boolean living, boolean terrace, boolean seaview, boolean allInclusive, boolean smoke, int roomSize) {
        this.bedding = bedding;
        this.maximumPersons = maximumPersons;
        this.roomType = roomType;
        this.description = description;
        this.living = living;
        this.terrace = terrace;
        this.seaview = seaview;
        this.allInclusive = allInclusive;
        this.smoke = smoke;
        this.roomSize = roomSize;
    }

    public String getBedding() {
        return bedding;
    }

    public void setBedding(String bedding) {
        this.bedding = bedding;
    }

    public int getMaximumPersons() {
        return maximumPersons;
    }

    public void setMaximumPersons(int maximumPersons) {
        this.maximumPersons = maximumPersons;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isLiving() {
        return living;
    }

    public void setLiving(boolean living) {
        this.living = living;
    }

    public boolean isTerrace() {
        return terrace;
    }

    public void setTerrace(boolean terrace) {
        this.terrace = terrace;
    }

    public boolean isSeaview() {
        return seaview;
    }

    public void setSeaview(boolean seaview) {
        this.seaview = seaview;
    }

    public boolean isAllInclusive() {
        return allInclusive;
    }

    public void setAllInclusive(boolean allInclusive) {
        this.allInclusive = allInclusive;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }

    
   
    
}
