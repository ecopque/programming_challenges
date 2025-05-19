//#27: Uma fruteira está vendendo frutas com a seguinte tabela de preços:

    //                       Até 5 Kg           Acima de 5 Kg
    // Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
    // Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg

    // Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
class Exe27 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe a quantidade de kg's/maçãs: ");
        double kg_maca = my_keyword.nextDouble();
        if (kg_maca <= 0) {
            System.out.println("Informe um valor acima de zero.");
            my_keyword.close();
            return;
        }

        System.out.println("Informe a quantidade de kg's/morangos: ");
        double kg_morango = my_keyword.nextDouble();
        if (kg_morango <= 0) {
            System.out.println("Informe um valor acima de zero.");
            my_keyword.close();
            return;
        }

        double preco_maca = 0;
        double valor_total_maca = 0;

        double preco_morango = 0;
        double valor_total_morango = 0;

        if (kg_maca <= 5) {
            preco_maca = 1.80;
            valor_total_maca = (kg_maca * preco_maca);
        }
        else if (kg_maca > 5) {
            preco_maca = 1.50;
            valor_total_maca = (kg_maca * preco_maca);
        }
        else {
            System.out.println("Error: verificar lógica.");
        }

        if (kg_morango <= 5) {
            preco_morango = 2.50;
            valor_total_morango = (kg_morango * preco_morango);
        }
        else if (kg_morango > 5) {
            preco_morango = 2.20;
            valor_total_morango = (kg_morango * preco_morango);
        }
        else {
            System.out.println("Error: verificar lógica.");
        }

        double valor_total_frutas = (valor_total_maca + valor_total_morango);
        double desconto_10 = 0;
        double valor_total_frutas_desconto = valor_total_frutas;


        if ((kg_maca + kg_morango > 8) || (valor_total_maca + valor_total_morango > 25)) {
            desconto_10 = ((valor_total_frutas / 100) * 10);
            valor_total_frutas_desconto = (valor_total_frutas - desconto_10);
        }

        System.out.println("Peso total maçã: " + kg_maca + "\n" +
                           "Peso total morango: " + kg_morango + "\n" + 
                           "Valor total maçã: " + valor_total_maca + "\n" +
                           "Valor total morango: " + valor_total_morango + "\n" +
                           "\n" +
                           "Valor total s/ desconto " + valor_total_frutas + "\n" + 
                           "Desconto 10%?: " + desconto_10 + "\n" +
                           "Valor total: " + valor_total_frutas_desconto);
        my_keyword.close();
    } 

}
