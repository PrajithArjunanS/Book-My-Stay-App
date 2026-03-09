package usecase6;

public class UseCase6RoomAllocation {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        BookingRequestQueue queue = new BookingRequestQueue();
        RoomInventory inventory = new RoomInventory();
        RoomAllocationService allocator = new RoomAllocationService();

        Reservation r1 = new Reservation("Abhi","Single");
        Reservation r2 = new Reservation("Subha","Single");
        Reservation r3 = new Reservation("Vannathi","Suite");

        queue.addRequest(r1);
        queue.addRequest(r2);
        queue.addRequest(r3);

        while(queue.hasPendingRequests()){
            Reservation current = queue.getNextRequest();
            allocator.allocateRoom(current,inventory);
        }
    }
}