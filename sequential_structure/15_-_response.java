//#15: Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
// salário bruto.
// quanto pagou ao INSS.
// quanto pagou ao sindicato.
// o salário líquido.
// calcule os descontos e o salário líquido, conforme a tabela abaixo:
//  + Salário Bruto : R$
//  - IR (11%) : R$
//  - INSS (8%) : R$
//  - Sindicato ( 5%) : R$
//  = Salário Liquido : R$
// Obs.: Salário Bruto - Descontos = Salário Líquido. 
class Exer15 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        float valor_hora = my_keyword.nextFloat();

        System.out.println("Quantas horas trabalhadas/mês? ");
        double qtde_horas_mes = my_keyword.nextDouble();

        double salario_bruto = (valor_hora * qtde_horas_mes);
        double imposto_renda = ((salario_bruto / 100) * 11);
        double inss = ((salario_bruto / 100) * 8);
        double sindicato = ((salario_bruto / 100) * 5);

        double total_impostos = (imposto_renda + inss + sindicato);
        double salario_liquido = (salario_bruto - total_impostos);
        System.out.println("Salário bruto: " + salario_bruto + ". Salário líquido: " + salario_liquido);

        my_keyword.close();
    }
}
