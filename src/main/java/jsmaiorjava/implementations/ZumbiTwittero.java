package jsmaiorjava.implementations;

import jsmaiorjava.IDiagnostico;
import jsmaiorjava.IZumbiTwittero;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class ZumbiTwittero implements IZumbiTwittero {

    protected IDiagnostico diagnostico;

    public ZumbiTwittero(IDiagnostico diagnostico){
        this.diagnostico = diagnostico;
    }

    protected String construirStatus(){
        return "AE MEUS BONS, MAIS DOENSÇAS DIAGNOSTICASDAS:" +
                diagnostico.doutor() " " +
                "examinando " + diagnostico.paciente() ". " +
                "O tratamento consiste em: " + diagnostico.tratamento() + "\n" +
                "Vamos erradiar tudo que seja " + diagnostico.doenca() "."

    }

    public boolean twittar() {
        try {
            Twitter twitter = TwitterFactory.getSingleton();
            Status status = twitter.updateStatus(construirStatus());
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
