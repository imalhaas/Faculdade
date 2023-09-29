package Arquivos;
import java.io.File;
import java.util.Scanner;


public class StartUp {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo: ");
        String nome = teclado.next();

        File objFile = new File(nome);
        if (objFile.exists()){
            if(objFile.isFile()){
                System.out.println("Nome do arquivo é: " + objFile.getName());
                System.out.println("Tamanho do arquivo é " + objFile.length());
            }

        }else System.out.println("Arquivo inexistente");

    }
}
