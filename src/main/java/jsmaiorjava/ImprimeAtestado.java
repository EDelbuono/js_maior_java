package jsmaiorjava;
import java.util.ArrayList;

public class ImprimeAtestado implements IImprimeAtestado {
    ITratamento tratamento;
    public ImprimeAtestado(IDataSet dataset) {
        this.tratamento = new Tratamento(dataset);
    }

    public void imprime(String doutor, String paciente, String doenca) {
        String trt;
        int trt_index = this.tratamento.getTratamento().indexOf(doenca);

        if(trt_index != -1) {
            trt = this.tratamento.getTratamento().get(trt_index + 1);
        } else {
            trt = "não existe tratamento";
        }

        System.out.println("Nome do doutor: " + doutor + " Nome do Paciente: " + paciente + "\n" + "Tratamento: " + trt);
    }


}