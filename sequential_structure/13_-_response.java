//#13: Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
// Para homens: (72.7*h) - 58
// Para mulheres: (62.1*h) - 44.7
class Aula07_Exer13 {
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        float altura = my_scan.nextFloat();

        double peso_ideal_h = ((72.7 * altura) - 58);
        double peso_ideal_m = ((62.1 * altura) - 44.7);

        System.out.println("Ideal homem: " + peso_ideal_h + ", Ideal mulher: " + peso_ideal_m);

        my_scan.close();
    }
}
