import java.util.ArrayList;

public class BusCompany {
    private final String name;
    private int numBusses;
    private static int numCompanies = 0;
    private final int arraySize = 5;
    private Bus[] busses;

    BusCompany(String name) {
        this.name = name;
        numCompanies += 1;
        busses = new Bus[arraySize];
    }

    public String getName() {
        return name;
    }

    public boolean createAndAddBus(int id, String model) {
        for (int i = 0; i < numBusses; ++i) {
            if (busses[i].getID() == id || numBusses >= arraySize) {
                return false;
            }
        }
        busses[numBusses] = new Bus(id, model);
        numBusses += 1;
        return true;
    }

    public void removeAllBusses() {
        for (int i = 0; i < numBusses; ++i) {
           busses[i] = null;
        }
        numBusses = 0;
    }

    public static int getNumCompanies () {
        return numCompanies;
    }
}
