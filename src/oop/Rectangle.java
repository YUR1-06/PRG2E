package oop;

public class Rectangle {
    int width;
    int height;

    public int getArea(){
        return width * height;
    }

    public boolean isSquare(){
//        if (width == height){
//            return true;
//        } else {
//            return false;
//        }
        return width == height;
    }
}
