package TreeSet;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree {

    public static void main(String[] args) {
        TreeSet<String> listaNome = new TreeSet<>();
        listaNome.add("Lucas");
        listaNome.add("Manu");
        listaNome.add("Beta");
        listaNome.add("Geraldo");

        Iterator<String> iterator = listaNome.iterator();

           while (iterator.hasNext()){
               System.out.println(iterator.next());
           }
    }
}
