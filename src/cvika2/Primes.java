package cvika2;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        //uzivatel zada cislo, zjistete, jestli to je prvocislo
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        int input = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < input; i++) {
            if (input % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println("Je prvocislo? " + isPrime);
    }

}
