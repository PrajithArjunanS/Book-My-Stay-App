package usecase8;

public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        BookingHistory history = new BookingHistory();

        Reservation r1 = new Reservation("Abhi","Single");
        Reservation r2 = new Reservation("Subha","Double");
        Reservation r3 = new Reservation("Vannathi","Suite");

        history.addReservation(r1);
        history.addReservation(r2);
        history.addReservation(r3);

        BookingReportService reportService = new BookingReportService();

        System.out.println("Booking History and Reporting");
        System.out.println();

        reportService.generateReport(history);
    }
}