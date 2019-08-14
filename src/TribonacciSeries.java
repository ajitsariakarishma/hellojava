import java.util.Scanner;

public class TribonacciSeries {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number limit for Tribonacci series: ");
        int limit = scanner.nextInt();
        int sum = 0;
        int num1=0,num2=1,num3=2;
        System.out.print(num1+"    "+num2+"   "+num3+"  ");
        for(int i=4;i<=limit;i++){
            sum = num1+num2+num3;
            System.out.print("  "+sum+"  ");
            num1=num2;
            num2=num3;
            num3=sum;


        }









    }
}
