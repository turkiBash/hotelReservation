package model;

import java.util.Date;
import java.util.Objects;

public class Reservation {
    private String customer;
    private IRoom room;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(String customer, IRoom room, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;

    }

    public Date getCheckInDate(){
        return checkInDate;
    }

    public Date getCheckOutDate(){

        return checkOutDate;
    }

    public IRoom getRoom(){

        return room;
    }

    public String getCustomer(){

        return customer;
    }

    public boolean isRoomFree(Date checkInDate, Date checkOutDate) {
        if (checkInDate.before(this.checkOutDate) && checkOutDate.after(this.checkInDate)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(customer, that.customer) && Objects.equals(room, that.room) && Objects.equals(checkInDate, that.checkInDate) && Objects.equals(checkOutDate, that.checkOutDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, room, checkInDate, checkOutDate);
    }


    public String toString() {
        return "Reservation for customer " + this.customer + ", " + room + ", Checked-In on: " + this.checkInDate +
                ", Check-Out on: " + this.checkOutDate;
    }
}
