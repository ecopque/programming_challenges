/*
1 - canDrive
Você deve implementar na função chamada canDrive:

Verificação de Permissão para Dirigir

Este requisito tem como objetivo verificar se uma pessoa pode ou não dirigir com base em sua idade.
Objetivo

Você deverá implementar na função chamada canDrive que:

    Receba um único parâmetro:
        age: A idade da pessoa (número).

    Verifique se a idade da pessoa é suficiente para permitir a condução, considerando que a idade mínima para dirigir é 18 anos.

    Imprima a seguinte mensagem com base na verificação:
        Se a idade for 18 anos ou mais, imprima: "Você pode dirigir."
        Se a idade for menor que 18 anos, imprima: "Você não pode dirigir."

Passos para Implementação

    Usar uma Estrutura Condicional:
        Utilize uma estrutura condicional (if, else) para verificar se a idade da pessoa atende ou excede o valor mínimo.
        Dentro de cada condição, use console.log() para imprimir a mensagem apropriada.
*/
function canDrive(age) {
  // escreva seu código aqui
  if (age >= 18) {
      console.log('Você pode dirigir.');
  } else {
      console.log('Você não pode dirigir.');
  }
}

module.exports = {
  canDrive
}
