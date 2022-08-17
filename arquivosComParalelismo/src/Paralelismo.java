import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Paralelismo extends RecursiveTask<Long> {
    private File caminho;

    public Paralelismo(File file) {
        this.caminho = file;
    }

    @Override
    protected Long compute() {

        if(caminho.isFile()){
            return caminho.length();
        }
        else{
            File[] pastas = caminho.listFiles();
            if(pastas != null){
                return Paralelismo.invokeAll(geraSubtarefa(pastas)).stream().mapToLong(Paralelismo::join).sum();
            }
        }
        return null;
    }

    private Collection<Paralelismo> geraSubtarefa(File[] arqs) {

        List<Paralelismo> subtarefas = new ArrayList<>();

        for(int i = 0; i < arqs.length; i++){
            subtarefas.add(new Paralelismo(arqs[i]));
        }
        return subtarefas;
    }


}
