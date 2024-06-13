package test;

class Geolocation {
     double x;
     double y;

    public Geolocation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double vzdalenost(Geolocation other) {
        double vx = this.x - other.x;
        double vy = this.y - other.y;
        return Math.sqrt(vx * vx + vy * vy);
    }
}

class City {
     String nazev;
     Geolocation lokace;

    public City(String nazev, Geolocation lokace) {
        this.nazev = nazev;
        this.lokace = lokace;
    }

    @Override
    public String toString() {
        return nazev + " (" + lokace.getX() + ", " + lokace.getY() + ")";
    }

    public Geolocation getLocation() {
        return lokace;
    }
}

class TravelPlan {
    private City start;
    private City destination;
    double pricePerUnit;

    public TravelPlan(City start, City destination, double pricePerUnit) {
        this.start = start;
        this.destination = destination;
        this.pricePerUnit = pricePerUnit;
    }

    public void getPlan() {
        double distance = start.getLocation().vzdalenost(destination.getLocation());
        double totalCost = distance * pricePerUnit;

        System.out.println("Cesta od města " + start.toString() + " do " + destination.toString());
        System.out.println("Vzdálenost: " + distance);
        System.out.println("Celková cena: " + totalCost);
    }
}

class main {
    public static void main(String[] args) {
        Geolocation lokace1 = new Geolocation(21.7, 17.1);
        Geolocation lokace2 = new Geolocation(32.5, 28.4);

        City mesto1 = new City("Praha", lokace1);
        City mesto2 = new City("Brno", lokace2);

        TravelPlan plan = new TravelPlan(mesto1, mesto2, 5.0);
        plan.getPlan();
    }
}
