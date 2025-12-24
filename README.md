#  Sistema de Reservas Aéreas (Aplicação de Console em Java)

##  Descrição do Projeto

Este projeto é uma aplicação simples desenvolvida em **Java Standard Edition (SE)**, projetada para ser executada em um ambiente de console (terminal). O objetivo principal é demonstrar a aplicação de conceitos básicos de programação orientada a objetos (POO), estruturas de dados (`ArrayList`) e manipulação de entrada/saída de dados (`Scanner`) para gerenciar um sistema rudimentar de reservas de passagens aéreas.

O sistema opera em memória, o que significa que todos os dados (voos e reservas) são perdidos ao encerrar a aplicação.

##  Funcionalidades

O programa oferece um menu interativo com as seguintes opções:

| Opção | Funcionalidade | Conceitos Aplicados |
| :--- | :--- | :--- |
| **1** | **Cadastrar novo voo** | Criação de objetos, manipulação de `Scanner`. |
| **2** | **Reservar assento** | Interação com o usuário, lógica de reserva, manipulação de objetos. |
| **3** | **Consultar voo** | Busca em `ArrayList`, exibição de dados. |
| **4** | **Sair** | Encerramento do loop principal. |

##  Tecnologias Utilizadas

| Categoria | Tecnologia | Descrição |
| :--- | :--- | :--- |
| **Linguagem** | **Java SE** | Linguagem principal de desenvolvimento. |
| **Entrada de Dados** | `java.util.Scanner` | Utilizado para ler a entrada do usuário no console. |
| **Estrutura de Dados** | `java.util.ArrayList` | Utilizado para armazenar dinamicamente os objetos de Voos e Reservas. |
| **Ambiente** | **Console/Terminal** | Interface de interação do usuário. |

##  Como Rodar o Projeto

Como se trata de uma aplicação Java de console, a execução é simples e pode ser feita via linha de comando ou através de uma IDE (como VS Code, Eclipse ou IntelliJ).

### Pré-requisitos

Certifique-se de ter o **Java Development Kit (JDK)** instalado em sua máquina (versão 8 ou superior).

### Opção 1: Execução via Linha de Comando

1.  **Compilar o código:**
    Assumindo que o arquivo principal se chama `Main.java` e está na raiz do projeto, use o compilador Java:
    ```bash
    javac Main.java Voo.java Passageiro.java # Inclua todos os arquivos .java
    ```

2.  **Executar a aplicação:**
    ```bash
    java Main
    ```

### Opção 2: Execução via IDE

1.  Abra o projeto na sua IDE de preferência (Eclipse, IntelliJ, VS Code com extensão Java).
2.  Localize a classe principal (`Main.java`) que contém o método `public static void main(String[] args)`.
3.  Clique no botão de **"Run"** (Executar) da sua IDE.

##  Estrutura do Projeto

A estrutura de arquivos é baseada em classes Java separadas para cada entidade do sistema:

```
seu-repositorio/
├── Main.java                 # Classe principal com o método main() e o menu de interação.
├── Voo.java                  # Classe para representar um Voo (atributos: número, origem, destino, dataHora, totalAssentos).
├── Passageiro.java           # Classe para representar um Passageiro (atributos: nome, documento, telefone, etc.).
└── README.md                 # Este arquivo.
```

##  Contribuição

Este projeto é um exercício acadêmico e não está aberto a contribuições externas. No entanto, sinta-se à vontade para fazer um *fork* e adaptá-lo para seus próprios estudos.

##  Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

---

**Desenvolvido por:** João Pedro `@Jao2k25`
