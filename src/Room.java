public class Room {
    private final String roomName;
    private double SquareMeters;

    public String getRoomName() {
        return roomName;
    }

    public Room(String roomName, double squareMeters) {
        this.roomName = roomName;
        this.SquareMeters = squareMeters;
    }

    public double getSquareMeters() {
        return SquareMeters;
    }
}
