# Components


# Componente `Zumbi Twitteiro`

Campo | Valor
----- | -----
Classe | `<caminho completo da classe com pacotes>` <br> Exemplo: `pt.c08componentes.s20catalog.s10ds.DataSetComponent`
Autores | `<nome dos membros que criaram o componente>`
Objetivo | `<objetivo do componente>`
Interface | `<interface em Java do componente>`
~~~
public interface ITableProducer {
  String[] requestAttributes();
  String[][] requestInstances();
}
public interface IDataSource {
  public String getDataSource();
  public void setDataSource(String dataSource);
}
public interface IDataSet extends ITableProducer, IDataSource {
}
~~~


# Componente `Atestado`

Campo | Valor
----- | -----
Classe | `src.js.maior.java.Atestado` <br>
Autores | ``
Objetivo | `Gerar um atestado com a recomendações de tratamento para um doença. O atestado irá conter o nome do doutor também.`
Interface | `IAtestado`
~~~
public interface ITableProducer {
  String[] requestAttributes();
  String[][] requestInstances();
}
public interface IDataSource {
  public String getDataSource();
  public void setDataSource(String dataSource);
}
public interface IDataSet extends ITableProducer, IDataSource {
}
~~~


## Detalhamento das Interfaces

### Interface `IAtestado`
`Interfaçe prove a implementação de leitura de um DataSet que contenha os tratamentos e gere um atestado.`.

Método | Objetivo
-------| --------
`Atestado(ITratamentos tratamentos)` | `Recebe um conjunto `

### Interface `Zumbi Twitteiro`
`<papel da interface>`.

Método | Objetivo
-------| --------
`<id do método em Java>` | `<objetivo do método e descrição dos parâmetros>`




OBS:
Itratamentos deve ter a relação entre doença e tratamento;
Ela deve ser preenchida qundo lermos os dados com as doenças, de forma aleatoria