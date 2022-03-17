package model;

public class Room implements IRoom {

    protected String roomNumber;
    protected Double roomPrice;
    protected RoomType enumeration;

    public Room(String roomNumber, Double roomPrice, RoomType enumeration) {
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.enumeration = enumeration;
    }



    public String getRoomNumber() {

        return this.roomNumber;
    }

    public Double getRoomPrice() {

        return this.roomPrice;
    }

    public RoomType getRoomType() {

        return this.enumeration;
    }

    public boolean isFree() {

        return false;
    }



    public String toString() {
        return ("Room number: " + roomNumber + " " + enumeration + " rooms available for this price $ " + roomPrice);
    }
}
