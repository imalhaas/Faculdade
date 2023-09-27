package ExeptionsEdit;

public class Teste {

    public static void main(String[] args) {

        try{
            throw new ExcexaoCustomizada("minha exexão");

        }catch (ExcexaoCustomizada excexaoCustomizada){

            System.out.println("Ocorreu uma exeção");
            System.out.println(excexaoCustomizada.getMessage());
        }
    }
}
