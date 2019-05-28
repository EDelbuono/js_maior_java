
# Projeto 

 Receber e analisar uma tabela com informaçõe de sintomas e doenças. A partir disso o usuário podera escolher entre imprimir um atestado ou twittar a doença. O programa de ve rodar ate que seja fechado para guardar estatisticas de doenças e suas recorrência.
 O diagnostico será gerado a partir dos sintomas que o usuário ou irá marcar em checkbox ou irá responder a uma pergunta e usaremos processamento de linguagem natural para decidir se é positivo ou negativo a resposta.

 Vamos usar as seguintes bibliotecas e componentes:
  - PDF creator;
  - Twitter API;
  - Arvore balançeada (Component externo ou o nosso);
  - Analise de estaticas;
  - Inteface gráfica  

  O que devemos implementar:

  - A analise e gerar o diagnostico usando a arvore balanceada;
  - Integrar a bibliotecas.
  - Usar a interface grafica;

# Components

# Componente `Zumbi Twitteiro`
`Interface cujo objetivo é publicar, em um tweet, o diagnóstico do paciente, contendo as informações da interface IDiagnostico mencionada`.

Campo | Valor
----- | -----
Classe | `jsmaiorjava.ZumbiTwittero`
Autores | `Tiago Dall'Oca e Frederico Rappa`
Objetivo | `Twitta as informações do diagnóstico (nomes do paciente, doutor e doença) e fatos interessantes ou memes`
Interface | `IZumbiTwittero`
~~~java
interface IZumbiTwittero {
  public boolean twittar(IDiagnostico diagnostico); // retorna true ou false dependendo do sucesso
}

~~~


# Componente `Atestado`

Campo | Valor
----- | -----
Classe | `jsmaiorjava.Atestado`
Autores | ``
Objetivo | `Gerar um atestado com a recomendações de tratamento para um doença. O atestado irá conter o nome do doutor também.`
Interface | `IAtestado`
~~~java
interface IImprimeAtestado {
  /*
  Gera uma imagem de um atestado o diagnostico da doenca e a rubrica do doutor
  */
  public boolean imprime(IDiagnostico diagnostico);
}
~~~


## Detalhamento das Interfaces

### Interface `IAtestado`

Esta interface implementa a impressão do atestado do paciente.

Método | Objetivo
-------| --------
`imprimirAtestado(IDiagnostico diagnostico)` | `Imprime um atestado`

### Interface `ITratamento`
`Implementa a forma como os tratamentos são conectados às doenças específicas de cada iteração.
 O método addTratamento conecta cada uma das doenças da tabela a um tratamento aleatório, porém
único para essa iteração do programa.`.

Método | Objetivo
-------| --------
`void addTratamento(String doenca, String Tratamento)` | `Adiciona um novo tratamento a lista`
`String getTratamento(String doenca)` | `Retorna o tratamento`

### Interface `IDiagnostico`
`Interface que junta as informações de um dado caso`.

Método | Objetivo
-------| --------
`public String doutor()` | `Retorna o nome do doutor`
`public String paciente()` | `Retorna o nome do paciente`
`public String doenca()` | `Retorna o nome da doença`
`public String descricaoDoenca()` | `Retorna a descrição da doença`
`public String tratamento()` | `Retorna o tratamento para a doença`

OBS:
ITratamentos deve ter a relação entre doença e tratamento;
Ela deve ser preenchida quando lermos os dados com as doenças, de forma aleatoria
