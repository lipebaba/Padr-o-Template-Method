# Padrão Template Method

Projeto desenvolvido para demonstrar a utilização do padrão de projeto **Template Method** em Java.

## 📌 Sobre o projeto

O projeto simula a geração de **relatórios ambientais**. Cada relatório segue a mesma sequência: cabeçalho, apresentação dos dados e rodapé.

- **Relatório de água:** apresenta o consumo em litros.
- **Relatório de resíduos:** apresenta a quantidade reciclada em quilogramas.

Os valores são fictícios e as regras são simplificadas para fins didáticos.

## 🧩 Padrão Template Method

O **Template Method** é um padrão comportamental que define a estrutura de um algoritmo em uma classe base, permitindo que subclasses implementem etapas específicas.

Neste projeto, a classe abstrata `RelatorioAmbiental` define o método `gerar()`, responsável por executar as etapas na ordem estabelecida. Esse método é declarado como `final`, mantendo a sequência para todos os relatórios.

As classes `RelatorioAgua` e `RelatorioResiduos` implementam o método `apresentarDados()` de acordo com o tipo de relatório:

```java
RelatorioAmbiental agua = new RelatorioAgua(1200);
RelatorioAmbiental residuos = new RelatorioResiduos(85);

System.out.println(agua.gerar());
System.out.println(residuos.gerar());
```

## 📁 Estrutura do projeto

```
TemplateMethod_Relatorios/
├── src/
│   ├── main/java/
│   │   ├── Aplicacao.java
│   │   ├── RelatorioAmbiental.java
│   │   ├── RelatorioAgua.java
│   │   └── RelatorioResiduos.java
│   └── test/java/
│       └── RelatorioAmbientalTest.java
├── diagrama-classes.png
├── pom.xml
└── README.md
```

## ⚙️ Funcionamento

A classe `Aplicacao` cria os dois tipos de relatório e chama o método `gerar()` em cada um.

| Relatório | Dado de exemplo | Unidade |
| --- | --- | --- |
| Água | Consumo: 1200 | litros |
| Resíduos | Quantidade reciclada: 85 | kg |

### Validação dos dados

Os valores de consumo e de resíduos devem ser **iguais ou superiores a zero**. Caso um valor negativo seja informado ao criar um relatório, o construtor lança uma `IllegalArgumentException`.

## ▶️ Executando a aplicação

Com o **JDK 11 ou superior** e o **Maven** instalados, execute na pasta que contém o `pom.xml`:

```bash
mvn compile
java -cp target/classes Aplicacao
```

A saída esperada é:

```text
RELATORIO AMBIENTAL
Consumo de agua: 1200 litros
Fim do relatorio

RELATORIO AMBIENTAL
Residuos reciclados: 85 kg
Fim do relatorio
```

## 🏗️ Estrutura do Template Method

| Elemento do padrão | Implementação |
| --- | --- |
| Classe abstrata | `RelatorioAmbiental` |
| Método template — define a sequência | `gerar()` |
| Etapa variável — definida na classe base | `apresentarDados()` |
| Classes concretas — implementam a etapa variável | `RelatorioAgua` e `RelatorioResiduos` |
| Cliente — demonstração | `Aplicacao` |

## 🧪 Testes

O projeto utiliza **JUnit 5**. A classe `RelatorioAmbientalTest` verifica o conteúdo e a ordem dos dois relatórios, a aceitação de valores zero e a rejeição de valores negativos.

Para executar os testes:

```bash
mvn test
```

O Maven pode precisar de acesso à internet para baixar as dependências na primeira execução.

## 📊 Diagrama de classes

O arquivo [diagrama-classes.png](diagrama-classes.png) apresenta a classe abstrata, suas subclasses e as relações de herança.

## 🛠️ Tecnologias utilizadas

- Java 11
- Maven
- JUnit 5.10.2
- Padrão de Projeto Template Method

## 🎯 Objetivo

Demonstrar como definir uma sequência comum de etapas e permitir que subclasses forneçam o comportamento específico de uma delas.

## 👨‍💻 Autor

**Felipe Baba**

Projeto desenvolvido para fins acadêmicos, como aplicação prática do padrão de projeto Template Method.
