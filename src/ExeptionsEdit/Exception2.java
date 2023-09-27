package ExeptionsEdit;

import java.util.Scanner;

public class Exception2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite o numero 1 ou 2: ");
            System.out.println();
            try {
                opcao = teclado.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Você digitou a opção: " + opcao);
                        break;
                    case 2:
                        System.out.println("Você digitou a opção: " + opcao);
                        break;
                    default:
                        throw new ExcexaoCustomizada("minha exexão");
                }
            } catch (ExcexaoCustomizada exc) {
                System.out.println(exc.getMessage());
            }
        }while (true) ;
        }
    }


