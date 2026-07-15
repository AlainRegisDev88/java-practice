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
    }


}
