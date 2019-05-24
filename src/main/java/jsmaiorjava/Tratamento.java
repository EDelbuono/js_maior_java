package jsmaiorjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tratamento implements ITratamento {
    private ArrayList<String> lista = new ArrayList<String>();

    // Recebe a tabela como entrada; conecta cada uma das doenças com um tratamento específico.
    public Tratamento(IDataSet dataset) {
        String inst[][] = dataset.requestInstances();
        ArrayList<String> tratamentos = new ArrayList<String>(Arrays.asList("t1","t2","t3","t4","t5","t6","t7","t8","t9","t10","t11","t12","t13"));
        ArrayList<String> diseases = new ArrayList<String>();
        Random rand = new Random();
        int n, count = 0, index = 0;

        // Guarda as doenças (sem repetições) em um ArrayList.
        for(int i = 0; i < inst.length - 1; i++) {
            if(!(diseases.contains(inst[i][inst[0].length - 1])))
            diseases.add(inst[i][inst[0].length - 1]);
        }

        // Conecta uma doença a um tratamento específico.
        while(count < diseases.size()) {
            n = rand.nextInt(tratamentos.size());
            //Apenas faz a conexão entre doença e tratamento caso o tratamento gerado aleatoriamente ainda não foi utilizado.
            if(!(this.lista.contains(tratamentos.get(n)))) {
                this.lista.add(diseases.get(index++));
                this.lista.add(tratamentos.get(n));
                count++;
            }
        }
        
        /* for(int i = 0; i < this.lista.size(); i++) {
            System.out.println(this.lista.get(i));
        } */
    }
}