import java.util.ArrayList;

public class Building {
    private ArrayList<Floor> floors;

    public Building() {
        this.floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public void deleteFloor(Floor floor) {
        floors.remove(floor);
    }

    //Berechnet die gesamte Wohnfläche des hauses
    public double getLivingSpace() {
        double livingSpace = 0;
        for (Floor floor : floors) {
            livingSpace = livingSpace + floor.calcSpaceOnFloor();
        }
        return livingSpace;
    }

    //Berechnet die Fläche von einem Stockwerk
    public double livingSpaceOneFloor(int FloorNumber) {
        if (FloorNumber >= 0 && FloorNumber < floors.size()) {
            return floors.get(FloorNumber).calcSpaceOnFloor();
        }
        return getLivingSpace();
    }

    public String toString() {
        StringBuilder st = new StringBuilder();

        for (Floor floor : floors) {
            st.append(floor);
            st.append(System.lineSeparator());
        } return st.toString();
    }
}
