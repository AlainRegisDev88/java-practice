import java.util.ArrayList;
import java.util.Scanner;


    class Accumulator{
        Scanner in = new Scanner(System.in);
        public void accumulate(){
            ArrayList<String> arr =  new ArrayList<>();

            String current = "";
            
            while (!current.equals("quit")){
                System.out.println("Enter A word: ");
                current = in.nextLine();
                arr.add(current);
            }

            System.out.println(arr);
        }
    }

public class ArrayReceiver {
    public static void main( String[] args){
        Accumulator acc = new Accumulator();

        acc.accumulate();

    }
}
