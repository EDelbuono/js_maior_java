package jsmaiorjava.implementations;

import jsmaiorjava.interfaces.ITratamento;

public class Tratamento implements ITratamento {
    private static String[] ts = new String[]{
            "comer orelha de cachorro",
            "ingerir espinhos de cacto",
            "fazer amigos",
            "comer cérebro de aranha",
            "fazer o quadradinho de oito",
            "dar um bom dia fake",
            "correr atrás de olavistas",
            "comer no bandejão",
            "fazer agachamentos com peso",
            "sentar numa cadeira",
            "cheirar cola",
            "consumir durante 14 dias, a cada 6 horas, 2 cápsulas de brainpill. Repousar durante o dia.",
            "fumar o conceito de espaço-tempo",
            "tomar novalgina",
            "beijar uma orelha",
            "assistir a uma aula do Bassi",
            "apreciar a beleza do IFGW",
            "tomar corotin",
            "não comer no bandeijaõ",
            "espirrar cinco vezes",
            "não espirrar cinco vezes"
    };
    private String doenca;
    private int tratamentoIndex;

    public Tratamento(String doenca) {
        this.doenca = doenca;
        tratamentoIndex = Math.abs(doenca.hashCode()) % ts.length;
    }

    public String getDoenca() {
        return doenca;
    }

    public String getTratamento() {
        return ts[tratamentoIndex];
    }
}
