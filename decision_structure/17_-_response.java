//#17: Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
//#: Um ano bissexto é um ano que possui um dia a mais no calendário, totalizando 366 dias em vez dos 365 dias convencionais. Esse dia extra é adicionado ao mês de fevereiro, que passa a ter 29 dias em vez de 28.
//#: Deve ser divisível por 4.
//#: Não pode ser divisível por 100, exceto se for divisível por 400.
class Exe17 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int ano = my_keyword.nextInt();

        boolean bissexto = false;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        }
        if (bissexto) {
            System.out.println("Ano é bissexto: " + ano);
        } else {
            System.out.println("Não é bissexto: " + ano);
        }
        my_keyword.close();
    }
}
