public class StringsClass {
    public static void main(String [] args){
        String text = "    Ashesi University    ";
        System.out.println(text);
        System.out.println(text.trim());
        System.out.println(text.trim().length());
        System.out.println(text.trim().charAt(9));
        System.out.println(text.trim().indexOf("esi"));
        System.out.println(text.trim().replace("Ashesi", "My"));
        System.out.println(text.trim().split(" "));
        
        // string builder: to avoid creation of multiple strings(as it is immutable)
        StringBuilder inc = new StringBuilder();
        for (int i = 0; i < 5; i++){
            inc.append(i).append(",");
        }
        String incString = inc.toString();

        // getting typeof() => python:  java version
        System.out.println(incString.getClass().getSimpleName());
    }
}
