import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

class printingRandomArray {
    static int[] randomNumbers = new int[10];
    static Random rand =  new Random();
    public static int[] randomArrayUnsorted() {
        
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = rand.nextInt(100);
        }
        return randomNumbers;
    }

    public static int[] randomArraySorted(){
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = rand.nextInt(100);
        }
        Arrays.sort(randomNumbers);
        return randomNumbers;
    }

}

public class ArraysClass {
    public static void main(String[] args) {

    }
}
