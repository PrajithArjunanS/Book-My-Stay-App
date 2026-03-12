package usecase10;

public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        CancellationService service = new CancellationService();

        service.registerBooking("Single-1","Single");

        service.cancelBooking("Single-1", inventory);

        service.showRollbackHistory();

        System.out.println();
        System.out.println("Updated Single Room Availability: " + inventory.getRoomAvailability().get("Single"));
    }
}