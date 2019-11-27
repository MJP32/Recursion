package module3;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("racecar2"));
    }

    private static boolean isPalindrome(String s){


        if(s.length() <= 1){
            return true;
        }


        if(s.charAt(0) == s.charAt(s.length() -1)  && isPalindrome(s.substring(1, s.length() -1))){
            return true;
        }
        else{
            return false;
        }

    }
}
