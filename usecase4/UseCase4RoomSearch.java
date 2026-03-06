package usecase4;
public class UseCase4RoomSearch {

    public static void main(String[] args) {

        Room singleRoom = new Room("Single",1,250,1500.0);
        Room doubleRoom = new Room("Double",2,400,2500.0);
        Room suiteRoom = new Room("Suite",3,750,5000.0);

        RoomInventory inventory = new RoomInventory();

        inventory.updateAvailability("Single Room",5);
        inventory.updateAvailability("Double Room",3);
        inventory.updateAvailability("Suite Room",2);

        System.out.println("Room Search");
        System.out.println();

        RoomSearchService service = new RoomSearchService();
        service.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}