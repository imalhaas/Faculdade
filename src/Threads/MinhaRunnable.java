package Threads;

public class MinhaRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1 ; i < 10; i++) {
            System.out.println("Minha Runnable executando para o nome do topico " + Thread.currentThread().getName());
        }
    }
}
