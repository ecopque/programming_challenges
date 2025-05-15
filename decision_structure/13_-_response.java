//#13: Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido. 
class Exe13 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe um número correspondente ao dia da semana: ");
        int numero_semana = my_keyword.nextInt();

        if (numero_semana == 1) {
            System.out.println("Domingo.");
        } else if (numero_semana == 2) {
            System.out.println("Segunda.");
        } else if (numero_semana == 3) {
            System.out.println("Terça.");
        } else if (numero_semana == 4) {
            System.out.println("Quarta");
        } else if (numero_semana == 5) {
            System.out.println("Quinta.");
        } else if (numero_semana == 6) {
            System.out.println("Sexta.");
        } else if (numero_semana == 7) {
            System.out.println("Sábado.");
        } else {
            System.out.println("Informe um número correto!");
        }
        my_keyword.close();
    }
}
