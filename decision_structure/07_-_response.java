//#7: Faça um Programa que leia três números e mostre o maior e o menor deles. 
class Exe07 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        long numero1 = my_keyword.nextLong();

        System.out.println("Informe o segundo número: ");
        long numero2 = my_keyword.nextLong();

        System.out.println("Informe o terceiro número: ");
        long numero3 = my_keyword.nextLong();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O primeiro número é maior.");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O segundo número é maior.");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O terceiro número é maior.");
        } else {
            System.out.println("Os três números precisam ser diferentes.");
        }
        my_keyword.close();
    }
}
