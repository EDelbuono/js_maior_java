package jsmaiorjava;

public class Main {
    public static void main(String[] args) {
        String inst[][];

        IDataSet dataset = new DataSetComponent();
        dataset.setDataSource("src/main/java/jsmaiorjava/zombie-health-spreadsheet-ml-training.csv");

        inst = dataset.requestInstances();

        for(int i = 0; i < inst.length - 1; i++) {
            System.out.println(inst[i][inst[0].length - 1]);
        }
    }
}