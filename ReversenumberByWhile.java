public class ReversenumberByWhile {

    public static void main(String[] args){

        int num = 12345;
        int reverse = 0;
        int remainder = 0;

        while(num!=0){

            remainder = num%10;
            reverse = reverse*10+remainder;
            num = num/10;
        }
        System.out.print("Reverse of no 12345 is :"+reverse);

        System.out.println();



        //Alternate method using String buffer


        int i = 123456;
        String reverse1 = String.valueOf(i);
        StringBuffer stringbuffer = new StringBuffer(reverse1);
        System.out.println("Reverse of number 123456 is :"+stringbuffer.reverse() );


    }


}
