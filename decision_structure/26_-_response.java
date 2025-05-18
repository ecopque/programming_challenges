//#26: Um posto está vendendo combustíveis com a seguinte tabela de descontos:

    // Álcool:
    // até 20 litros, desconto de 3% por litro
    // acima de 20 litros, desconto de 5% por litro
    // Gasolina:
    // até 20 litros, desconto de 4% por litro
    // acima de 20 litros, desconto de 6% por litro 
    
    // Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90. 
class Exe26 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe a qtde de litros vendidos: ");
        double litros_vendidos = my_keyword.nextDouble();

        if (litros_vendidos <= 0) {
            System.out.println("Quantidade de litros deve ser maior que 1.");
            my_keyword.close();
            return;
        }

        System.out.println("Informe o tipo de combustível (A/G): ");
        String tipo_comb = my_keyword.next();

        double preco_gasolina = 2.50;
        double preco_alcool = 1.90;
        
        double total_bruto = 0.0;
        double desconto = 0.0;
        double total_liquido = 0.0;

        if (litros_vendidos > 0) {
            if (tipo_comb.equalsIgnoreCase("A")) {
                if (litros_vendidos > 0 && litros_vendidos <= 20) {
                    tipo_comb = "Álcool";
                    total_bruto = ((litros_vendidos * preco_alcool));
                    desconto = ((total_bruto / 100) * 3);
                    total_liquido = (total_bruto - desconto);
                }
                else if (litros_vendidos > 20) {
                    tipo_comb = "Álcool";
                    total_bruto = ((litros_vendidos * preco_alcool));
                    desconto = ((total_bruto / 100) * 5);
                    total_liquido = (total_bruto - desconto);
                }
                else {
                    System.out.println("Error: verificar lógica.");
                    my_keyword.close();
                    return;
                }
            }

            else if (tipo_comb.equalsIgnoreCase("g")) {
                if (litros_vendidos > 0 && litros_vendidos <= 20) {
                    tipo_comb = "Gasolina";
                    total_bruto = ((litros_vendidos * preco_gasolina));
                    desconto = ((total_bruto / 100) * 4);
                    total_liquido = (total_bruto - desconto);
                }
                else if (litros_vendidos > 20) {
                    tipo_comb = "Gasolina";
                    total_bruto = ((litros_vendidos * preco_gasolina));
                    desconto = ((total_bruto / 100) * 6);
                    total_liquido = (total_bruto - desconto);
                }
                else {
                    System.out.println("Error: verificar lógica.");
                    my_keyword.close();
                    return;
                }
            }
            else {
                System.out.println("Digite o tipo de combustível válido.");
                my_keyword.close();
            }
        System.out.println("Tipo combustível: " + tipo_comb + " | Total bruto: " + total_bruto + " | Valor desconto: " + desconto + " | Total líquido: " + total_liquido);
        }
    }
}
