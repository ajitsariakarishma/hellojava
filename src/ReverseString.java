import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args){

        reversestring();
    }



    public static void reversestring(){

         String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the string/name to be reversed:  ");
        String a = scanner.nextLine();
        int b = a.length();// storing the lenght of string eg:4
        for(int i = b-1;i>=0;i--){//i=3(4-1), condition is true till i becomes zero
            str = str+a.charAt(i);}// starting from last character and storing in the variable.
            System.out.print("String/name reversed is :  "+ str);


    }


}
