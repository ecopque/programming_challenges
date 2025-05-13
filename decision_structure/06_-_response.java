//#6: Faça um Programa que leia três números e mostre o maior deles.
class Exe06 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        long numero1 = my_keyword.nextLong();

        System.out.println("Informe o segundo número: ");
        long numero2 = my_keyword.nextLong();

        System.out.println("Informe o terceiro número: ");
        long numero3 = my_keyword.nextLong();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Todos os números são iguais.");
        } else if (numero1 == numero2 && numero1 > numero3) { 
            System.out.println("Números 1 e 2 são iguais e maiores que 3.");
        } else if (numero1 == numero3 && numero1 > numero2) {
            System.out.println("Números 1 e 3 são iguais e maiores que 2.");
        } else if (numero2 == numero3 && numero2 > numero1) {
            System.out.println("Números 2 e 3 são iguais e maiores que 1.");
        } else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O primeiro é maior: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O segundo é maior: " + numero2);
        } else {
            System.out.println("O terceiro é maior: " + numero3);
        }
        my_keyword.close();
    }
}
