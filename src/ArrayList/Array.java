package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Array { //Array é uma lista encadeada.

    public static void main(String[] args) {

        List<String> listaNome = new ArrayList<>();
        listaNome.add("Leite");
        listaNome.add("Carne");
        listaNome.add("Arroz");

        System.out.println("Antes");

        for(String nome : listaNome){
            System.out.println(nome);;
        }



        listaNome.set(1, "Queijo"); //Mudara o que está na posição 1, pela nova String.

        System.out.println();
        System.out.println();

        System.out.println("Depois");


        listaNome.remove(0); //Removera a String que está na posição 0.

        for (String nome : listaNome){
            System.out.println(nome);
        }



        // VECTOR É A MESMA COISA QUE O ARRAYLIST, MAS É PROTEGIDO, E ELE DOBRA O NUMERO DE MEMORIA QUANDO É USADO


    }
}
