import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

class printingRandomArray {
    static int[] randomNumbers = new int[10];

    public static int[] randomArrayUnsorted() {
        Random rand =  new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = rand.nextInt(100);
        }
        return randomNumbers;
    }

}

public class ArraysClass {
    public static void main(String[] args) {

    }
}
