package oop;

public class Songs {
    public static void main(String[] args) {
        Song dreamOn = new Song();
        dreamOn.name = "Dream on";
        dreamOn.author = "Aerosmith";
        dreamOn.yearOfRelease = 1973;
        dreamOn.rating = 9.8;
        dreamOn.printInfo();
    }
}
