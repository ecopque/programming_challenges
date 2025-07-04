"Automate the Boring Stuff with Python" - Al Sweigart

1.
Write a function named collatz() that has one parameter named number.
If number is even, then collatz() should print number // 2 and return this
value. If number is odd, then collatz() should print and return 3 * number + 1.
Then write a program that lets the user type in an integer and that
keeps calling collatz() on that number until the function returns the
value 1. (Amazingly enough, this sequence actually works for any integer
—sooner or later, using this sequence, you’ll arrive at 1! Even
mathematicians aren’t sure why. Your program is exploring what’s called
the Collatz sequence, sometimes called “the simplest impossible math
problem.”)
Remember to convert the return value from input() to an integer
with the int() function; otherwise, it will be a string value.
Hint: An integer number is even if number % 2 == 0, and it’s odd if number
% 2 == 1.


### 2: Desafio: Criando uma lista formatada
Enunciado:
Dada uma lista com valores, escreva uma função que recebe a lista como argumento e retorna uma string contendo todos os itens da lista, separados por vírgulas e espaços. No entanto, "e" deve ser inserido antes do último item da lista.
Exemplos:

    Entrada: ["maçãs", "bananas", "tofu", "gatos"]

    Saída: "maçãs, bananas, tofu, e gatos"

    Entrada: ["Edson", 11, "Théo", "Mel"]

    Saída: "Edson, 11, Théo, e Mel"

A função também deve ser capaz de lidar com os seguintes casos:

    Lista vazia: Se a lista estiver vazia, a função deve retornar "Lista vazia.".

    Lista com apenas um item: Se a lista contiver apenas um item, a função deve retornar esse item com um ponto no final.

Requisitos:

    A função deve ser capaz de lidar com qualquer tipo de dado dentro da lista, como números, strings ou até mesmo outros tipos de objetos.

    Não use o método join(). Em vez disso, implemente a lógica manualmente, usando loops ou condicionais.

### 3: Desafio: Detecção de Sequência em Lançamentos de Moeda

Este projeto tem como objetivo simular 10.000 experimentos de lançamentos de moeda e analisar com que frequência ocorrem sequências (streaks) de seis ou mais resultados iguais consecutivos — seja de caras ("H") ou coroas ("T").

A motivação desse desafio vem de um fenômeno curioso: quando humanos tentam "fingir" aleatoriedade, tendem a alternar resultados com muita frequência e raramente colocam várias caras ou coroas seguidas. No entanto, em uma sequência realmente aleatória, streaks longas são muito comuns.

O programa funciona em dois passos:

. Para cada uma das 10.000 repetições do experimento, o código gera uma lista com 100 lançamentos de moeda. Cada lançamento é representado aleatoriamente como "H" (heads - cara) ou "T" (tails - coroa), usando random.randint(0, 1).
. Em seguida, o programa verifica se existe uma sequência de seis ou mais resultados iguais consecutivos dentro da lista. Se encontrar ao menos uma, aquela lista é contabilizada como contendo uma streak.

Ao final, o programa informa quantas das 10.000 listas possuíam uma streak e apresenta o resultado como porcentagem. Essa análise permite observar como, mesmo em sequências aleatórias curtas, eventos que parecem "improváveis" são, na verdade, bem comuns.

Este desafio envolve conceitos de aleatoriedade, lógica condicional, manipulação de listas e contagem de padrões repetitivos.
