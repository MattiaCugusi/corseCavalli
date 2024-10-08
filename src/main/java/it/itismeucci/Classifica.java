package it.itismeucci;

public class Classifica {
    
    static synchronized void fine(int id){
        Main.classifica.add(id);
    }

}
