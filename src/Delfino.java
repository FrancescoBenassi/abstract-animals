public class Delfino extends Animale implements Marino{

    @Override
    public void verso(){
        System.out.println("Verso del delfino");
    }

    @Override
    public void mangia(){
        System.out.println("Pesci");
    }
    
     @Override
     public void nuota(){
        System.out.println("Sto nuotando");
     } 
}
