//#1: Faça um Programa que peça dois números e imprima o maior deles. 
import java.util.Scanner;

class Aula10_Exer10 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe um número número: ");
        long primeiro = my_keyword.nextLong();

        System.out.println("Informe o segundo número: ");
        long segundo = my_keyword.nextLong();

        if (primeiro > segundo) {
            System.out.println("Primeiro número: " + primeiro);
        } else if (primeiro < segundo) {
            System.out.println("Segundo número: " + segundo);
        } else {
            System.out.println("Os números não podem ser iguais.");
        }
        my_keyword.close();
    }
}
