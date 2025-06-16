```markdown
# Desafios Lógicos em JavaScript

Repositório de desafios resolvidos sem métodos nativos (como `push`, `map`, `filter`, etc.).

---

## 1. canDrive
**Verificação de permissão para dirigir**  
Implemente a função `canDrive(age)` que retorna:  
- `"Você pode dirigir."` se `age >= 18`  
- `"Você não pode dirigir."` se `age < 18`

### Exemplo
```javascript
canDrive(20); // "Você pode dirigir."
```

---

## 2. checkLicenseEligibility
**Elegibilidade para licença de condução**  
Implemente `checkLicenseEligibility(age, yearsOfExperience)` que retorna:  
- `"Não pode obter a licença."` se `age < 18`  
- `"Pode obter a licença, mas é necessária supervisão."` se `age >= 18` e `yearsOfExperience < 2`  
- `"Pode obter a licença sem supervisão."` se `age >= 18` e `yearsOfExperience >= 2`

### Exemplo
```javascript
checkLicenseEligibility(19, 3); // "Pode obter a licença sem supervisão."
```

---

## 3. displayElements
**Imprime elementos de um array**  
Implemente `displayElements(array)` que imprime cada elemento do array no console, um por linha.

### Exemplo
```javascript
displayElements([1, 2, 3]); 
// Saída:
// 1
// 2
// 3
```

---

## 4. findMaximum
**Encontra o maior número em um array**  
Implemente `findMaximum(array)` que retorna o maior valor do array.

### Exemplo
```javascript
findMaximum([5, 2, 9]); // 9
```

---

## 5. printInnerElements
**Imprime elementos internos de um array**  
Implemente `printInnerElements(array)` que retorna os elementos exceto o primeiro e o último. Se `array.length < 3`, retorna `"Tamanho do array inválido"`.

### Exemplo
```javascript
printInnerElements([1, 2, 3, 4]); // [2, 3]
```

---

## 6. invertElements
**Inverte a ordem de um array**  
Implemente `invertElements(array)` que retorna o array invertido.

### Exemplo
```javascript
invertElements([1, 2, 3]); // [3, 2, 1]
```

---

## 7. invertString
**Inverte uma string**  
Implemente `invertString(str)` que retorna a string invertida.

### Exemplo
```javascript
invertString("hello"); // "olleh"
```

---

## 8. removeDuplicates
**Remove elementos duplicados de um array**  
Implemente `removeDuplicates(array)` que retorna o array sem duplicatas.

### Exemplo
```javascript
removeDuplicates([1, 2, 2, 3]); // [1, 2, 3]
```

---

## 9. calculateNetSalary
**Calcula salário líquido**  
Implemente `calculateNetSalary(grossSalary)` que retorna o salário líquido após descontos de INSS e IR (conforme regras do Brasil).

### Exemplo
```javascript
calculateNetSalary(3000); // "Salário: R$ 2612.55."
```

---

## 10. formatPhoneNumber
**Formata um número de telefone**  
Implemente `formatPhoneNumber(numbers)` que retorna uma string formatada como `(XX) XXXXX-XXXX`. Valida:  
- Tamanho do array = 11  
- Números entre 0 e 9  
- Nenhum número se repete 3+ vezes

### Exemplo
```javascript
formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1]); // "(12) 34567-8901"
```

---

## 11. getIntervalData
**Filtra números em um intervalo**  
Implemente `getIntervalData(array, start, end)` que retorna um objeto com:  
- `arrayNoIntervalo`: elementos entre `start` e `end` (inclusive)  
- `contador`: quantidade de elementos no intervalo

### Exemplo
```javascript
getIntervalData([1, 2, 3, 4, 5], 2, 4); 
// { arrayNoIntervalo: [2, 3, 4], contador: 3 }
```

---

## 12. Method Restrictions
**Restrições de Implementação**  
Todos os desafios (1-11) devem ser resolvidos **sem usar métodos nativos** como:  
- `includes`, `map`, `filter`, `reduce`  
- `push`, `splice`, `indexOf`  
- `Math.max`, `Object.keys`, etc.

### Exemplo
```javascript
// Proibido:
function findMaximum(array) {
  return Math.max(...array); // ❌ Usa Math.max
}

// Permitido:
function findMaximum(array) {
  let max = array[0];
  for (let i = 1; i < array.length; i++) { // ✅ Sem métodos
    if (array[i] > max) max = array[i];
  }
  return max;
}
```
```
