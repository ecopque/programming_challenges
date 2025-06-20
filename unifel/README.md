# Requisitos das Funções

## 1. `canDrive`

### Verificação de Permissão para Dirigir

Implemente uma função chamada `canDrive` que:

- Recebe um único parâmetro:
  - `age`: número representando a idade da pessoa.
- Verifica se a idade é suficiente para dirigir (idade mínima: 18 anos).
- Imprime:
  - `"Você pode dirigir."` se idade ≥ 18.
  - `"Você não pode dirigir."` se idade < 18.

#### Passos para Implementação

- Utilize estrutura condicional `if...else`.
- Utilize `console.log()` para imprimir as mensagens.

---

## 2. `checkLicenseEligibility`

### Verificação de Elegibilidade para Licença de Condução

Implemente uma função chamada `checkLicenseEligibility` que:

- Recebe dois parâmetros:
  - `age`: idade da pessoa.
  - `yearsOfExperience`: anos de experiência como condutor.
- Retorne:
  - `"Não pode obter a licença."` se idade < 18.
  - `"Pode obter a licença, mas é necessária supervisão."` se idade ≥ 18 e experiência < 2.
  - `"Pode obter a licença sem supervisão."` se idade ≥ 18 e experiência ≥ 2.

#### Passos para Implementação

- Use `if`, `else if`, `else` para definir a lógica.
- Utilize `return` para retornar a mensagem correta.

---

## 3. `displayElements`

### Impressão de Elementos de um Array

Implemente uma função chamada `displayElements` que:

- Recebe um único parâmetro: um array.
- Imprime cada item do array em uma nova linha no console.

#### Exemplo

```javascript
const array = [1, 2, 3, 4, 5];
displayElements(array);
// Espera-se que imprima:
// 1
// 2
// 3
// 4
// 5
```

---

## 4. `findMaximum`

### Encontrar o Maior Número de um Array

Implemente uma função chamada `findMaximum` que:

- Recebe um array de números.
- Retorna o maior valor presente no array.

#### Exemplo

```javascript
const array = [5, 8, 2, 9, 3];
const maxNumber = findMaximum(array);
console.log(maxNumber); // Espera-se que imprima: 9
```

#### Casos de Teste

- `[1, 6, 8, 5, 19, 20, 10]` → 20
- `[-1, -5, -3, -2]` → -1
- `[5, 8, 4, 10]` → 10

---

## 5. `printInnerElements`

### Imprimir Apenas Elementos Internos do Array

Implemente uma função chamada `printInnerElements` que:

- Recebe um array.
- Imprime todos os elementos, exceto o primeiro e o último.
- Se o array tiver menos de 3 elementos, imprime: `"Tamanho do array inválido"`.

#### Exemplos

- `[1, 5, 10, 12]` → imprime `5`, `10`.
- `['HTML', 'JavaScript', 'CSS']` → imprime `'JavaScript'`.
- `[4, 7]` → `"Tamanho do array inválido"`

---

## 6. `invertElements`

### Inverter Elementos de um Array

Implemente uma função chamada `invertElements` que:

- Recebe um array.
- Retorna um novo array com os elementos na ordem invertida.

#### Exemplos

- `[8, 4, 60, 15]` → `[15, 60, 4, 8]`
- `[23, 7, 10]` → `[10, 7, 23]`
- `['maça', 'banana', 'uva']` → `['uva', 'banana', 'maça']`

---

## 7. `invertString`

### Inverter uma String

Implemente uma função chamada `invertString` que:

- Recebe uma string.
- Retorna essa string invertida.

#### Exemplos

- `"inverte"` → `"etrevni"`
- `"hello"` → `"olleh"`

---

## 8. `removeDuplicates`

### Remover Duplicatas de um Array

Implemente uma função chamada `removeDuplicates` que:

- Recebe um array de números.
- Retorna o mesmo array, mas sem valores duplicados.

#### Exemplos

- `[9, 1, 2, 3, 9, 2, 7]` → `[9, 1, 2, 3, 7]`
- `[0, 4, 4, 4, 9, 1]` → `[0, 4, 9, 1]`
- `[0, 0, 0]` → `[0]`

---

## 9. `calculateNetSalary`

### Calcular Salário Líquido

Implemente uma função chamada `calculateNetSalary` que:

- Recebe um número (salário bruto).
- Retorna o valor líquido após descontos de INSS e IR, conforme as faixas:

#### INSS

- Até R$ 1.556,94: 8%
- R$ 1.556,95 a R$ 2.594,92: 9%
- R$ 2.594,93 a R$ 5.189,82: 11%
- Acima de R$ 5.189,82: desconto fixo de R$ 570,88

#### IR

- Até R$ 1.903,98: isento
- R$ 1.903,99 a R$ 2.826,65: 7,5% (− R$ 142,80)
- R$ 2.826,66 a R$ 3.751,05: 15% (− R$ 354,80)
- R$ 3.751,06 a R$ 4.664,68: 22,5% (− R$ 636,13)
- Acima de R$ 4.664,68: 27,5% (− R$ 869,36)

#### Exemplo de retorno

```text
Salário: R$ 2612.55.
```

---

## 10. `formatPhoneNumber`

### Formatar Número de Telefone

Implemente uma função chamada `formatPhoneNumber` que:

- Recebe um array com 11 números.
- Retorna o número no formato: `(XX) XXXXX-XXXX`

#### Restrições

- Tamanho diferente de 11 → `"Array com tamanho incorreto."`
- Números < 0 ou > 9 → `"não é possível gerar um número de telefone com esses valores"`
- Qualquer número repetido 3 ou mais vezes → mesma mensagem acima.

#### Exemplo

```javascript
formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1]);
// Retorna: (12) 34567-8901
```

---

## 11. `getIntervalData`

### Obter Números em Intervalo

Implemente uma função chamada `getIntervalData` que:

- Recebe:
  - Um array de números
  - Um número inicial do intervalo
  - Um número final do intervalo
- Retorna um objeto:

```javascript
{
  arrayNoIntervalo: [...], // números dentro do intervalo (inclusive)
  contador: n              // quantidade de números encontrados
}
```

#### Exemplos

```javascript
getIntervalData([1, 2, 3, 4, 5, 1], 2, 4);
// → { arrayNoIntervalo: [2, 3, 4], contador: 3 }

getIntervalData([20, 14, 5, 6, 9, 63, 80, 120], 20, 80);
// → { arrayNoIntervalo: [20, 63, 80], contador: 3 }
```
---
## 11. `(Outra perspectiva): Objetivo do Desafio getIntervalData`

Você precisa criar uma função chamada getIntervalData que:

    Recebe 3 parâmetros:

        Um array de números (ex: [1, 2, 3, 4, 5, 1])

        Um número que representa o início do intervalo (ex: 2)

        Um número que representa o fim do intervalo (ex: 4)

    Retorna um objeto com:

        arrayNoIntervalo: um novo array com os números que estão dentro do intervalo [início, fim], ou seja, inclusivo (tanto o início quanto o fim contam).

        contador: a quantidade de elementos encontrados nesse intervalo (tamanho do arrayNoIntervalo).

🧪 Exemplo explicado passo a passo

Chamada:

getIntervalData([1, 2, 3, 4, 5, 1], 2, 4)

1. Percorre o array original: [1, 2, 3, 4, 5, 1]
2. Filtra apenas os números entre 2 e 4, inclusive: 2, 3, 4
3. Cria o novo array: [2, 3, 4]
4. Conta quantos são: 3

Retorno esperado:

{ arrayNoIntervalo: [2, 3, 4], contador: 3 }

💡 Detalhes importantes

    O intervalo é inclusivo: se o número do array for igual ao início ou ao fim, ele também entra no resultado.

    Os elementos devem manter a ordem original do array de entrada.

    O contador é exatamente o número de itens do array filtrado.
---

## 12. Restrições de Métodos

Todas as funções **devem ser implementadas sem o uso de métodos nativos** como:

- `includes`, `map`, `filter`, `find`, `forEach`, `reduce`
- `push`, `splice`, `indexOf`, `lastIndexOf`
- `Math.max`, `Math.min`, `Math.pow`, `Math.abs`, etc.
- `Object.keys`, `Object.values`, `Object.entries`

#### Exemplo:

```javascript
// Proibido:
function aoQuadrado(n) {
  return Math.pow(n, 2);
}

// Permitido:
function aoQuadrado(n) {
  return n * n;
}
```

Professor Marcley Rosa - https://github.com/MarcleyRosa/brain-code?tab=readme-ov-file

