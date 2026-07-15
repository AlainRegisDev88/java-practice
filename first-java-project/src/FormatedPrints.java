import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FormatedPrints {
    class ItemsTable{

        // tried to use these but they are not efficient
        // String [] items = {"Banana", "Mango", "Coffe"};
        // ArrayList<Integer> quantity = new ArrayList<>();

        // more efficient
        static HashMap<String, Integer> shoppingList= new HashMap<>(Map.of("Milk", 2, "Eggs", 12, "Bread", 1, "Apples", 5, "Chicken", 2));

        
        public static void itemsTable(){
            System.out.printf("|%-10s|%-10s|%n", "Item", "Quantity");

            // int itemsCount =  shoppingList.size();
            
            shoppingList.forEach((item, quantity)->{
                System.out.printf("|%-10s|%-10s|%n", item, quantity);
            });
        }
    }



    public static void main(String[] args) {
        ItemsTable.itemsTable();

        double a = 56.69293934;
        int b = 5;

        // rounded outputs
        System.out.printf("Number rounded off by 2: %.2f%n", a);
        System.out.printf("Number rounded off by 4: %.4f%n", a);

        // trailing zeros
        System.out.printf("ID: %05d%n", b);
    }
}