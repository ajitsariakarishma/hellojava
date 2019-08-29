import java.util.Scanner;

public class trialone {
public static void main(String[] args){


    Scanner scanner = new Scanner(System.in);

    System.out.print("enter size of array: ");
    int z= scanner.nextInt();
    int a[] = new int[z];
     for(int b = 0; b<a.length; b++){
          System.out.println("enter number ");
          int c = scanner.nextInt();
          a[b] = c;
         System.out.println(" number "+ c +" is stored in index position " + b);




     }

     for(int i:a){
         System.out.println(i);
     }


}


    }



