//#4: Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
class Aula10_Ex04 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = my_keyword.next();

        if (letra.length() != 1) {
            System.out.println("Digite apenas uma letra.");
        } else if (letra.equalsIgnoreCase("A") ||
                    letra.equalsIgnoreCase("E") ||
                    letra.equalsIgnoreCase("I") ||
                    letra.equalsIgnoreCase("O") ||
                    letra.equalsIgnoreCase("U")) {
                        System.out.println("Vogal.");
            }else {
                System.out.println("Provavelmente consoante.");
        }
        my_keyword.close();
    }
}
