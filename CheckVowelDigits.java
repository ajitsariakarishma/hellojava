import java.util.Scanner;

public class CheckVowelDigits {

    public static void main(String[] args) {


        checkvoweldigit();
    }


    static public void checkvoweldigit() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string/name: ");
        String name = scanner.nextLine();
        double j = name.length();
        int vowel = 0;
        int num = 0;
        double percentagevowel;
        double percentagedigit;
        char ch[] = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            char temp = ch[i];
            if (temp == 'a' || temp == 'A' ||
                    temp == 'e' || temp == 'E' ||
                    temp == 'i' || temp == 'I' ||
                    temp == 'o' || temp == 'O' ||
                    temp == 'u' || temp == 'U') {

                vowel++;
            } else if (temp >= '0' && temp <= '9')
                num++;
        }

        percentagevowel = (vowel / j * 100);
        percentagedigit = (num / j * 100);
        System.out.println(" Number of vowels in string is : " + vowel);
        System.out.println(" Percentage of vowels in string is : " + percentagevowel);
        System.out.println(" Number of digits in string is : " + num);
        System.out.println(" Percentage of digits in string is : " + percentagedigit);
        System.out.println(" lenght of string : " + j);
    }

}

















