package class_exercises;

public class AddConsecutiveIntegers {

    private int lowerBound;
    private int upperBound;
    private int sum;

    AddConsecutiveIntegers(int lowerBound, int upperBound){
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;

        sum = 0;

        for(int i = this.lowerBound; i <= this.upperBound; i++){
            sum += i;
        }

        System.out.println("The sum of integers between " + this.lowerBound + " and "+ this.upperBound + " is: " + sum);
    }

    public static void main(String[] args) {
        AddConsecutiveIntegers adder = new AddConsecutiveIntegers(1, 9);
    }
}
