//#5: Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação. 
class Exe05 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        double pais_a;
        double pais_b;
        
        double tax_a = 0;
        double tax_b = 0;

        int anos = 0;

        do {
            System.out.println("Informa a população do país A: ");
            pais_a = my_keyword.nextDouble();
            if (pais_a <= 0) {
                System.out.println("Entrada inválida!");
            }          
        }
        while (pais_a <= 0);  

        do {
            System.out.println("Informe a taxa de crescimento de A: ");
            tax_a = my_keyword.nextDouble();
            if (tax_a < 0) {
                System.out.println("Entrada inválida.");
            }
        }
        while (tax_a < 0);

        do {
            System.out.println("Informe a população do país B: ");
            pais_b = my_keyword.nextDouble();
            if (pais_b <= 0) {
                System.out.println("Entrada inválida.");
            }
        }
        while (pais_b <= 0);

        do {
            System.out.println("Informe a taxa de crescimento de B: ");
            tax_b = my_keyword.nextDouble();
            if (tax_b < 0) {
                System.out.println("Entrada inválida.");
            }
        }
        while (tax_b < 0);

        while (pais_a <= pais_b) {
            anos++;
            pais_a = (((pais_a / 100) * tax_a) + pais_a);
            pais_b = (((pais_b /100) * tax_b) + pais_b);
        }

        System.out.println("Anos acumulados: " + anos);
        System.out.printf("População do país A: %.0f\n", pais_a);
        System.out.printf("População do país B: %.0f\n", pais_b);
        my_keyword.close();
        return;
    }
}
