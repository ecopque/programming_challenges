// 8. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a multiplicação dos respectivos elementos em A e B, ou seja: C[i] = A[i] * B[i].
class Exe08 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        int[] vetor_a = new int[10];
        int[] vetor_b = new int[10];
        int[] vetor_c = new int[10];

        System.out.println("Digite os 10 números inteiros para o vetor A: ");
        for (int i = 0; i < vetor_a.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetor_a[i] = my_keyword.nextInt();
        }

        System.out.println("Digite os 10 números inteiros para o vetor B: ");
        for (int i = 0; i < vetor_b.length; i++) {
            System.out.print("B[" + i + "]: ");
            vetor_b[i] = my_keyword.nextInt();
        }

        for (int i = 0; i < vetor_c.length; i++) {
            vetor_c[i] = (vetor_a[i] * vetor_b[i]);
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetor_a.length; i++) {
            System.out.print(vetor_a[i] + " ");
        }

        System.out.println("\n\nVetor B: ");
        for (int i = 0; i < vetor_b.length; i++) {
            System.out.print(vetor_b[i] + " ");
        }

        System.out.println("\n\nVetor C (A * B): ");
        for (int i = 0; i < vetor_c.length; i++) {
            System.out.print(vetor_c[i] + " ");
        }

        System.out.println();
        my_keyword.close();
    }
}
