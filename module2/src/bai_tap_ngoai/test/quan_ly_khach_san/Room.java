package bai_tap_ngoai.test.quan_ly_khach_san;

public class Room {
    private String roomNumber;
    private String type;
    private boolean isOccupied;

    public Room(String roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isOccupied = false;
    }

    public String getRoomNumber() { return roomNumber; }
    public String getType() { return type; }
    public boolean isOccupied() { return isOccupied; }

    public void setOccupied(boolean occupied) { isOccupied = occupied; }

    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + type + ") - " + (isOccupied ? "Occupied" : "Available");
    }
}
