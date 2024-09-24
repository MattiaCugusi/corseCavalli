package it.itismeucci;

public class MioThread implements Runnable{

    private int l;

    public MioThread(int lunghezza){
        l = lunghezza;
    }


    public void run() {
        for (int i=0; i<l; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        
    }
}
