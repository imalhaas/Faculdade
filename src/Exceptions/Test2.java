package Exceptions;

public class Test2 {

    public static void main(String[] args) {

        try{

            int resultado = 10 / 0;
            System.out.println(resultado);
        }catch (Exception e){
            System.out.println("Erro " + e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
