public class Passageiro extends Thread{
    private String nome;
    private Bus b;
    private int poltrona;

    public Passageiro(String nome, Bus b, int poltrona){
        this.nome = nome;
        this.b = b;
        this.poltrona = poltrona - 1;
    }

    @Override
    public void run(){
        try{
            b.compra(this, this.poltrona);
        }
        catch(InterruptedException ex){
            System.out.println(ex.toString());
        }
    }
    public String getNome(){
        return this.nome;
    }

}