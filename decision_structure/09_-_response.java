//#9: Faça um Programa que leia três números e mostre-os em ordem decrescente.
class Exe09 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = my_keyword.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = my_keyword.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = my_keyword.nextInt();

        if (numero1 < numero2 && numero2 < numero3) {
            System.out.println(numero1 + ", " + numero2 + ", " + numero3);
        } else if (numero1 < numero3 && numero3 < numero2) {
            System.out.println(numero1 + ", " + numero3 + ", " + numero2);
        } else if (numero2 < numero1 && numero1 < numero3) {
            System.out.println(numero2 + ", " + numero1 + ", " + numero3);
        } else if (numero2 < numero3 && numero3 < numero1) {
            System.out.println(numero2 + ", " + numero3 + ", " + numero1);
        }else if (numero3 < numero1 && numero1 < numero2) {
            System.out.println(numero3 + ", " + numero1 + ", " + numero2);
        } else if (numero3 < numero2 && numero2 < numero1) {
            System.out.println(numero3 + ", " + numero2 + ", " + numero1);
        } else {
            System.out.println("Não podemos ter números iguais, cabra!");
        }
        my_keyword.close();
    }
}
