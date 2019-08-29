public class JavaPractices {

    public static void main(String[] args) {
         String b = "I m Karishma";
         String arr[] = b.split(" ");// Splits the string according to spaces(can split according to character also
                                           //in that position of split u can include any character
         for (int i = arr.length-1; i>=0;i--){//starts with last character and prints till first split and replaces the
                                              // position with character specified(here it is space but it can be anything

             System.out.print(arr[i]+" # ");// if i keep " " then it will print the same.


         }

    }
}
