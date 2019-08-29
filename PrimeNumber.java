import java.util.Scanner;

public class PrimeNumber {

    public static boolean IsPrime(int num) {
        if (num <= 0) {
            return false;
        }
        for (int i = 2; i < num; i++) {
          if (num%i==0){
              return false;
          }

        }
        return true;
    }

    public static void GetPrimeNumbers(){
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number till where you want to list Prime numbers:  ");
        int num = scanner.nextInt();
       System.out.print("Prime numbers from 1 to "+ num+ " are : ");
        for(int i=2;i<=num;i++){
       if(IsPrime(i)){

            System.out.print(i +" ");}
        }



    }

    public static void main(String[] args) {
       // System.out.println("3 is a prime number: "+IsPrime(3));
        //System.out.println("8 is a prime number: "+IsPrime(8));
        //System.out.println("17 is a prime number: "+IsPrime(17));
        //System.out.println("0 is a prime number: "+IsPrime(0));
        //System.out.println("-3 is a prime number: "+IsPrime(-3));

          GetPrimeNumbers();





    }

}











