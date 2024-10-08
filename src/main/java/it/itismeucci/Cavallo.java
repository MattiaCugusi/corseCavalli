package it.itismeucci;

public class Cavallo extends Thread {

    private int l;
    private int identificativo;

    public Cavallo(int lunghezza, int id){
        l = lunghezza;
        identificativo = id;
    }

    private int attesa;


    public void run() {
        for (int i=0; i<l; i++){
            try {
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        Classifica.fine(this.identificativo);
        
    }


  

    @Override

    public String toString(){
        return "Cavallo n: " + identificativo;
    }

}
