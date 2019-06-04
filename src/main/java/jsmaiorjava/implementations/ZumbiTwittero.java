package jsmaiorjava.implementations;

import jsmaiorjava.interfaces.IProntuario;
import jsmaiorjava.interfaces.IZumbiTwittero;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class ZumbiTwittero implements IZumbiTwittero {

    protected IProntuario prontuario;

    public ZumbiTwittero(IProntuario prontuario){
        this.prontuario = prontuario;
    }

    protected String construirStatus(){
        return "AE MEUS BONS, MAIS DOENÇAS DIAGNOSTICADAS:\n" +
                prontuario.getDoutor() + " " +
                "examinando " + prontuario.getPaciente() + ".\n" +
                "O tratamento consiste em: " + prontuario.getTratamento() + "\n" +
                "Vamos erradicar tudo que seja " + prontuario.getDoenca() + ".";
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
