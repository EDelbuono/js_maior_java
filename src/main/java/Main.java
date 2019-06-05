<<<<<<< HEAD
import jsmaiorjava.interfaces.IImprimeAtestado;
=======
import jsmaiorjava.interfaces.*;
import jsmaiorjava.implementations.*;
>>>>>>> 382221c5b6a01cba1b6c3f30d3552f4a4f882a52
import jsmaiorjava.interfaces.IProntuario;
import jsmaiorjava.interfaces.ITratamento;
import jsmaiorjava.interfaces.IZumbiTwittero;
import jsmaiorjava.implementations.ImprimeAtestado;
import jsmaiorjava.implementations.Prontuario;
import jsmaiorjava.implementations.Tratamento;
import jsmaiorjava.implementations.ZumbiTwittero;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class Main {
    public static void main(String[] args) {
        IImprimeAtestado atestado = new ImprimeAtestado();
        IProntuario prontuario = new Prontuario("João", "Victor Coelho", "dor de cabeça");
        atestado.imprime(prontuario);
           
       
        
        // IZumbiTwittero zt = new ZumbiTwittero(new Prontuario());
        Window win = new Window();
        win.open();

<<<<<<< HEAD
       /*  try {
=======
        /*try {
>>>>>>> 382221c5b6a01cba1b6c3f30d3552f4a4f882a52
            String doenca = "esclerose múltipla";
            ITratamento tratamento = new Tratamento(doenca);
            String paciente = "Enricao DelBom";
            String doutor = "Franderico Rapé";
            IProntuario prontuario = new Prontuario(tratamento, paciente, doutor);
            ZumbiTwittero zt = new ZumbiTwittero(prontuario);
            boolean sucesso = zt.twittar();

            if (sucesso)
                System.out.println("Deu bom");

            else
                System.out.println("Deu ruim");
        }
        catch (Exception e){
            System.out.println(e);
<<<<<<< HEAD
        } */

=======
        }
*/
>>>>>>> 382221c5b6a01cba1b6c3f30d3552f4a4f882a52
    }
}
