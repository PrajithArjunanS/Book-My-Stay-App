package usecase8;

import java.util.*;

public class BookingReportService {

    public void generateReport(BookingHistory history) {

        List<Reservation> reservations = history.getConfirmedReservations();

        System.out.println("Booking History Report");

        for (Reservation r : reservations) {
            System.out.println("Guest: " + r.getGuestName() + ", Room Type: " + r.getRoomType());
        }
    }
}