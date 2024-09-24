package it.itismeucci;

public class Main {
    public static void main(String[] args) {

        int l=15;
        MioThread t1 = new MioThread(l);
        MioThread t2 = new MioThread(l);
        Thread t3 = new Thread(t1);
        t3.start();
  }
}