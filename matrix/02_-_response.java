
// 2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.
class Aula18_Exe02 {
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

        int maior_linha5 = matriz[4][0];
        int menor_linha5 = matriz[4][0];

        for (int j = 0; j < matriz[4].length; j++) {
            if (matriz[4][j] > maior_linha5) {
                maior_linha5 = matriz[4][j];
            }
            if (matriz[4][j] < menor_linha5) {
                menor_linha5 = matriz[4][j];
            }
        }

        int maior_coluna7 = matriz[0][6];
        int menor_coluna7 = matriz[0][6];

        for(int i = 0; i < matriz.length; i++) {
            if (matriz[i][6] > maior_coluna7) {
                maior_coluna7 = matriz[i][6];
            }
            if (matriz[i][6] < menor_coluna7) {
                menor_coluna7 = matriz[i][6];
            }
        }
        System.out.println("\nMaior valor da linha 5: " + maior_linha5);
        System.out.println("Menor valor da linha 5: " + menor_linha5);
        System.out.println("Maior valor da coluna 7: " + maior_coluna7);
        System.out.println("Menor valor da coluna 7: " + menor_coluna7);
    }
}
