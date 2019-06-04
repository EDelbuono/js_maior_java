package jsmaiorjava.implementations;
import jsmaiorjava.interfaces.IImprimeAtestado;
import jsmaiorjava.interfaces.IProntuario;

public class ImprimeAtestado implements IImprimeAtestado {
    public ImprimeAtestado() {
    }

    public void imprime(IProntuario prontuario) {
        System.out.println("Nome do doutor: " + prontuario.getDoutor() + " Nome do Paciente: " + prontuario.getPaciente() + "\n" + "Tratamento: " + prontuario.getTratamento());
    }
}