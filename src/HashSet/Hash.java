package HashSet;

import java.util.HashSet;

public class Hash {
    //Hash não tem como controlar a ordem que os eletemntos vão ser mostrados.
    //Mesmo que esteja incluido dois itens iguais, só mostrada um

    public static void main(String[] args) {

        HashSet<String> alfabeto = new HashSet<>();

        alfabeto.add("A");
        alfabeto.add("B");
        alfabeto.add("C");
        alfabeto.add("D");
        alfabeto.add("E");
        alfabeto.add("F");

        for (String letras : alfabeto){
            System.out.println(letras);
        }

        System.out.println("Tamanho do hashSet= " + alfabeto.size());


    }
}
