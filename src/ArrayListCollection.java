import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {
    public static void main(String[] args) {
        //creating array list
        ArrayList<String> list = new ArrayList<String>();
        //adding elements
        list.add("alpha");
        list.add(1, "beta");
        System.out.println(list);
        for (String i : list) {
            System.out.println(i);
        }
        list.removeAll(list);
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        Iterator itr = list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }



    }

}
