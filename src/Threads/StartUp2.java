package Threads;

public class StartUp2 extends Thread{

    public void run(){
        System.out.println("Thread secundaria");
    }

    public static void main(String[] args) {
        StartUp2 minhaThread = new StartUp2();
        minhaThread.start();
        System.out.println("Thread principal");
    }
}
