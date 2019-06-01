package jsmaiorjava;

import jsmaiorjava.interfaces.IProntuario;
import java.util.Random;




public class Prontuario implements IProntuario{
  static final String MAI = "AÁBCDEFGHIÍJKLMNOÔPQRSTUVWXYZ";
  static final String MIN = "aábcdeêfghiíjklmnoõpqrstuvwxyz";
  
  private String doutor="";
  private String paciente="";
  private String doenca="";
  private Random aleatorio = new Random();
  
  /* São criados dois construtores para as situações em que 
  -não são fornecidos, no construtor, nomes do médico ou do paciente, mas é fornecida a doença; ou
  -são fornecidas strings para ambos e a doença.
  Caso um desses não tenha nome, deve ser colocado "" como parâmetro e será gerado um nome aleatório.
  */

  public Prontuario(String paciente, String doutor, String doenca){
    this.doutor=doutor;
    this.paciente=paciente;
    this.doenca=doenca;
  }

  public Prontuario( String doenca){
    this.doenca=doenca;
  }



  public String doutor(){
    if (doutor!=""){
      return doutor;
    }

    /* Cria um nome aleatório para o doutor */
    boolean homem=aleatorio.nextBoolean();
    int n=aleatorio.nextInt(11)+3, sn=aleatorio.nextInt(7)+2;
    StringBuilder doutorSB = new StringBuilder(n); 

    doutorSB.append(MAI.charAt(aleatorio.nextInt(MAI.length())));
    for (int i = 2; i < n; i++) {
      doutorSB.append(MIN.charAt(aleatorio.nextInt(MIN.length())));
    }
    doutorSB.append(" ");
    doutorSB.append(MAI.charAt(aleatorio.nextInt(MAI.length())));
    for (int i = 1; i < sn; i++) {
      doutorSB.append(MIN.charAt(aleatorio.nextInt(MIN.length())));
    }    

    if (homem){
      doutor="Doutor "+doutorSB.toString();
    }

    else{
      doutor="Doutora "+doutorSB.toString();
    }

    return doutor;  
  }

  public String doutor(String nome){
    //Caso o parâmetro seja uma string vazia, gera um nome para o médico.
    if (nome==""){
      return doutor();
    }
    //Caso o médico já tenha um nome armazenado, é retornado ele.
    if (doutor!=""){
      return doutor;
    }

    boolean homem=aleatorio.nextBoolean();   
    if (homem){
      doutor="Doutor "+nome;
    }

    else{
      doutor="Doutora "+nome;
    }
    return doutor;
  }

  public String paciente(){
    if (paciente!=""){
      return paciente;
    }

    /* Cria um nome aleatório para o paciente*/
    int n=aleatorio.nextInt(11)+3, sn=aleatorio.nextInt(7)+2;
    StringBuilder paciSB = new StringBuilder(n); 

    paciSB.append(MAI.charAt(aleatorio.nextInt(MAI.length())));
    for (int i = 2; i < n; i++) {
      paciSB.append(MIN.charAt(aleatorio.nextInt(MIN.length())));
    }
    paciSB.append(" ");
    paciSB.append(MAI.charAt(aleatorio.nextInt(MAI.length())));
    for (int i = 1; i < sn; i++) {
      paciSB.append(MIN.charAt(aleatorio.nextInt(MIN.length())));
    }    

    paciente=paciSB.toString();
    return paciente;      
  }

  public String paciente(String nome){
    /*Caso o parâmetro seja uma string vazia, gera um nome para o paciente.*/
    if (nome==""){
      return paciente();
    }
    /*Caso o paciente já tenha um nome armazenado, é retornado ele.*/
    paciente=nome;
    return paciente;
  }


  public String doenca(){
    return doenca;
  }
 
}


