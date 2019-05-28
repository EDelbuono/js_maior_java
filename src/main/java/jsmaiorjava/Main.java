package jsmaiorjava;

public class Main {
    public static void main(String[] args) {
        IDataSet dataset = new DataSetComponent();
        dataset.setDataSource("src/main/java/jsmaiorjava/zombie-health-spreadsheet-ml-training.csv");

        IImprimeAtestado atestado = new ImprimeAtestado(dataset);
        atestado.imprime("Victor", "Sandro", "bacterial_infection");
    }


}