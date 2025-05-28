// 10. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2 (dois), ou seja: B[i] := A[i] % 2.
class Exe10 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        int[] vetor_a = new int[10];
        int[] vetor_b = new int[vetor_a.length];

        System.out.println("Digite os 10 números inteiros para o Vetor A: ");
        for (int i = 0; i < vetor_a.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetor_a[i] = my_keyword.nextInt();
        }

        for (int i = 0; i < vetor_b.length; i++) {
            vetor_b[i] = (vetor_a[i] % 2);
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetor_a.length; i++) {
            System.out.print(vetor_a[i] + " ");
        }

        System.out.println("\n\nVetor B (A % 2): ");
        for (int i = 0; i < vetor_b.length; i++) {
            System.out.print(vetor_b[i] + " ");
        }

        System.out.println();
        my_keyword.close();
    }
}
