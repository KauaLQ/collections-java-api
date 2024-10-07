<img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=E76F00&height=120&section=header"/>

# collections-java-api <img width='50' heigth='50' src="https://static-00.iconduck.com/assets.00/java-icon-1511x2048-6ikx8301.png" />
#### Olá, _Javeiros_! Que tal falarmos sobre Collection?
#### Uma Collection (coleção) é uma estrutura de dados que agrupa vários elementos em uma única unidade, permitindo que eles sejam manipulados de forma eficiente. Esses elementos precisam ser objetos e, em geral, trabalhamos com coleções homogêneas, ou seja, com elementos de um tipo específico. No entanto, coleções heterogêneas também são possíveis, dependendo da necessidade da aplicação.

#### O núcleo das coleções em Java é formado por um conjunto de interfaces que definem a estrutura e o comportamento de diferentes tipos de coleções, facilitando a manipulação dos dados sem precisar conhecer os detalhes de implementação. Todas essas interfaces e classes estão no pacote `java.util`.

#### Existem quatro grandes tipos de coleções em Java:

- **List (lista):** Armazena elementos de forma ordenada e permite elementos duplicados. Exemplos incluem `ArrayList`, `LinkedList` e `Vector`.

- **Set (conjunto):** Garante que não haja elementos duplicados e não necessariamente mantém a ordem de inserção. Exemplos incluem `HashSet`, `LinkedHashSet` e `TreeSet`.

- **Queue (fila):** Armazena elementos em uma ordem específica, geralmente usada para processamento sequencial. Exemplos incluem `LinkedList` e `PriorityQueue`.

- **Map (mapa):** Armazena pares chave-valor. Embora não seja diretamente uma subinterface de Collection, ela é considerada parte do conjunto de coleções devido à sua utilidade. Exemplos incluem `HashMap`, `TreeMap` e `LinkedHashMap`.

#### A seguir é apresentado um fluxograma representativo da hierarquia de collections em Java.

---
```mermaid
---
title: HIERARQUIA DO FRAMEWORK COLLECTIONS EM JAVA
---
flowchart TB
    id1["Iterable"]
    id2["Collection"]
    id3["List"]
    id4["Queue"]
    id5["Set"]
    id6["ArrayList"]
    id7["LinkedList"]
    id8["Vector"]
    id9["Stack"]
    id10["Priority Queue"]
    id11["Dequeue"]
    id12["ArrayDequeue"]
    id13["HashSet"]
    id14["LinkedHashSet"]
    id15["SortedSet"]
    id16["TreeSet"]
    id17["Map"]
    id18["SortedMap"]
    id19["TreeMap"]
    id20["HashTable"]
    id21["LinkedHashMap"]
    id22["HashMap"]

    id1 --> id2
    id2 --> id3 & id4 & id5
    id3 -.-> id6 & id8 & id7
    id8 --> id9
    id4 -.- id10
    id4 --> id11
    id7 & id11 -.- id12
    id5 -.-> id13 & id14
    id5 --> id15
    id15 -.- id16

    subgraph " "
        direction LR
        id17 --> id18 --> id19
        id17 -.-> id20 & id21 & id22
    end

    style id1 fill:#F29E9E,color:#000000
    style id2 fill:#F29E9E,color:#000000
    style id3 fill:#F29E9E,color:#000000
    style id4 fill:#F29E9E,color:#000000
    style id5 fill:#F29E9E,color:#000000
    style id11 fill:#F29E9E,color:#000000
    style id15 fill:#F29E9E,color:#000000
    style id17 fill:#F29E9E,color:#000000
    style id18 fill:#F29E9E,color:#000000

    style id6 fill:#4E7896,color:#000000
    style id7 fill:#4E7896,color:#000000
    style id8 fill:#4E7896,color:#000000
    style id9 fill:#4E7896,color:#000000
    style id10 fill:#4E7896,color:#000000
    style id12 fill:#4E7896,color:#000000
    style id13 fill:#4E7896,color:#000000
    style id14 fill:#4E7896,color:#000000
    style id16 fill:#4E7896,color:#000000
    style id19 fill:#4E7896,color:#000000
    style id20 fill:#4E7896,color:#000000
    style id21 fill:#4E7896,color:#000000
    style id22 fill:#4E7896,color:#000000
```
> Legenda:
> 
> ![Static Badge](https://img.shields.io/badge/INTERFACE-F29E9E)
> ![Static Badge](https://img.shields.io/badge/CLASS-4E7896)
> ![Static Badge](https://img.shields.io/badge/_____%20IMPLEMENTS-fff)
> ![Static Badge](https://img.shields.io/badge/....%20EXTENDS-fff)

---

# Conclusão
#### As Collections em Java são tipo o canivete suíço pra quem lida com dados. Elas deixam tudo mais fácil e prático quando o assunto é organizar, buscar e processar grandes quantidades de informações. Quer armazenar dados de forma rápida? Pode usar um `ArrayList`. Precisa garantir que não tem duplicatas? Um `HashSet` resolve. Quer trabalhar com pares chave-valor? Adiciona um `HashMap` na jogada! Cada implementação tem suas vantagens, e dá pra escolher a que melhor se encaixa na situação, seja pra buscar algo rapidinho, remover elementos ou evitar duplicatas.

---

### _Gostou do meu perfil? Você pode saber mais sobre mim em:_ &nbsp;&nbsp;[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/kaualimaq/)
### _Ou me contatar através do:_ &nbsp;&nbsp;[![Gmail](https://img.shields.io/badge/Gmail-333333?style=for-the-badge&logo=gmail&logoColor=red)](mailto:limakaua610@gmail.com)
### _Referências:_
[1] Repositório base DIO. Disponível em: https://github.com/cami-la/collections-java-api-2023

[2] Static Badge | Shields.io. Disponível em: https://shields.io/badges

[3] Flowcharts Syntax | Mermaid. Disponível em: http://mermaid.js.org/syntax/flowchart.html#comment-curly-brace
