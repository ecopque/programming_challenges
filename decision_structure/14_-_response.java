//#14: Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:

    //   Média de Aproveitamento  Conceito
    //   Entre 9.0 e 10.0        A
    //   Entre 7.5 e 9.0         B
    //   Entre 6.0 e 7.5         C
    //   Entre 4.0 e 6.0         D
    //   Entre 4.0 e zero        E

    // O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E. 
class Exe14 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        float nota1 = my_keyword.nextFloat();

        System.out.println("Informe a segunda nota: ");
        float nota2 = my_keyword.nextFloat();

        float media = ((nota1 + nota2) / 2);
        String conceito = "";
        String resultado = "";

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("Informe apenas números de 0 a 10.");
            my_keyword.close();
            return; //# Encerro o programa.
        }

        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
            resultado = "Aprovado";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
            resultado = "Aprovado";
        } else if (media >= 6.0 && media <=7.5) {
            conceito = "C";
            resultado = "Aprovado";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
            resultado = "Reprovado";
        } else if (media >= 0 && media < 4.0) {
            conceito = "E";
            resultado = "Reprovado";
        }

        System.out.println("As notas são: " + nota1 + " e " + nota2 + ".");
        System.out.println("A média é: " + media + ".");
        System.out.println("O conceito correspondente é: " + conceito + ".");
        System.out.println("O conceito é: " + resultado + ".");

        my_keyword.close();
    }
}
