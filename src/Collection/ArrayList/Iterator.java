package Collection.ArrayList;

import java.util.ArrayList;

public class Iterator {

    public static void main(String[] args) {
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Lucas");
        listaNome.add("Beta");
        listaNome.add("Ricardina");
        listaNome.add("Duda");

        java.util.Iterator<String> iterator = listaNome.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
