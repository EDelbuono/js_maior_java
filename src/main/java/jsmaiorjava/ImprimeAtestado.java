package jsmaiorjava;
import jsmaiorjava.interfaces.IImprimeAtestado;
import jsmaiorjava.interfaces.IProntuario;

public class ImprimeAtestado implements IImprimeAtestado {
    public ImprimeAtestado() {
    }

    public void imprime(IProntuario prontuario) {
        System.out.println("Nome do doutor: " + prontuario.doutor() + " Nome do Paciente: " + prontuario.paciente() + "\n" + "Tratamento: " + prontuario.tratamento());
    }
}