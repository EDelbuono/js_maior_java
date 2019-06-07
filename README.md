
# Components

# Componente `Zumbi Twitteiro`

Campo | Valor
----- | -----
Classe | `jsmaiorjava.implementations.ZumbiTwittero`
Autores | `Tiago Dall'Oca, Frederico Rappa e Gabriel Ferreira`
Objetivo | `Twitta as informações do diagnóstico (nomes do paciente, doutor, doença e seu tratamento)`
Interface | `IZumbiTwittero`
~~~java
interface IZumbiTwittero {
  public boolean twittar(); // retorna true ou false dependendo do sucesso
}

~~~

## Detalhamento da Interface

### Interface `IZumbiTwittero`

Essa interface tem o objetivo de publicar, em um tweet, o diagnóstico do paciente, contendo as informações da interface IProntuario mencionada a seguir, através do perfil "ZumbiDoutor" (@ZumbiDoutor). Sua implementação possui dois construtores, `ZumbiTwittero(IProntuario prontuario)` e `ZumbiTwittero(IProntuario prontuario, String formato)`, em que `formato` é uma String, que representaria um tweet personalizado do usuário, mas que deve conter os termos `@doutor`, `@paciente`, `@tratamento` e `@doenca` (que serão substituídos por uma função de escopo interno à classe pelos termos guardados na variável `prontuario`) e no máximo **280** caracteres. Caso não seja fornecido um formato de tweet, será utilizado o padrão, da forma:
*"AE MEUS BONS, MAIS DOENÇAS DIAGNOSTICADAS: `@doutor` examinando `@paciente`. O tratamento consiste em: `@tratamento`. Vamos erradicar tudo que seja `@doenca`.*"

Método | Objetivo
-------| --------
`twittar()` | `Publica um tweet no perfil ZumbiDoutor, acessável pelo link https://twitter.com/ZumbiDoutor`

# Componente `Atestado`

Campo | Valor
----- | -----
Classe | `jsmaiorjava.implementations.ImprimeAtestado`
Autores | `Victor Coelho, André Gouvêa e Enrico Delbuono`
Objetivo | `Gerar um atestado com as recomendações de tratamento para um doença. O atestado irá conter o nome do doutor, do paciente, de sua doença, assim como a data e hora atuais e uma assinatura do doutor.`
Interface | `IImprimeAtestado`
~~~java
interface IImprimeAtestado {
  public void imprime(IProntuario prontuario);
}
~~~


## Detalhamento das Interfaces

### Interface `IImprimeAtestado`

Esta interface implementa a impressão do atestado do paciente, em formato pdf. Essa interface simula um atestado médico que contém os nomes do médico e paciente, a doença diagnosticada, a data e hora em que foi "feito" o atestado e uma assinatura gerada a partir do nome do médico armazenado no objeto `prontuario`.

Método | Objetivo
-------| --------
`imprime(IProntuario prontuario)` | `Imprime um atestado em formato pdf`

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
