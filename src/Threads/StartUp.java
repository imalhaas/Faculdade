package Threads;

public class StartUp {

    public static void main(String[] args) {

        MinhaRunnable minhaRunnable = new MinhaRunnable();

        Thread t1 = new Thread(minhaRunnable);
        t1.setName("teste1 thread");
        t1.start();

        Thread t2 = new Thread(minhaRunnable);
        t2.setName("Teste2 thread ");
        t2.start();


    }
}
