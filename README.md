# Components




# Modelo para Documentação de um Componente

A documentação será feita em Markdown, vide detalhes sobre ele em: https://guides.github.com/features/mastering-markdown/

E mais especificamente sobre tabelas em: https://help.github.com/en/articles/organizing-information-with-tables

Segue abaixo o modelo de como deve ser documentado um componente. Tudo o que for indicado entre `<...>` indica algo que deve ser substituído pelo indicado.

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


## Detalhamento das Interfaces

### Interface `Atestado`
`<papel da interface>`.

Método | Objetivo
-------| --------
`<id do método em Java>` | `<objetivo do método e descrição dos parâmetros>`

### Interface `Zumbi Twitteiro`
`<papel da interface>`.

Método | Objetivo
-------| --------
`<id do método em Java>` | `<objetivo do método e descrição dos parâmetros>`