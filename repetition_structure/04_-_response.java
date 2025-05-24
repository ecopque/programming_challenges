//#4: Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento. 
class Exe04_2 {
    public static void main(String[] args) {
        double pais_a = 80000; //#: 3%.
        double pais_b = 200000; //#: 1.5%.
        int anos = 0;

        while (pais_a <= pais_b) {
            anos += 1;
            pais_a = (((pais_a / 100) * 3) + pais_a);
            pais_b = (((pais_b / 100) * 1.5) + pais_b);
        }

        System.out.println("Anos acumulados: " + anos);
        System.out.printf("População do país A: %.0f\n", pais_a);
        System.out.printf("População do país B: %.0f\n", pais_b);
        return;
    }
}
