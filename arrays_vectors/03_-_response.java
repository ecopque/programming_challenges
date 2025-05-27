// 3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[I].
class Exe03 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        int[] vetor_a = new int[15];
        int[] vetor_b = new int[vetor_a.length];

        System.out.println("Digite os 15 números inteiros para o Vetor A: ");
        for (int i = 0; i < vetor_a.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetor_a[i] = my_keyword.nextInt();
        }

        for (int i = 0; i < vetor_b.length; i++) {
            vetor_b[i] = (vetor_a[i] * vetor_a[i]);
        }

        System.out.println("\nVetor A:");
        for (int i = 0; i < vetor_a.length; i++) {
            System.out.print(vetor_a[i] + " ");
        }

        System.out.println("\n\nVetor B ao quadrado de A: ");
        for (int i = 0; i < vetor_b.length; i++) {
            System.out.print(vetor_b[i] + " ");
        }

        System.out.println();
        my_keyword.close();
    }
}
