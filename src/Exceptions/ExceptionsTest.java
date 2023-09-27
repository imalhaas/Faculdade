package Exceptions;

import java.util.Scanner;

public class ExceptionsTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer dividendo = scanner.nextInt();
        Integer divisor = scanner.nextInt();

        try{
            Integer resultado = dividendo / divisor;
            System.out.println("Resultado= " + resultado);
        }catch (Exception e){

                System.out.println("causa: " + e.getCause());
                System.out.println("Menagem: " + e.getMessage());
                System.out.println("Tipo de exception: " + e.getClass().getCanonicalName());
                System.out.println("Não foi possivel pegar o resultado");

            }
        }
    }

