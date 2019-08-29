public class ReplaceJunk {

    public static void main(String[] args){

        String junk = "@#$% karish ma&1234~#@";
        // by using regular expression ([^a-zA-Z0-9]^ means - not

        junk = junk.replaceAll("[^a-zA-Z0-9]","");
        System.out.print(" "+junk);


    }

}
