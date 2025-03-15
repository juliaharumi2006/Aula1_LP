![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
         flowchart TD
         Start((Início)) --> input[\Digite sua nota\]
         input --> verification{Nota é >= 50?}
         verification --> |Sim| A[/Aprovado/]
         verification --> |Não| B[/Reprovado/]
         A --> finish([Fim])
         B --> finish
    
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite sua nota\]
      input1 --> input2[\Digite sua frequência em porcentagem\]
      input2 --> verification{Sua nota é >= 50 \nE\n frequencia >=75%?}
      verification --> |Sim| output1[/Aprovado/]
      verification --> |Não| output2[/Reprovado/]
      output1 --> finish([Final])
      output2 --> finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      A((Start)) --> B[\Type n1\]
      B --> C[\Type N2\]
      C --> D[Result = N1 + N2]
      D --> E[/Result/]
      E --> F([End])
      
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      A((Inicio)) --> B[\Escreva um número\]
      B --> C{O numero é >=0?}
      C --> |Sim| D[/Positivo/]
      C --> |Não| E[/Negativo/]
      E --> F([Fim])
      D --> F
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
    A((Início)) --> B[\Digite sua idade\]
    B --> C{Idade >=16}
    C --> |Sim| D[\Já possui titulo de eleitor?\]
    D --> |Sim| E[/Você pode votar/]
    C --> |Não| F[/Você não pode votar/]
    F --> G([Fim])
    E --> G

   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
    A((Inicio)) --> B[\Digite dois números distintos: N1 e N2\]
    B --> C{N1 > N2?}
    C --> |Sim| D[/N1 é o maior entre eles!/]
    C --> |Não| E[/N2 é o maior entre eles!/]
    D --> F([Fim])
    E --> F
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
    A((Inicio)) --> B[\Digite N1\]
    B --> C[\Digite N2\]
    C --> D[\Digite N3\]
    D --> E{N1>N2}
        E --> |Sim| F{N1>N3}
            F --> |Sim| G[/N1 é o maior/]
            F --> |Não| H{N3==N1\nOR\nN3==N2}
                H --> |Sim| I[/Você digitou alguns\n números iguais/]
                H --> |Não| J[/N3 é o maior/]
        E --> |Não| K{N2>N3}
            K --> |Sim| L[/N2 é o maior/]
            K --> |Não| H
   
    G --> M([fim])
    I --> M
    J --> M
    L --> M
    

   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
    A((Início)) --> B[\Digite um número\]
    B --> C[r=1]
    C --> D{n>1?}
        D --> |Sim| E[r = r*n]
            E --> F[n = n-1]
            F --> D
        D --> |Não| G[/Resposta = r/]
        G --> H([Fimgit c])

   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.

   ```mermaid
   flowchart TD
    A((Inicio)) --> B[\Digite um número N e descubra se ele é par\]
    B --> C{N % 2 == 0?}
    C --> |Sim| D[/Seu número é par/]
    C --> |Não| E[/Seu número não é par/]
    D --> F([Fim])
    E --> F
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      A((Início)) --> B[\Digite um número N e descubra se ele é primo\]
      B --> C{N>1 E N//1 E N//N}
      C --> |Sim| D{N//N+1}
        D --> |Sim| E[/Seu número não é primo/]
        D --> |Não| F[/Seu número é primo/]
      C --> |Não| G[/Seu número não é primo/]
      E --> H([Fim])
      F --> H
      G --> H
   ```