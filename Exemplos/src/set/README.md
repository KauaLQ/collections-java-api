# SET

- A interface `Set` é uma coleção que não pode conter elementos duplicados.
- Essa interface representa o conceito matemático de um conjunto e é usada para representar conjuntos, como um baralho de cartas.
- A plataforma Java possui três implementações de `Set` de uso geral: `HashSet`, `TreeSet` e `LinkedHashSet`.
- A interface `Set` não permite acesso aleatório a um elemento na coleção.
- Para percorrer os elementos de um `Set`, você pode usar um iterador ou um loop foreach.

> ##### *HashSet*: O HashSet é uma implementação da interface Set que armazena os elementos em uma tabela hash. Ele não mantém uma ordem específica dos elementos. A principal vantagem do HashSet é que ele oferece um desempenho de busca muito eficiente, pois usa funções hash para indexar os elementos. No entanto, a ordem em que os elementos são adicionados pode não ser preservada ao percorrer o conjunto.

> ##### *TreeSet*: O TreeSet é uma implementação da interface Set que armazena os elementos em uma árvore binária balanceada. Isso significa que os elementos são armazenados em uma ordem classificada e são mantidos automaticamente em ordem crescente. A principal vantagem do TreeSet é que os elementos são sempre retornados na ordem classificada, o que facilita a obtenção de elementos em uma determinada ordem. No entanto, a busca e a inserção são um pouco mais lentas em comparação com o HashSet.

> ##### *LinkedHashSet*: O LinkedHashSet é uma implementação da interface Set que mantém a ordem de inserção dos elementos, além de usar uma tabela hash para obter um bom desempenho de busca. Ele é semelhante ao HashSet, mas também mantém uma lista duplamente vinculada que preserva a ordem de inserção. Isso permite que os elementos sejam percorridos na ordem em que foram adicionados. O LinkedHashSet é útil quando você precisa manter a ordem de inserção dos elementos e também ter um bom desempenho de busca.

### Referências:

[1] "Collections in Java Tutorial." DigitalOcean Community. Disponível em: https://www.digitalocean.com/community/tutorials/collections-in-java-tutorial.

[2] "Java™ Platform, Standard Edition 17 API Specification - Class Set." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Set.html.

# Exercício Resolvido

### Operações Básicas e Pesquisa com Set:

### 1. Conjunto de Convidados

<p>Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

- `adicionarConvidado(String nome, int codigoConvite)`: Adiciona um convidado ao conjunto.
- `removerConvidadoPorCodigoConvite(int codigoConvite)`: Remove um convidado do conjunto com base no código do convite.
- `contarConvidados()`: Conta o número total de convidados no Set.
- `exibirConvidados()`: Exibe todos os convidados do conjunto.
- `pesquisarPorNome(String nome)`: Pesquisa convidados pelo nome e retorna uma conjunto com os convidados encontrados.
- `atualizarNumeroContato(String nome, int novoNumero)`: Atualiza o código do convite de um convidado específico.
</p>
