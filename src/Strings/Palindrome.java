package Strings;

public class Palindrome {
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int left = 0, right =  str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "Deep";
        if(isPalindrome(str1)){
            System.out.println(str1 +" is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
