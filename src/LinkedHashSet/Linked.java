package LinkedHashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Linked {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(10);
        numeros.add(8);
        System.out.println("ArrayList " + numeros);

        LinkedHashSet<Integer> numerosLinked = new LinkedHashSet<>(numeros); // Por ser um set, não pode ter dublicados.
        System.out.println("LinkedHashSet " + numerosLinked);
    }
}
