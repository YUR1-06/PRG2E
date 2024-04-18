package cvika2;

import java.util.Scanner;

public class PracticeLoops {

    public static void main(String[] args) {
        //generuju 2 nahodna cisla (0-20), kolik pokusu, nez padne 2x stejne cislo?
        int num1 = (int) (Math.random()*21);
        int num2 = (int) (Math.random()*21);
        int counter = 1;
        System.out.println(num2 + ", " + num1);
        while (num2 != num1){
            num1 = (int) (Math.random()*21);
            num2 = (int) (Math.random()*21);
            counter++;
            System.out.println(num2 + ", " + num1);
        }
        System.out.println("Zabralo to " + counter + " pokusu");
        System.out.println("-----");
        //generuju 100x dvojice nahodnych cisel, vypisu, kolikrat padlo stejne cislo
        int amountOfSame = 0;
        for (int i = 0; i < 1000; i++) {
            num1 = (int) (Math.random()*21);
            num2 = (int) (Math.random()*21);
            System.out.println(num2 + ", " + num1);

            if (num1 == num2){
                amountOfSame++;
            }
        }
        System.out.println("Stejne cislo padlo " + amountOfSame + "x");

        //uzivatel zada cislo, spoctete faktorial cisla
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo:");
        int input = sc.nextInt();
        int result = 1;

        for (int i = input; i > 0 ; i--) {
            result *= i;
//            result = result * i;
        }
        System.out.println(input + "! = " + result);
    }
}
