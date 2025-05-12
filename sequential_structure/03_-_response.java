//#3: Faça um Programa que peça dois números e imprima a soma.
class Exer03 {
    public static void main(String[] args) {
        Scanner my_keyboard = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        long primeiro = my_keyboard.nextLong();

        System.out.println("Informe o segundo número: ");
        long segundo = my_keyboard.nextLong();

        long soma = (primeiro + segundo);
        System.out.println("A soma dois números é: " + soma);

        my_keyboard.close();
    }
}
