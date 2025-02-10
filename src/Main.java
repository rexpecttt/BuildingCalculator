/*
    Author: Mark Kovacs
    Date: 28.11.24
 */

public class Main {
    public static void main(String[] args) {
        Building building = new Building();

        //Erstes Stockwerk bekommt 5 Zimmer
        Floor floor1 = new Floor();
        floor1.addRoom(new Room("Wohnen/Essen", 34.32));
        floor1.addRoom(new Room("Küche", 8.78));
        floor1.addRoom(new Room("WC", 3.22));
        floor1.addRoom(new Room("Diele", 14.5));
        floor1.addRoom(new Room("Technikraum", 10.97));

        //Zweites Stockwerk, 1 Zimmer
        Floor floor2 = new Floor();
        floor2.addRoom(new Room("Kinderzimmer 1", 12.12));
        floor2.addRoom(new Room("Kinderzimmer 2", 12.12));
        floor2.addRoom(new Room("Bodezimmer", 9.28));
        floor2.addRoom(new Room("Elternschlafzimmer", 15.94));
        floor2.addRoom(new Room("Flur", 8.36));

        //Beide Stockwerke werden dem Gebäude hinzugefügt
        building.addFloor(floor1);
        building.addFloor(floor2);


        System.out.printf("Gesamte Wohnfläche: %.2fm^2\n", building.getLivingSpace());
        System.out.printf("Gesamte Wohnfläche des Erdgeschosses: %.2fm^2 \n", building.livingSpaceOneFloor(0));
        System.out.printf("Gesamte Wohnfläche des zweiten Stockes: %.2fm^2 \n", building.livingSpaceOneFloor(1));

    }
}