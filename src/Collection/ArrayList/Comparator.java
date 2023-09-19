package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {

    public static void main(String[] args) {
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Lucas");
        listaNome.add("Beta");
        listaNome.add("Matheus");
        listaNome.add("Backer");

        System.out.println(" Elementos antes da ordenação ");

        for (int i = 0; i < listaNome.size(); i++)
            System.out.println(listaNome.get(i));


            java.util.Comparator<String> comparator = Collections.reverseOrder(); // vai inverter a orden que mostrará a lista.

            Collections.sort(listaNome, comparator);// Criterio que vai ser comparado e o que vai ser.

            System.out.println("Elementos depois da ordenação");

            for (String nome : listaNome){
                System.out.println(nome);

        }

    }
}
