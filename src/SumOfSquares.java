public class SumOfSquares {

public static void main(String[] args){

    int i =1;
   int sum = 0;
   int sum2 = 0;
    do{
        sum = i*i*i;
        int temp = sum;
        sum2=sum2+sum;
        i++;


    }while (i<=100);
    System.out.print("The sum of cubes of all numbers from 1 to 100 is:   "+sum2+"  ");

}


}
