class Exe01_3 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[a.length];

        System.out.println("Digite os 5 números inteiros para o vetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "]:");
            a[i] = my_keyword.nextInt();        
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println("\nVetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\n\nVetor B (cópia de A): ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("");
        my_keyword.close();
    }
}
