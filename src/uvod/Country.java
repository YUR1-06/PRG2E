package uvod;

public class Country {
    CountryLanguage countryLanguage;
    int population;

    public Country( CountryLanguage countryLanguage, int population) {
        this.countryLanguage = countryLanguage;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Zeme :" +
                ", jazyk je " + countryLanguage.jazyk +
                ", ma pocet obyvatel " + population +
                '}';
    }
}
