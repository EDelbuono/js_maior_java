import jsmaiorjava.implementations.*;
import jsmaiorjava.interfaces.*;

public class Main {
    public static void main(String[] args) {

        /* Teste da impressão do PDF */
       
     
       /*  IImprimeAtestado atestado = new ImprimeAtestado();
        IProntuario prontuario = new Prontuario("João", "Victor Coelho", "dor de cabeça");
        atestado.imprime(prontuario);  */


        /* Teste do Twitter */

        //  IZumbiTwittero zt = new ZumbiTwittero(new Prontuario());

        /* Teste da janela */

        /*
        IWindow win = WindowFactory.createWindow();
        win.open();
        */

        /* Teste de logica do programa */
        try {
            String doenca = "asma";
            ITratamento tratamento = new Tratamento(doenca);
            String paciente = "Blau";
            String doutor = "Xa";
            IProntuario prontuario = new Prontuario(tratamento, paciente, doutor);
            ZumbiTwittero zt = new ZumbiTwittero(prontuario,
                    "CHU CHU, LÁ VEM O TREM DAS DOENÇAS:\n" +
                            "@doutor examinando @paciente, que aparentemente tem @doenca.\n" +
                            "O tratamento consiste em: @tratamento.");

            boolean sucesso = zt.twittar();

            if (sucesso)
                System.out.println("Deu bom");

            else
                System.out.println("Deu ruim");

            /*IImprimeAtestado atestado = new ImprimeAtestado();
            atestado.imprime(prontuario);*/
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
