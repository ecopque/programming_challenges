//#15: Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.

    // Dicas:
    // Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
    // Triângulo Equilátero: três lados iguais;
    // Triângulo Isósceles: quaisquer dois lados iguais;
    // Triângulo Escaleno: três lados diferentes; 
class Exe15 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe as medidas do lado A: ");
        double ladoa = my_keyword.nextDouble();

        System.out.println("Informe as medidas do lado B: ");
        double ladob = my_keyword.nextDouble();

        System.out.println("Informe as medidas do lado C: ");
        double ladoc = my_keyword.nextDouble();

        if (ladoa + ladob > ladoc && ladoa + ladoc > ladob && ladob + ladoc > ladoa) {
            if (ladoa == ladob && ladob == ladoc) {
                System.out.println("Triângulo Equilátero.");
            } else if (ladoa == ladob || ladoa == ladoc || ladob == ladoc) {
                System.out.println("Triângulo Isósceles.");
            } else if (ladoa != ladob && ladob != ladoc) {
                System.out.println("Triângulo Escaleno.");
            }
        } else {
            System.out.println("Informe medidas corretas para o triângulo.");
        } my_keyword.close();
    }
}
