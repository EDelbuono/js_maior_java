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
        return "AE MEUS BONS, MAIS DOENSÇAS DIAGNOSTICASDAS:" +
                prontuario.doutor() + " " +
                "examinando " + prontuario.paciente() + ". " +
                "O tratamento consiste em: " + prontuario.tratamento() + "\n" +
                "Vamos erradiar tudo que seja " + prontuario.doenca() + ".";

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
