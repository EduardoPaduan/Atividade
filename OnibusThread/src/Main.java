public class Main {
    public static void main(String[] args) throws InterruptedException {

        Bus b1 = new Bus();
        System.out.println("Todas as poltronas vazias\n");

        b1.listar();

        Passageiro p1 = new Passageiro("Joao", b1, 1);
        Passageiro p2 = new Passageiro("Eduardo", b1, 2);
        Passageiro p3 = new Passageiro("Joaquina", b1, 3);
        Passageiro p4 = new Passageiro("Merlin", b1, 4);
        Passageiro p5 = new Passageiro("Marilene", b1, 5);
        Passageiro p6 = new Passageiro("Marcia", b1, 6);
        Passageiro p7 = new Passageiro("Tiago", b1, 7);
        Passageiro p8 = new Passageiro("Hugo", b1, 8);
        Passageiro p9 = new Passageiro("Isa", b1, 2);
        Passageiro p10 = new Passageiro("Olinda", b1, 9);
        Passageiro p11 = new Passageiro("Valaria", b1, 11);
        Passageiro p12 = new Passageiro("Kelly", b1, 21);
        Passageiro p13 = new Passageiro("Michele", b1, 15);
        Passageiro p14 = new Passageiro("Cris", b1, 20);
        Passageiro p15 = new Passageiro("Luana", b1, 13);
        Passageiro p16 = new Passageiro("Dayanne", b1, 5);
        Passageiro p17 = new Passageiro("Alexandre", b1, 18);
        Passageiro p18 = new Passageiro("Marcos", b1, 16);
        Passageiro p19 = new Passageiro("Silvia", b1, 3);
        Passageiro p20 = new Passageiro("Teodoro", b1, 4);
        Passageiro p21 = new Passageiro("Joaquina", b1, 4);
        Passageiro p22 = new Passageiro("Amanda", b1, 2);
        Passageiro p23 = new Passageiro("Carlos", b1, 1);
        Passageiro p24 = new Passageiro("Janaina", b1, 5);
        Passageiro p25 = new Passageiro("Celso", b1, 12);
        Passageiro p26 = new Passageiro("Connor", b1, 1);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();
        p11.start();
        p12.start();
        p13.start();
        p14.start();
        p15.start();
        p16.start();
        p17.start();
        p18.start();
        p19.start();
        p20.start();
        p21.start();
        p22.start();
        p23.start();
        p24.start();
        p25.start();
        p26.start();

        Thread.sleep(2000);
        b1.listar();

    }
}
