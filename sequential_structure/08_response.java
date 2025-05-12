//#8: Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês. 
class Aula07_Exer08 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora: ");
        double valor_hora = my_keyword.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhada/mês: ");
        double horas_mes = my_keyword.nextDouble();

        double calculo = (valor_hora * horas_mes);

        System.out.println("Você ganha por hora: " + valor_hora + ", trabalha por mês o total de horas: " + horas_mes + " totalizando um salário de: R$" + calculo);

        my_keyword.close();
    }
}
