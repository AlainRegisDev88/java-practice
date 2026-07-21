import java.util.Arrays;
import java.util.Random;

class RandomArray {
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
        int[] sortedArray = RandomArray.randomArraySorted();
        System.out.println("Random Sorted Array: ");
        for(int i=0; i<10; i++){
            System.out.print(sortedArray[i] + ", ");
        }
        
        System.out.println();

        int[] unsortedArray = RandomArray.randomArrayUnsorted();
        System.out.println("Random Unsorted Array: ");
        for(int i=0; i<10; i++){
            System.out.print(unsortedArray[i] + ", ");
        }
    }
}
