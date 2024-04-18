package cvika1;

import java.util.Arrays;
import java.util.Scanner;

public class GuessArray {
    public static void main(String[] args) {
        int tries = 6;
        int numbers = 5;
        int min = 5;
        int max = 20;

        int[] guessArray = new int[numbers];
        for (int i = 0; i < guessArray.length; i++) {
            guessArray[i] = (int)(Math.random()*(max-min+1)+min);
        }
//        System.out.println(Arrays.toString(guessArray));
        int score = 0;
        Scanner sc = new Scanner(System.in);
        int input = 0;
        for (int i = 0; i < tries; i++) {
            System.out.println("Tipni cislo");
            input = sc.nextInt();
            for (int j = 0; j < guessArray.length; j++) {
                if (guessArray[j] == input){
                    score += 20;
                    //score = score + 20;
                    System.out.println("Cislo nalezeno, +20 bodu");
                    guessArray[j] = -1;
//                    System.out.println(Arrays.toString(guessArray));
                }
            }
            if (score == 100){
                System.out.println("Tipl jsi vse!");
                break;
            }
        }
        System.out.println("Hra ukoncena");
        System.out.println("Ziskal jsi " + score + " bodu!");
        System.out.println(Arrays.toString(guessArray));
    }
}
