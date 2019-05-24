package jsmaiorjava;

public class ImprimeAtestado {
    ITratamento tratamento;
    public ImprimeAtestado(IDataSet dataset) {
        this.tratamento = new Tratamento(dataset);
    }


}