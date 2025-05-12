//#11: Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
// o produto do dobro do primeiro com metade do segundo .
// a soma do triplo do primeiro com o terceiro.
// o terceiro elevado ao cubo.

class Exer11 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o primeiro número inteiro: ");
        int primeiro = my_keyword.nextInt();

        System.out.println("Informe o segundo número inteiro: ");
        int segundo = my_keyword.nextInt();

        System.out.println("Informe um número real: ");
        double terceiro = my_keyword.nextDouble();

        int dobro_primeiro = (primeiro * 2);
        int metade_segundo = (segundo / 2);
        int produto = (dobro_primeiro * metade_segundo);
        System.out.println("O produto do primeiro com metade do segundo é: " + produto);

        double triplo = ((primeiro * 3) + terceiro);
        System.out.println("A soma do triplo do primeiro com o terceiro e: " + triplo);

        double terceiro_cubo = ((terceiro * terceiro) * (terceiro));
        System.out.println("O terceiro elevado ao cubo é: " + terceiro_cubo);

        my_keyword.close();
    }
}
