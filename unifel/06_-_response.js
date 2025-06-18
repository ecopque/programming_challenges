function invertElements(array) {
  // escreva seu código aqui
  let start = 0;
  let end = (array.length - 1);

  let result = [];

  while (start <= end) {
      result[start] = array[end];
      result[end] = array[start];

      start++;
      end--;
  }
  return result;
}

module.exports = {
  invertElements
}
