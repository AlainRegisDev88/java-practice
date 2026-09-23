package class_exercises;

public class MaximumNumber {
    private int max(int i, int j) {
        if (i < j) {
            return j;
        }
        else{
            return i;
        }
    }

    public static void main(String[] args) {
        MaximumNumber i = new MaximumNumber();
        System.out.println(i.max(3, 6));
    }
}
