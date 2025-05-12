//#3: Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
class Exer03 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Escreva 'F' ou 'M'.");
        String letra = my_keyword.next();
        letra = letra.toUpperCase(); //#1:

        if (letra.equals("F")) { //#1: letra.equalsIgnoreCase.
            System.out.println("Feminino.");
        } else if (letra.equals("M")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo inválido");
        my_keyword.close();
        }
    }
}
//#1: Poderíamos usar o x.equalsIgnoreCase (e excluir a linha c/ toUpperCase()).
