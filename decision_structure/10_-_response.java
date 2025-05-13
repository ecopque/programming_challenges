//#10: Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. 
class Exe10 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Em que turno você estuda? Digite M (para matutino), V (para vespertino) ou N (para noturno).");
        String letra = my_keyword.next();

        letra = letra.toUpperCase();

        if (letra.equals("M")) {
            System.out.println("Bom dia.");
        } else if (letra.equals("V")) {
            System.out.println("Boa tarde.");
        } else if (letra.equals("N")) {
            System.out.println("Boa noite.");
        } else {
            System.out.println("Valor inválido.");
        }
        my_keyword.close();
    }
}
