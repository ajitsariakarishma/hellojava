import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args){


        floydtriangle();
    }

    public static void floydtriangle(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of rows for Floyd's triangle: ");
        int row = scanner.nextInt();
        int k = 0;
        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=i ;j++){
                k++;
                System.out.print(k+" ");

           }
            System.out.println("");



        }





    }


}
