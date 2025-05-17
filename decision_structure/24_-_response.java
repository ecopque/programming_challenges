//#24: Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é:

    // par ou ímpar;
    // positivo ou negativo;
    // inteiro ou decimal. 
class Exe24 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double numero1 = my_keyword.nextDouble();

        System.out.println("Informe o segundo número: ");
        double numero2 = my_keyword.nextDouble();

        System.out.println("Qual operação deseja realizar? Ex: +, -, * ou /.");
        String operacao = my_keyword.next();
        
        double resultado = 0;

        String par_impar = "";
        String positivo_negativo = "";
        String inteiro_decimal = "";
        
        boolean operacao_valida = true;

        if (operacao.equals("+")) {
            resultado = (numero1 + numero2);
        }
        else if (operacao.equals("-")) {
            resultado = (numero1 - numero2);
        }
        else if (operacao.equals("*")) {
            resultado = (numero1 * numero2);
        }
        else if (operacao.equals("/")) {
            resultado = (numero1 / numero2);
        }
        else {
            System.out.println("Digite um sinal de operação válido.");
            operacao_valida = false;
        }

        if (operacao_valida) {
            if (resultado % 2 == 0) {
                par_impar = "Par, ";
            } 
            else {
                par_impar = "Ímpar, ";
            }
            if (resultado > 0) {
                positivo_negativo = "Positivo, ";
            }
            else if (resultado < 0) {
                positivo_negativo = "Negativo, ";
            } 
            else {
                positivo_negativo = "Neutro, ";
            }
            if (resultado % 1 != 0) {
                inteiro_decimal = "Decimal.";
            } 
            else {
                inteiro_decimal = "Inteiro.";
            }

            System.out.println("O resultado é: " + par_impar + " " + positivo_negativo + " " + inteiro_decimal + " Número é: " + resultado);
        }
        my_keyword.close();
    }
}
