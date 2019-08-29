import java.util.Arrays;

import static java.lang.String.valueOf;

public class SrtingFunctions {


    static String name = "Karishma";// is same as a character array

     static String lastname = new String(" ajitsaria");
     static String temp = "TRIAL";
     static String sen = "My name is Karishma";
     static String name1="karishma";
                  static int i = 10;


    public static void main(String[] args) {

     System.out.println(lastname);
     System.out.println(name);
        System.out.println(name.equals(name1));//returns false because there is case difference
        System.out.println(name.equalsIgnoreCase(name1));//returns true because it ignores the case

        System.out.println("first letter in name is:"+ name.charAt(5));
        System.out.println("Index of  letter 's' in " +name+" is: "+ name.indexOf('s'));
        System.out.println("Index of  letter 'a' in " +lastname+" is: "+ lastname.indexOf('a'));//1st occurence
        System.out.println("second occurence"+ lastname.indexOf('a',lastname.indexOf('a')+1));//2nd occurence

        System.out.println("third occurence "+ lastname.indexOf('a',lastname.indexOf('a',lastname.indexOf('a')+1)+1));//3rd occurence
        System.out.println("third occurence "+lastname.indexOf('a', lastname.indexOf('a', lastname.indexOf('a')+1)+1));
        System.out.println("index of (name) in sentence is "+ sen.indexOf("name"));


        System.out.println("last letter in lastname is :"+lastname.charAt(lastname.length()-1));//prints blank char as last char is blank
        System.out.println("this method printd vslue from index numer to mentioned index no.:"+ name.substring(0,4));
        System.out.println("this method printd vslue from index to the last char of string.:"+ name.substring(2));
        System.out.println("this method changes string to uppercase.:"+ name.toUpperCase());
        System.out.println("this method changes string to lowercase.:"+ temp.toLowerCase());
        System.out.println(" System.out.println(\"Index of  letter 'a' in \" +lastname+\" is: \"+ lastname.indexOf('a'));//1st occurence\nthis method trims blank spaces.:"+ lastname.trim());


        String g = valueOf(i);
        System.out.println("this method changes integer to literal string.:"+g);// prints number 10 as string


        //split() splits on the basis of argument and returns a character array
        String test[]=sen.split(" ");
        for(int j=0;j<test.length;j++){

            System.out.println(test[j]);

        }
        System.out.println(Arrays.toString(test));//for printing elements in a array(can also print integer or other type
                                                // as it converts to string literal and prints the elements





    }
}
