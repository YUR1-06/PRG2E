package cvika2;

public class ArraysTasks {
    public static void main(String[] args) {

        //mejte pole celych cisel, reknete, kolikrat je v nem cislo mensi nez 1
//        int[] array = new int[10];
        int counter = 0;
        int[] array = {1,15,-5,32,-44,21,-48,0,0,5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 1){
                System.out.println(array[i]);
                counter++;
            }
        }
        System.out.println("Pocet cisel < 1: " + counter);
        System.out.println("---");
        //vypiste pole, pozpatku
        int[] yarra = {1,2,3,4,5};
        for (int i = yarra.length - 1; i >= 0; i--) {
            System.out.println(yarra[i]);
        }
        System.out.println("------");
        //vypoctete soucet vsech prvku v poli
        int[] sum = {1,2,3,4,5,6};
        int totalSum = 0;
        for (int i = 0; i < sum.length; i++) {
            //totalSum = totalSum + sum[i];
            totalSum += sum[i];
        }
        System.out.println("---");
        int[] zigzag = {1,2,3,4,5,6};
//        for (int i = 0, j = zigzag.length - 1; i < zigzag.length/2; i++, j--) {
//            System.out.println(zigzag[i]);
//            System.out.println(zigzag[j]);
//        }
        for (int i = 0; i < zigzag.length/2; i++) {
            System.out.println( "index " + i + ":" + zigzag[i]);
            System.out.println( "index " + (zigzag.length - i -1) + ":" + zigzag[zigzag.length - i -1]);
        }
    }
}
