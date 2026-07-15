import java.util.ArrayList;

public class CustomDelimiter {

    class Delimiter {
        public static void delimiter(String text) {
            ArrayList<String> arr = new ArrayList<>();
            StringBuilder temp = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                char current = text.charAt(i);

                if (current == ' ') {
                    if (temp.length() > 0) {
                        arr.add(temp.toString());
                        temp.setLength(0);
                    }
                }
                else{
                    temp.append(current);
                }
            }

            if (temp.length() > 0){
                arr.add(temp.toString());
            }

            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        Delimiter.delimiter("Regis Roger Hono Pame");
    }
}
