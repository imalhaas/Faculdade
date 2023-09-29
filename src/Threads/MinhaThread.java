package Threads;

public class MinhaThread extends Thread {
    String mensagem;
    MinhaClassComum minhaClassComum;

    MinhaThread(MinhaClassComum ClassComum, String msg) {
        minhaClassComum = ClassComum;
        mensagem = msg;
        start();
    }
    public void run(){
        synchronized (minhaClassComum){
            minhaClassComum.exiir(mensagem);
        }
    }
}
