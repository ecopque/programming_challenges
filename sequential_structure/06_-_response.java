//#6: Faça um Programa que peça o raio de um círculo, calcule e mostre sua área (A=π×r2).
class Exer06 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o raio do círculo: ");
        double raio = my_keyword.nextDouble();

        double pi = (3.1416);
        double calculo = (pi * (raio * raio));

        System.out.println("A área do [raio do círculo] é: " + calculo);

        my_keyword.close();
    }
}
