package uvod;

public class City {

    Country country;
    int population;

    public City(Country country, int population) {
        this.country = country;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Mesto:" +
                "stat je " + country +
                ", ma pocet lidi " + population +
                '}';
    }
}
