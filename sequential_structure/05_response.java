//#5: Faça um Programa que converta metros para centímetros. 
class Exer05 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Entre com a quantidade em metros: ");
        double metros = my_keyword.nextDouble();

        double conversao_centimetros = (metros * 100);
        System.out.println("A resposta em centímetros é: " + conversao_centimetros);

        my_keyword.close();
    }
}
