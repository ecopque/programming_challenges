//#10: Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit. 
class Aula07_Exer10 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        double celsius = my_keyword.nextDouble();
        
        double calculo1 = (((9.0 * celsius) / 5) + 32);
        double calculo2 = (((9.0 / 5.0) * celsius) + 32);

        System.out.println("Calculo1: " + calculo1);
        System.out.println("Calculo2: " + calculo2);

        my_keyword.close();
    }
}
