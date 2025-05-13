//#5: Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
// A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
// A mensagem "Reprovado", se a média for menor do que sete;
// A mensagem "Aprovado com Distinção", se a média for igual a dez.
class Exe05 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Insira sua primeira nota: ");
        float nota1 = my_keyword.nextFloat();

        System.out.println("Insira sua segunda nota: ");
        float nota2 = my_keyword.nextFloat();

        float media = ((nota1 + nota2) / 2);

        if (media == 10) {
            System.out.println("Média: " + media + ". Aprovado com distinção.");
        }   else if (media >= 7) {
                System.out.println("Média: " + media + ". Aprovado.");
        }   else {
                System.out.println("Média: " + media + ". Reprovado.");
        }
        my_keyword.close();
    }
}
