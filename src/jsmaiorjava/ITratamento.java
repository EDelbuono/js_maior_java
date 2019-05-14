package jsmaiorjava;

public interface ITratamento {
    /*
    Gera diagnostico
    */
    IDiagnostico gerarDiagnostico(String doutor,
                                  String paciente,
                                  String doenca,
                                  String descricaoDoenca);
}