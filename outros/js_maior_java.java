/*
Victor Coelho     148128
Tiago Dall'Oca    206341
Gabriel Ferreira  167908
Frederico Rappa   216047
Enrico Delbuono   196439
André Gouvea      213037   
*/

interface IDiagnostico {
  public String doutor();
  public String paciente();
  public String doenca();
  public String descricaoDoenca();
  public String tratamento();
}

interface ITratamento {
  /*
  Gera diagnostico 
  */
  public IDiagnostico gerarDiagnostico(String doutor, 
                                       String paciente, 
                                       String doenca, 
                                       String descricaoDoenca);
}

interface IImprimeAtestado {
  /*
  Gera uma imagem de um atestado o diagnostico da doenca e a rubrica do doutor
  */
  public boolean imprime(IDiagnostico diagnostico);
}

interface IZumbiTwittero {
  /*
  Twitta as informações do diagnóstico (nomes do paciente, doutor e doença) e fatos interessantes ou memes
  */
  public boolean twittar(IDiagnostico diagnostico);
}

/*
class Main {
  public static void main(String[] args) {
    IDiagnostico diagnostico = (new Tratamento())
                               .gerarTratamento("Dr. Freitas Vou Comer Seu Cérebro",
                                                "José Morto",
                                                "trembling_fingers",
                                                "Treme mais que a peste");
    (new ZumbiTwittero(diagnostico)).twittar();
    (new ImprimeAtestado(diagnostico)).imprime();
  }
}
*/



interface IInterpreta{
  public String interpretacao(String pergunta);
  /*Recebe como parametro uma string contendo uma pergunta e retorna uma string 
  que indica o sintoma questionado.*/
}

interface IMelhorPergunta{
  public String melhor_pergunta(String table[][]);
  /* Analisa a tabela dada como parâmetro e retorna uma string cuja pergunta se refere ao sintoma mais decisivo na identificaçãoo da doença. */
}

interface ISintomas_base{
  public String[] base(String table[][]);
  /* A partir da tabela fornecida, retorna um vetor se strings contendo os sintomas que mais facilmente permitirão a identificação da doença */
}