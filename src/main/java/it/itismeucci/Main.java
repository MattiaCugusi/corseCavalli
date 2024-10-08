package it.itismeucci;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static List<Integer> classifica = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {

        List<Cavallo> cavalliInGara = new ArrayList<>();

        int l=15;
        int numCavalli = 20;

        for (int i=0; i<numCavalli; i++){
          cavalliInGara.add(new Cavallo(l, i+1));
        }

        for (Cavallo c : cavalliInGara){
          c.start();
        }

        for (Cavallo c : cavalliInGara){
          c.join();
        }
      
        

        System.out.println(classifica);
        System.out.println("hanno completato la gara: " + classifica.size() + " cavalli");
  }
}