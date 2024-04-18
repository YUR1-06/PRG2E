package cvika1;

import java.util.Scanner;

public class LoopsSummary {
    public static void main(String[] args) {
        System.out.println("Zadavej cisla, zadavani ukoncis zadanim -1");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input != -1){
            if (input % 2 == 0){
                System.out.println(input);
            }
            input = sc.nextInt();
        }
        System.out.println("Zadej pocet pater");
        input = sc.nextInt();

        for (int i = 1; i < input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Zadej maximalni pocet");
        input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
