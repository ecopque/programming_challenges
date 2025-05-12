//#18: Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
class Exer18 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo para download (MB): ");
        double tamanho_arquivo_mbytes = my_keyword.nextDouble();

        System.out.println("Informe a velocidade da internet (Mbps): ");
        double velocidade_mbps = my_keyword.nextDouble();

        // 1 Byte = 8 bits. Portanto, 1 MB = 8 Mb

        double arquivo_mbits = (tamanho_arquivo_mbytes * 8);
        double tempo_segundos = (arquivo_mbits / velocidade_mbps);
        double tempo_minutos = (tempo_segundos / 60);

        System.out.println("O tempo aproximado é de: " + tempo_minutos);

        my_keyword.close();
    }
}
