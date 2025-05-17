//#22: Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão). 
class Exe22 {
    public static void main(String[] args ) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = my_keyword.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par: " + numero);
        } else {
            System.out.println("O número é ímpar: " + numero);
        }
        my_keyword.close();
    }
}
