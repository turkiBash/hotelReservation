package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import model.RoomType;
import service.CustomerService;
import service.ReservationService;

import java.util.Collection;

public class AdminResource {
    public static final CustomerService customerService = new CustomerService();
    public static final ReservationService reservationService = ReservationService.getInstance();

    public Customer getCustomer(String email) {
        return customerService.getCustomer(email);
    }

    public static void createRooms(String roomNumber, Double price, RoomType roomType) {
        reservationService.addRoom(roomNumber, price, roomType);
        System.out.println("room has been created");
    }

    public static Collection<IRoom> getAllRooms() {
        return reservationService.allRooms();
    }

    public static Collection<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public static Collection<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }
}
