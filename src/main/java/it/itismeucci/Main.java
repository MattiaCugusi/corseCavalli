package it.itismeucci;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static List<Cavallo> classifica = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {

      

        int l=15;
        Cavallo c1 = new Cavallo(l, 1);
        c1.start();
        Cavallo c2 = new Cavallo(l, 2);
        c2.start();
        Cavallo c3 = new Cavallo(l, 3);
        c3.start();
        Cavallo c4 = new Cavallo(l, 4);
        c4.start();
        Cavallo c5 = new Cavallo(l, 5);
        c5.start();
        Cavallo c6 = new Cavallo(l, 6);
        c6.start();
        Cavallo c7 = new Cavallo(l, 7);
        c7.start();
        Cavallo c8 = new Cavallo(l, 8);
        c8.start();
        Cavallo c9 = new Cavallo(l, 9);
        c9.start();
        Cavallo c10 = new Cavallo(l, 10);
        c10.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();
        c5.join();
        c6.join();
        c7.join();
        c8.join();
        c9.join();
        c10.join();

        System.out.println(classifica);
  }
}