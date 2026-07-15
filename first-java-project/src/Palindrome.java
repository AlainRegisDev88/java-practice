public class Palindrome {
    class CheckPalindrome{
        public static Boolean isPalindrome(String text){
            int lastIndex = (text.length()) - 1;
            for (int i = 0; i <= lastIndex; i++){
                if (text.charAt(i) != (text.charAt(lastIndex-i))){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String [] args){
        Boolean testRacecar = CheckPalindrome.isPalindrome("racecar");
        System.out.println(testRacecar);
    }
}
