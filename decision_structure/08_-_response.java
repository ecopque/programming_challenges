//#8: Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato. 
class Exe08 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o primeiro preço: ");
        double primeiro = my_keyword.nextDouble();

        System.out.println("Informe o segundo preço: ");
        double segundo = my_keyword.nextDouble();

        System.out.println("Informe o terceiro preço: ");
        double terceiro = my_keyword.nextDouble();

        if (primeiro == segundo && segundo == terceiro) {
            System.out.println("Todos os preços são iguais.");
        } else if (primeiro == segundo && primeiro < terceiro) { 
            System.out.println("Preços 1 e 2 são iguais e menores que 3.");
        } else if (primeiro == terceiro && primeiro < segundo) {
            System.out.println("Números 1 e 3 são iguais e menores que 2.");
        } else if (segundo == terceiro && segundo < primeiro) {
            System.out.println("Números 2 e 3 são iguais e menores que 1.");
        } else if (primeiro < segundo && primeiro < terceiro) {
            System.out.println("Compre o primeiro produto.");
        } else if (segundo < primeiro && segundo < terceiro) {
            System.out.println("Compre o segundo produto.");
        } else if (terceiro < primeiro && terceiro < segundo) {
            System.out.println("Compre o terceiro.");
        } else {
            System.out.println("Algo deu errado.");
        }
        my_keyword.close();
    }
}
