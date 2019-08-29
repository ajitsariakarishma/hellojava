public class CallByValue {

    public int sum(int a, int b){
       //a=30;
        //b=20;
        int c = a+b;
        return c;

    }
    public static void main(String[] args){
        CallByValue call = new CallByValue();


        call.sum(10,20);
       // int g =c;




    }

}
