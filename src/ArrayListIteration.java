import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {


    public static void main(String[] args) {

        ArrayList<String> tvSeries = new ArrayList<String>();
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("Another Life");
        tvSeries.add("HomeLand");
        tvSeries.add("Friends");

        //using for each loop and lambda expression
        System.out.println("\n*********print with for each loop and lambda*****************");
        tvSeries.forEach(shows->{
            System.out.print("  "+shows+"  ");
        });
        System.out.println("\n*********print with iterator*****************");

        //using iterator method
        Iterator<String> show = tvSeries.iterator();
        while(show.hasNext()){
            String show1= show.next();
            System.out.print(" "+ show1+"  ");
        }
        //using iterator and forEachRemaining() Method
        System.out.println("\n***********using iterator,lambda and forEachRemaining() Method************************");
          show = tvSeries.iterator();
          show.forEachRemaining(show2->{
              System.out.print("  "+show2+"  ");
          });

          //using normal for each loop
        System.out.println("\n*********print using normal for each loop *****************");
        for(String shows:tvSeries){
            System.out.print(" "+shows+"  ");
        }
       // using for loop most standard way
        System.out.println("\n*********print using normal for  loop *****************");
        for(int i = 0; i<tvSeries.size();i++){
            System.out.print("  "+tvSeries.get(i)+"  ");

        }






    }


}
