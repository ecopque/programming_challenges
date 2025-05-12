//#4: Faça um Programa que peça as 4 notas bimestrais e mostre a média.
class Exer04 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double primeiro = my_keyword.nextDouble();

        System.out.println("Informe o segundo número: ");
        double segundo = my_keyword.nextDouble();

        System.out.println("Informe o terceiro número: ");
        double terceiro = my_keyword.nextDouble();

        System.out.println("Informe o quarto número: ");
        double quarto = my_keyword.nextDouble();

        double soma_numeros = (primeiro + segundo + terceiro + quarto);
        System.out.println("A soma dos números é: " + soma_numeros);

        double media_quatro = (soma_numeros / 4);
        System.out.println("A média é: " + media_quatro);

        my_keyword.close();
    }
}
