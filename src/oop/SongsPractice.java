package oop;

public class SongsPractice {

    public static void main(String[] args) {
        Song paintIt = new Song("Paint it, black",
                227, "The Rolling stones", 9.5, 1966);
//        paintIt.name = "Paint it, black";
//        paintIt.releaseYear = 1966;
//        paintIt.composer = "The Rolling stones";
//        paintIt.rating = 9.3;
//        paintIt.duration = 227;
        paintIt.printInfo();

//        Song dream = new Song();
//        dream.name = "Dream on";
//        dream.composer = "Aerosmith";
//        dream.printInfo();
    }

}
