package JAVA;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op;

        do {

            System.out.println("---------------");
            System.out.println("Menu principal");
            System.out.println("---------------");
            System.out.println("Selecione uma das opções a baixo");
            System.out.println("1- Aluno");
            System.out.println("2- Professor");
            System.out.println("3- Coordenador");
            System.out.println("0- Sair");

            System.out.println("Qual opçáo deseja?");
            op = teclado.nextInt();

            if (op == 0){
                break;
            }

        } while (true);

        System.out.println("Fim");
    }
}
