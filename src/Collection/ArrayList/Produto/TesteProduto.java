package Collection.ArrayList.Produto;

import java.util.ArrayList;
import java.util.Collections;

public class TesteProduto {

    public static void main(String[] args) {
        ArrayList<Produto> s = new ArrayList<Produto>();
        s.add(new Produto(123, "Camiseta", 300));
        s.add(new Produto(234, "Calça", 400));
        s.add(new Produto(545, "Jaqueta", 500));
        s.add(new Produto(765, "Tênis", 250));

        System.out.println("Lista antes da ordenação: ");

        for (Produto shop : s){
            System.out.println(shop.quantidadeEstoque + " " + shop.nomeProduto
            + " " + shop.codigoProduto);
        }
        System.out.println();

        System.out.println("Lista depois da ordenação");

        Collections.sort(s, new EstoqueComparator());

        for (Produto shop : s){
            System.out.println(shop.quantidadeEstoque
            + " " + shop.nomeProduto
            + " " + shop.codigoProduto);
        }
    }
}
