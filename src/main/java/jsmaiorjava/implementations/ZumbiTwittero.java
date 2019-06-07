package jsmaiorjava.implementations;

import jsmaiorjava.interfaces.IProntuario;
import jsmaiorjava.interfaces.IZumbiTwittero;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class ZumbiTwittero implements IZumbiTwittero {

    protected IProntuario prontuario;
    protected String formato;

    public ZumbiTwittero(IProntuario prontuario){
        this(prontuario, "AE MEUS BONS, MAIS DOENÇAS DIAGNOSTICADAS:\n" +
                        "@doutor " +
                        "examinando @paciente.\n" +
                        "O tratamento consiste em: @tratamento\n" +
                        "Vamos erradicar tudo que seja @doenca.");
    }

    protected String construirStatus(){
        return formato
                .replace("@doutor", prontuario.getDoutor())
                .replace("@paciente", prontuario.getPaciente())
                .replace("@tratamento", prontuario.getTratamento())
                .replace("@doenca", prontuario.getDoenca());
    }

    public ZumbiTwittero(IProntuario prontuario, String formato){
        this.prontuario = prontuario;
        this.formato = formato;
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
