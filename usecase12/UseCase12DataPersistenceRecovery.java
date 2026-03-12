package usecase12;

import java.util.Map;

public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("System Recovery");

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        String filePath = "inventory_data.txt";

        persistenceService.loadInventory(inventory, filePath);

        System.out.println();
        System.out.println("Current Inventory:");

        for (Map.Entry<String, Integer> entry : inventory.getRoomAvailability().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        persistenceService.saveInventory(inventory, filePath);
        System.out.println("Inventory saved successfully.");
    }
}