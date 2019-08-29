import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args){

        reversestring();
        System.out.println();
        alternatemeyhod();
    }



    public static void reversestring(){

         String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the string/name to be reversed:  ");
        String a = scanner.nextLine();
        int b = a.length();// storing the lenght of string eg:4
        for(int i = b-1;i>=0;i--){//i=3(4-1), condition is true till i becomes zero
            str = str+a.charAt(i);}// starting from last character and storing in the variable.
            System.out.println("String/name reversed is :  "+ str);


    }

    public static void alternatemeyhod(){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the string/name to be reversed:  ");
        String a = scanner.nextLine();
        StringBuffer stringbuffer = new StringBuffer(a);

        System.out.println("reverse string is : "+stringbuffer.reverse());




    }


}
