public class FactorialNumber {

    public static int IsFactorial(int num) {

        int temp = num;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }
        return factorial;


    }

    public static void main(String[] args) {
        System.out.println("Factorial of 4 is :"+IsFactorial(4));
        System.out.println("Factorial of 10 is :"+IsFactorial(10));
        System.out.println("Factorial of 5 is :"+IsFactorial(5));

    }
}
