public class IsPalindromeNumber {


    public static boolean IsPalindrome(int num) {
        int rev = 0;
        int num1 = num;


        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (rev == num1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("121 is a Palindrome number  : "+IsPalindrome(121));
        System.out.println("34543 is a Palindrome number: "+IsPalindrome(34543));
    }

}


