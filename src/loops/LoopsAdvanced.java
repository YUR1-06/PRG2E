package loops;

public class LoopsAdvanced {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                System.out.println(i*j);
            }
        }
    }
}
