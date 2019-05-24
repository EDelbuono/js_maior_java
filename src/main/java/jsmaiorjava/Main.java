package jsmaiorjava;

public class Main {
    public static void main(String[] args) {
        IDataSet dataset = new DataSetComponent();
        dataset.setDataSource("src/main/java/jsmaiorjava/zombie-health-spreadsheet-ml-training.csv");
        ITratamento tratamento = new Tratamento(dataset);
    }
}