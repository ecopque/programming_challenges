//#7: Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário. 
class Exer07 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o número: ");
        double area = my_keyword.nextDouble();

        double calculo = (area * area);
        double dobro = (calculo * 2);

        System.out.println("A área do quadrado é " + calculo + " e o dobro é " + dobro);

        my_keyword.close();
    }
}
