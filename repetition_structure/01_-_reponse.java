import java.util.Scanner;

//#1: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. 

class Exe01 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);
        double nota;

        do {
            System.out.println("Informe uma nota de 0 a 10: ");
            nota = my_keyword.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Informe uma nota válida.");
            }
        }
        while (nota < 0 || nota > 10);
            System.out.println("Nota válida registrada: " + nota);
            my_keyword.close();
            return;
    }
}
