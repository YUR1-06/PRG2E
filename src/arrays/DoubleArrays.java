package arrays;

import java.util.Arrays;

public class DoubleArrays {
    public static void main(String[] args) {
        double real = 12.21;
        double[] doubleArray = {15.2, 123.1, real, .5, -.98, -108.108, 100_000};
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
        System.out.println("---");
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] < 0){
                System.out.println(doubleArray[i]);
            }
        }
        System.out.println("---");
        //suma pole
        double arraySum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
//            arraySum = arraySum + doubleArray[i];
            arraySum += doubleArray[i];
        }
        System.out.println("Sum of array: " + arraySum);
        System.out.println("Average value: " + (arraySum / doubleArray.length));
        System.out.println("---");
        System.out.println(Arrays.toString(doubleArray));

//        double[] points = {-2, -1, 0, 1, 2};
//        for (int i = 0; i < points.length; i++) {
//            System.out.println("body: ");
//            System.out.println("x = " + points[i]);
//            double y =  2*points[i] + 5;
//            System.out.println("y = " + y);
//        }
//        System.out.println("---");



    }
}
