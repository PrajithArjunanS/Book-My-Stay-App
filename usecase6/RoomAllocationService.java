package usecase6;

import java.util.*;

public class RoomAllocationService {

    private Set<String> allocatedRoomIds;
    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService() {
        allocatedRoomIds = new HashSet<>();
        assignedRoomsByType = new HashMap<>();
    }

    public void allocateRoom(Reservation reservation, RoomInventory inventory) {

        String roomType = reservation.getRoomType();
        Map<String,Integer> availability = inventory.getRoomAvailability();

        if(availability.get(roomType) <= 0){
            System.out.println("No rooms available for " + roomType);
            return;
        }

        String roomId = generateRoomId(roomType);

        allocatedRoomIds.add(roomId);

        assignedRoomsByType
                .computeIfAbsent(roomType,k->new HashSet<>())
                .add(roomId);

        inventory.updateAvailability(roomType,availability.get(roomType)-1);

        System.out.println("Booking confirmed for Guest: "
                + reservation.getGuestName()
                + ", Room ID: "
                + roomId);
    }

    private String generateRoomId(String roomType){

        int nextId =
                assignedRoomsByType
                .getOrDefault(roomType,new HashSet<>())
                .size()+1;

        return roomType + "-" + nextId;
    }
}