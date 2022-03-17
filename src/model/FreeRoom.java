package model;

public class FreeRoom extends Room {

    public FreeRoom(String roomNumber, RoomType enumeration) {
        super(roomNumber, 0.0, enumeration);
    }

    public String toString(){
        return ("This room " + this.roomNumber + " " + this.enumeration + " bed room price $");
    }

}
