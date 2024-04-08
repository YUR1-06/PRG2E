package oop;

public class WineShop {
    int pricePerBottle;
    int count;
    int balance;
    public final int BUY_PRICE = 200;

    boolean sell(int count){
        if(this.count > count){
            balance += count * pricePerBottle;
//            this.count = this.count - count;
            this.count -= count;
            System.out.println("Uspesne prodano");
            return true;
        }else {
            System.out.println("Prodej nemozny - malo lahvi na sklade");
            return false;
        }
    }

    boolean buy(int count){
        if (balance > BUY_PRICE * count){
            balance -= BUY_PRICE * count;
            this.count += count;
            return true;
        } else {
            System.out.println("Koupe nemozna, malo financi");
            return false;
        }
    }

    void printBalance(){
        System.out.println("Prave je na ucte: " + balance);
        System.out.println("Na sklade: " + count + " lahvi");
    }
}
