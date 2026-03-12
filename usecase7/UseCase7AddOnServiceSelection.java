package usecase7;

public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        AddOnService breakfast = new AddOnService("Breakfast", 500);
        AddOnService spa = new AddOnService("Spa", 1200);
        AddOnService airportPickup = new AddOnService("Airport Pickup", 800);

        AddOnServiceManager manager = new AddOnServiceManager();

        String reservationId = "R-101";

        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);
        manager.addService(reservationId, airportPickup);

        double total = manager.calculateTotalServiceCost(reservationId);

        System.out.println("Add-On Service Cost for Reservation " + reservationId + ": " + total);
    }
}