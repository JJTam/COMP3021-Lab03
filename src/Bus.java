public class Bus {
    private final int busID;
    private String model;

    Bus(int busID, String model) {
        this.busID = busID;
        this.model = model;
    }

    public int getID() {
        return busID;
    }
}
