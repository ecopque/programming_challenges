//#12: Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

    // Desconto do IR:
    // Salário Bruto até 900 (inclusive) - isento
    // Salário Bruto até 1500 (inclusive) - desconto de 5%
    // Salário Bruto até 2500 (inclusive) - desconto de 10%
    // Salário Bruto acima de 2500 - desconto de 20% 
    
    // Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

    //         Salário Bruto: (5 * 220)        : R$ 1100,00
    //         (-) IR (5%)                     : R$   55,00  
    //         (-) INSS ( 10%)                 : R$  110,00
    //         FGTS (11%)                      : R$  121,00
    //         Total de descontos              : R$  165,00
    //         Salário Liquido                 : R$  935,00
class Exe12 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora de trabalho: ");
        double hora_trabalho = my_keyword.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        int qtde_horas = my_keyword.nextInt();

        double salario_bruto = (hora_trabalho * qtde_horas);
        int imposto_renda = 0;
        int inss = 10;
        int fgts = 11;

        if (salario_bruto <= 900) {
            imposto_renda = 1;
        } else if (salario_bruto > 900 && salario_bruto <= 1500) {
            imposto_renda = 5;
        } else if (salario_bruto > 1500 && salario_bruto <= 2500) {
            imposto_renda = 10;
        } else if (salario_bruto > 2500) {
            imposto_renda = 20;
        }

        double ir_valor = ((salario_bruto / 100) * imposto_renda);
        double inss_valor = ((salario_bruto / 100) * inss);
        double fgts_valor = ((salario_bruto / 100) * fgts); //# Ñ desconta.

        double total_descontos = (ir_valor + inss_valor );
        double salario_liquido = (salario_bruto - (ir_valor + inss_valor));

        System.out.println("Salário Bruto: " + "(" + imposto_renda + " * " + qtde_horas + "): " + "R$:" + salario_bruto);
        System.out.println("(-) IR " + "(" + imposto_renda + "%" + "): " + "R$:" + ir_valor);
        System.out.println("(-) INSS " + "(" + inss + "%" + "): " + "R$" + inss_valor);
        System.out.println("FGTS " + "(" + fgts + "%" + "): " + "R$" + fgts_valor);
        System.out.println("Total de descontos: " + "R$" + total_descontos);
        System.out.println("Salário líquido: " + "R$" + salario_liquido);

        my_keyword.close();
    }
}
