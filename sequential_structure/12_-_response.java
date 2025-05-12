//#12: Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58.
class Exer12 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        float altura = my_keyword.nextFloat();

        double peso_ideal = ((72.7 * altura) - 58);
        System.out.println("Seu peso ideal é: " + peso_ideal);

        my_keyword.close();

    }
}
