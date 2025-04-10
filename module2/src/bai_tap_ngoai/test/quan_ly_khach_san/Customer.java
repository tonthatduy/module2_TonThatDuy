package bai_tap_ngoai.test.quan_ly_khach_san;

public class Customer {
    private int id;
    private String name;
    private String phoneNumber;
    private Room room;

    public Customer(int id, String name, String phoneNumber, Room room) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.room = room;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public Room getRoom() { return room; }

    public void setName(String name) { this.name = name; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setRoom(Room room) { this.room = room; }

    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + name + ", Phone: " + phoneNumber +
                ", Room: " + (room != null ? room.getRoomNumber() : "None");
    }
}
