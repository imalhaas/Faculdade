package LinkedList;

import javax.swing.*;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Linked { //Lista encadeada

    public static void main(String[] args) {

        List<String> listaItens = new LinkedList<>();
        listaItens.add("Cambio");
        listaItens.add("Volante");
        listaItens.add("Painel");
        listaItens.add("Farol");

        System.out.println("Antes");

        for (String protudos : listaItens){
            System.out.println(protudos);
        }


        System.out.println();

        System.out.println("Depois");

        listaItens.add(0, "Oleo"); //Adiciona uma nova String na posição 0.

        for (String protudos : listaItens){
            System.out.println(protudos);
        }



    }
}
