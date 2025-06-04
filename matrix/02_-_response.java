
// 2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.
class Exe02 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random randomico = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = randomico.nextInt(10);
            }
        }

        System.out.println("Matriz 10x10: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int maior_numero = matriz[5][7];
        int linha = (5 + 1);
        int coluna = (7 + 1);

        System.out.println("Maior número: " + maior_numero + 
                           ", Linha: " + linha + 
                           ", Coluna: " + coluna);
    }
}
