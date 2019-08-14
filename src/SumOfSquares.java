public class SumOfSquares {

public static void main(String[] args){

    int i =1;
   int sum = 0;
   int sum2 = 0;
   int temp1=0;
    do{
        sum =(i*i)+(i*i);
         temp1=i*i;
         temp1 = sum;
        sum2=sum2+sum;
        System.out.println("The sum of square of "+i+" is :"+sum );
        i++;


    }while (i<=100);
    System.out.print("The sum of squares of all numbers from 1 to 100 is:   "+sum2+"  ");


}


}
