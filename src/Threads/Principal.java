package Threads;

public class Principal {
    public static void main(String[] args) {
        MinhaClassComum minhaClassComum = new MinhaClassComum();
        MinhaThread mInhaThread1 = new MinhaThread(minhaClassComum, "Welcome");
        MinhaThread mInhaThread2 = new MinhaThread(minhaClassComum, "New");
        MinhaThread mInhaThread3 = new MinhaThread(minhaClassComum, "Developer");

    }
}
