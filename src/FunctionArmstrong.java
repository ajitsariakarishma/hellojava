public class FunctionArmstrong {


    public static boolean IsArmstrong(int num){

        int sum=0;
        int temp = num;
        int cube = 0;
        while(num>0){
            sum= num%10;
            cube= cube+(sum*sum*sum);
            num= num/10;

        }
        System.out.println("number entered is :"+temp);
        if(temp==cube){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("153 is an armstrong number: " +IsArmstrong(153));
        System.out.println("653 is an armstrong number: " +IsArmstrong(653));

    }
}
