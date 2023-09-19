package JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersList {

    private ArrayList<Integer> numbers;

    public NumbersList() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public int sumNumbers() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public void displayNumbers() {
        System.out.println("Números armazenados:");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Soma total: " + sumNumbers());
    }

    public static void main(String[] args) {
        NumbersList list = new NumbersList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números inteiros (digite 'exit' para sair):");
        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                list.addNumber(number);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido ou 'exit' para sair.");
            }
        }

        list.displayNumbers();
        scanner.close();
    }
}
