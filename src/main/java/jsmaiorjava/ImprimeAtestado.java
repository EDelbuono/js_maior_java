package jsmaiorjava;
import java.util.ArrayList;

public class ImprimeAtestado implements IImprimeAtestado {
    public ImprimeAtestado() {
    }

    public void imprime(IProntuario prontuario) {
        System.out.println("Nome do doutor: " + prontuario.doutor() + " Nome do Paciente: " + prontuario.paciente() + "\n" + "Tratamento: " + prontuario.tratamento());
    }
}