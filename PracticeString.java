public class PracticeString {

    public static void main(String[] args) {

        String a = "Java Practices";
        String b = "java Practices";

        System.out.println("character at position 0 is: "+ a.charAt(0));
        System.out.println("character at code point 10  is: "+ a.codePointAt(9));
        System.out.println("character at code point 10  is: "+ a.codePointBefore(10));
        System.out.println("character at code point 10  is: "+ a.codePointCount(2,6));//giving count of characters in btw
        int g = a.compareTo(b);// if (a) is big then returns positive value and negative value if (a) it is small

        System.out.println("comparing two strings: "+ g);// returns 0 if they are same
        System.out.println("comparing two strings: "+ a.compareToIgnoreCase(b));// returns 0 if they are same ignoring case
        System.out.println(a.concat("abc"));// appends the string after it ends wit another
        System.out.println(a.concat(b));// appends the string after it ends with another
        System.out.println(a.contains("Practices"));//returns true if characgter or word is present and false if not
        System.out.println(a.contentEquals(b));// returns true if they are same and false if they are different
        System.out.println(a.endsWith("es"));// checks the string accordingly and returns true and false
        System.out.println("**********************************");
        System.out.println(b.charAt(3));// prints the character at index no. 3 in b(java practices)
        System.out.println(b.substring(6));// prints the string from index no. 6 including the chracter at indexno.6
        System.out.println(b.substring(5,8));// prints the string from index no.5 to index no7
                                            // starting index no is inclusive and ending is exclusive
        System.out.println(b.replaceAll("a","e"));// replaces all a in string with e



      System.out.println("oppvvt".substring(3,5).replace("v","g"));


       // System.out.println(b.toCharArray()[3]);//prints charcter at index no.3
        System.out.println("HELLO WORLD".toCharArray()[6]);
        System.out.println(b.startsWith("@"));//returns boolean value(false as string doesn't start with '@'

        System.out.println("@900".startsWith("@"));// returns true




        System.out.println(b.endsWith("s"));// same as startWith, instead checks ending of the string.



        System.out.println("$1,250".substring(1).replace(",",""));
        System.out.println(b.substring(2).replace("y","g"));






    }





}
