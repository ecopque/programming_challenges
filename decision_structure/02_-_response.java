//#2: Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
class Exer02 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe um número para saber se é positivo: ");
        int numero = my_keyword.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo.");
        } else if (numero < 0) {
            System.out.println("Número negativo.");
        } else {
            System.out.println("Número neutro.");
        }
        my_keyword.close();
    }
}
