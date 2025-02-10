import java.util.ArrayList;

public class Floor {
    private ArrayList<Room> rooms;

    public Floor() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void deleteRoom(Room room) {
        rooms.remove(room);
    }

    //Fläche auf einem Stock wird berechnet
    public double calcSpaceOnFloor() {
        double spaceOnFloor = 0;
        for (Room room : rooms) {
            spaceOnFloor = spaceOnFloor + room.getSquareMeters();
        }
        return spaceOnFloor;
    }
}
