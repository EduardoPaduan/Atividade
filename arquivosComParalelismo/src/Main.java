import java.io.File;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {

        File caminho = new File("C:\\Program Files (x86)\\Steam");

        double tempoInicio = System.currentTimeMillis();
        double tamanhoTotalConvencional = Convencional.calculaTamanhoConvencional(caminho);
        double tempoFinal = System.currentTimeMillis() - tempoInicio;

        System.out.printf("CONVENCIONAL\n" +
                        "Tamanho: %.0f bytes\nTamanho: %.2f KB\nTamanho: %.2f MB\n" +
                        "Tamanho: %.2f GB\nTempo gasto de execucao: %.2f milisegundos\n\n"
                ,tamanhoTotalConvencional,tamanhoTotalConvencional/1024,(tamanhoTotalConvencional/1024)/1024,((tamanhoTotalConvencional/1024)/1024)/1024,tempoFinal);



        double tempoInicioParalelismo = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        double tamanhoTotalParalelismo = pool.invoke(new Paralelismo((caminho)));
        double tempoFinalParalelismo = System.currentTimeMillis() - tempoInicioParalelismo;

        System.out.printf("PARALELISMO\n" +
                        "Tamanho: %.0f bytes\nTamanho: %.2f KB\nTamanho: %.2f MB\n" +
                        "Tamanho: %.2f GB\nTempo gasto de execucao: %.2f milisegundos\n\n"
                ,tamanhoTotalParalelismo,tamanhoTotalParalelismo/1024,(tamanhoTotalParalelismo/1024)/1024,((tamanhoTotalParalelismo/1024)/1024)/1024,tempoFinalParalelismo);

    }

}
