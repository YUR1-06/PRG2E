package oop;

public class RectanglePractice {
    public static void main(String[] args) {
        Rectangle abc = new Rectangle();
        abc.width = 4;
        abc.height = 6;
        System.out.println("Obdelnik: W = " +abc.width + " H = " + abc.height);
        System.out.println("Obsah: " + abc.getArea());
        System.out.println("Je to ctverec? " + abc.isSquare());
        Rectangle fgh = new Rectangle();
        fgh.width = 6;
        fgh.height = 6;
        System.out.println("Obdelnik: W = " + fgh.width + " H = " + fgh.height);
        System.out.println("Je to ctverec? " + fgh.isSquare());
    }
}
