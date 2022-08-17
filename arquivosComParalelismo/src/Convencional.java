import java.io.File;
public class Convencional {
    public static double calculaTamanhoConvencional(File caminho) {
        double tamanho = 0;

        if (caminho.isFile()) {
            tamanho = caminho.length();
        } else {

            File[] pastas = caminho.listFiles();
            if (pastas != null) {
                for (File arq : pastas) {
                    tamanho += Convencional.calculaTamanhoConvencional(arq);
                }
            }
        }
        return tamanho;
    }
}
