//#25: Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

    // "Telefonou para a vítima?"
    // "Esteve no local do crime?"
    // "Mora perto da vítima?"
    // "Devia para a vítima?"
    // "Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
    
    // Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente". 
class Exe25 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        int contador = 0;

        System.out.println("Telefonou para a vítima?");
        String telefonema = my_keyword.nextLine();
        if (telefonema.equalsIgnoreCase("sim")) {
            contador += 1;
        }

        System.out.println("Esteve no local do crime?");
        String local_crime = my_keyword.nextLine();
        if (local_crime.equalsIgnoreCase("sim")) {
            contador += 1;
        }

        System.out.println("Mora perto da vítima?");
        String mora_perto = my_keyword.nextLine();
        if (mora_perto.equalsIgnoreCase("sim")) {
            contador += 1;
        }

        System.out.println("Devia para a vítima?");
        String devia = my_keyword.nextLine();
        if (devia.equalsIgnoreCase("sim")) {
            contador += 1;
        }

        System.out.println("Já trabalhou com a vítima?");
        String trabalhou = my_keyword.nextLine();
        if (trabalhou.equalsIgnoreCase("sim")) {
            contador += 1;
        }

        if (contador >= 0 && contador <= 1) {
            System.out.println("0 ou 1: Inocente.");
        }
        else if (contador == 2) {
            System.out.println("2: Suspeita.");
        }
        else if (contador >= 3 && contador <= 4) {
            System.out.println("3 ou 4: Cúmplice.");
        }
        else if (contador == 5) {
            System.out.println("5: Assassino.");
        }
        else {
            System.out.println("Error: verifique a lógica.");
        }
        my_keyword.close();
    }
}
