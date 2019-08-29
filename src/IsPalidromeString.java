import java.util.Scanner;
public class IsPalidromeString {


    public static boolean IsPalindromeString(String a){

        StringBuffer stringbuffer = new StringBuffer(String.valueOf(a)).reverse();
        System.out.println("original string is : "+a);
        System.out.println("reverse string is :"+ stringbuffer);
       if(a.contentEquals(stringbuffer)){

           return true;
       }
       return false;

    }

    public static void main(String[] args) {
        System.out.println(" 'reet' is a Palindrome string: "+IsPalindromeString("reet"));

    }


}
