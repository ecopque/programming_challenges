// 1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o maior número da matriz e a sua posição (linha, coluna).
import java.util.Random;

class Exe01_4 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random randomico = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = randomico.nextInt(10);
            }
        }

        System.out.println("Matriz 4x4: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int maior_numero = matriz[0][0];
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior_numero) {
                    maior_numero = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("\nO maior número é: " + maior_numero);
        System.out.println("Linha: [" + linha + "]" + " , Coluna: " + coluna + "].");
    }
}
