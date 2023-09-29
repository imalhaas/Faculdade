package Threads;

import com.sun.source.tree.SynchronizedTree;

public class MinhaClassComum {
    public void exiir(String msg)
    {  // synchronized vai executar mesmo descandado 1s, o outro so vai poder usar depois que esse acabar.
        System.out.println("["+msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("]");
    }

}
