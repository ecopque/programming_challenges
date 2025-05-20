//#28:
// O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:

//                           Até 5 Kg           Acima de 5 Kg
//     File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
//     Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
//     Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

//     Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar. 
class Exe28 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o tipo de carne comprada: ");
        String tipo_carne = my_keyword.nextLine();

        System.out.println("Informe a quantidade de carne comprada: ");
        double qtde_carne = my_keyword.nextDouble();

        my_keyword.nextLine(); //#: Limpar o buffer antes do nextline abaixo.
        System.out.println("Irá usar os Cartões Tabajaras? (Sim/Não)");
        String cartoes_tabajara = my_keyword.nextLine();

        double valor_kg = 0;
        double valor_total = 0;
        String tipo_pagamento = "Outros";
        double desconto = 0;

        if (tipo_carne.equalsIgnoreCase("File Duplo")) {
            if (qtde_carne <= 5) {
                valor_kg = 4.90;
                valor_total = (valor_kg * qtde_carne);
            }
            else if (qtde_carne > 5) {
                valor_kg = 5.80;
                valor_total = (valor_kg * qtde_carne);
            }
            else {
                System.out.println("Error: verificar lógica.");
                my_keyword.close();
                return;
            }
        }

        else if (tipo_carne.equalsIgnoreCase("Alcatra")) {
            if (qtde_carne <= 5) {
                valor_kg = 5.90;
                valor_total = (valor_kg * qtde_carne);
            }
            else if (qtde_carne > 5) {
                valor_kg = 6.80;
                valor_total = (valor_kg * qtde_carne);
            }
            else {
                System.out.println("Error: verificar lógica.");
                my_keyword.close();
                return;
            }
        }

        else if (tipo_carne.equalsIgnoreCase("Picanha")) {
            if (qtde_carne <= 5) {
                valor_kg = 6.90;
                valor_total = (valor_kg * qtde_carne);
            }
            else if (qtde_carne > 5) {
                valor_kg = 7.80;
                valor_total = (valor_kg * qtde_carne);
            }
            else {
                System.out.println("Error: verificar lógica.");
                my_keyword.close();
                return;
            }
        }

        else {
            System.out.println("Informe um nome de carne correto!");
            my_keyword.close();
            return;
        }

        if (cartoes_tabajara.equalsIgnoreCase(("Sim"))) {
            desconto = (valor_total / 100 * 5);
            valor_total = (valor_total - desconto);
            tipo_pagamento = "Cartões Tabajara.";
        }

        System.out.println("Cumpom Fiscal: " + "\n" + 
                            "Tipo de carne: " + tipo_carne + "\n" + 
                            "Quantidade de carne: " + qtde_carne + "\n" +
                            "Valor desconto: " + desconto + "\n" +
                            "Preço total: " + valor_total + "\n" +
                            "Tipo de pagamento: " + tipo_pagamento + "\n");
    my_keyword.close();
    return;

    }
    
}
