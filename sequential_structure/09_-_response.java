//#9: Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9). 
class Aula07_Exer09 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit: ");
        double fahrenheit = my_keyword.nextDouble();

        double calculo1 = (5 * ((fahrenheit - 32) / 9.0));
        double calculo2 = ((5 / 9.0) * (fahrenheit - 32)); //#1:

        System.out.println("Calculo1: " + calculo1);
        System.out.println("Calculo2: " + calculo2);

        my_keyword.close();
    }
}
//#1: Use número float em todas as divisões, senão dará erro. Eu usaria float em todas as divisões, independente dos números. Ex: 5.0.
