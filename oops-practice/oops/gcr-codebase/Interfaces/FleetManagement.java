class TransportUnit {

    String unitId;

    TransportUnit(String unitId) {
        this.unitId = unitId;
    }

    double fuelCost(int km) {
        return 0;
    }
}

class MiniVan extends TransportUnit {

    MiniVan(String unitId) {
        super(unitId);
    }

    @Override
    double fuelCost(int km) {
        return km * 8.0;
    }
}

class Traveller extends TransportUnit {

    Traveller(String unitId) {
        super(unitId);
    }

    @Override
    double fuelCost(int km) {
        return km * 15.0;
    }
}

class Moped extends TransportUnit {

    Moped(String unitId) {
        super(unitId);
    }

    @Override
    double fuelCost(int km) {
        return km * 3.0;
    }
}

class BatteryVan extends TransportUnit {

    BatteryVan(String unitId) {
        super(unitId);
    }

    @Override
    double fuelCost(int km) {
        return km * 2.0;
    }
}

public class FleetManagement {

    public static void main(String[] args) {

        TransportUnit[] fleet = {
                new MiniVan("MV101"),
                new Traveller("TR201"),
                new Moped("MP301"),
                new BatteryVan("BV401")
        };

        int km = 50;

        for (TransportUnit t : fleet) {

            System.out.println("Cost for " + t.unitId +
                    " = ₹" + t.fuelCost(km));

            if (t instanceof MiniVan) {
                MiniVan m = (MiniVan) t;
                System.out.println("This is a MiniVan");
            } else if (t instanceof Traveller) {
                Traveller tr = (Traveller) t;
                System.out.println("This is a Traveller");
            } else if (t instanceof Moped) {
                Moped mp = (Moped) t;
                System.out.println("This is a Moped");
            } else if (t instanceof BatteryVan) {
                BatteryVan bv = (BatteryVan) t;
                System.out.println("This is a BatteryVan");
            }

            System.out.println();
        }
    }
}