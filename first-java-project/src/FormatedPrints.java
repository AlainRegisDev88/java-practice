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

            int itemsCount =  shoppingList.size();
            System.out.println(itemsCount);
        }
    }


    public static void main(String[] args) {
        ItemsTable.itemsTable();
    }
}