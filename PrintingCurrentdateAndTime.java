import java.util.Calendar;
import java.util.Date;

public class PrintingCurrentdateAndTime {


    public static void main(String[] args) {
        Date c = new Date();

        System.out.println("Today's date and time: ");
        System.out.println(c);
        //System.out.format("%tB %te, %tYn",c,c,c);

        // System.out.format("%t1:%M:%tp%n",c,c,c);
    }
}
