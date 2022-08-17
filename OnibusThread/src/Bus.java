public class Bus {
    private static boolean poltronas[] = new boolean[20];
    private static int n=0;

    public synchronized void compra(Passageiro p, int assento) throws InterruptedException{
        try {
            if(poltronas[assento] == false){
                System.out.println(p.getNome()+ " comprou o assento " + (assento+1));
                poltronas[assento] = true;
                Thread.sleep(100);
            }
            else{
                System.out.println(p.getNome() + " nao conseguiu realizar a compra da passagem, o assento "+(assento+1)+" ja esta vendido!");
                Thread.sleep(100);
            }
        } catch (IndexOutOfBoundsException IOBE) {
            System.out.println(p.getNome() + " tentou compar um assento que nao existe.");
        }
        catch (Exception e){
            System.out.println("Erro inesperado!");
        }
    }
    public synchronized void listar() {
        System.out.println("\n------------");

        for (int i = 0; i < 20; i++) {
            System.out.print(i + 1 + "-" + poltronas[i]);
            n++;

            if (n == 2) {
                System.out.print("   ");
            } else if (n == 4) {
                System.out.print("\n");
                n = 0;
            } else
                System.out.print("/");

        }
        System.out.println("------------\n");
    }
}
