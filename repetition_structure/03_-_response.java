//#3: Faça um programa que leia e valide as seguintes informações:

    // Nome: maior que 3 caracteres;
    // Idade: entre 0 e 150;
    // Salário: maior que zero;
    // Sexo: 'f' ou 'm';
    // Estado Civil: 's', 'c', 'v', 'd'; 
class Aula13_Exe03 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estado_civil;

        do {
            System.out.println("Informe seu nome: ");
            nome = my_keyword.nextLine();
            if (nome.length() <= 3) {
                System.out.println("Insira um nome acima de 3 caracteres.");
            }
        }
        while (nome.length() <= 3);

        do {
            System.out.println("Insira sua idade: ");
            idade = my_keyword.nextInt();
            if (idade <= 0 || idade > 150) {
                System.out.println("Insira uma idade maior que zero e menor que 150.");
            }
        }
        while (idade <= 0 || idade > 150);

        
        do {
            System.out.println("Insira seu salário: ");
            salario = my_keyword.nextDouble();
            if (salario <= 0) {
                System.out.println("Informe um salário acima de 0.");
            }
        }
        while (salario <= 0);
        my_keyword.nextLine(); //#: Limpa a quebra de linha pendente por Double().
        
        do {
            System.out.println("Informe seu sexo (F ou M): ");
            
            sexo = my_keyword.nextLine();
            if (!sexo.equalsIgnoreCase("F") &&
                !sexo.equalsIgnoreCase("M")) {
                    System.out.println("Digite um sexo válido.");
                }
        }
        while (!sexo.equalsIgnoreCase("F") &&
                !sexo.equalsIgnoreCase("M"));

        String sexo_extenso = "";
        if (sexo.equalsIgnoreCase("F")) {
            sexo_extenso = "Feminino";
        }
        else if (sexo.equalsIgnoreCase("M")) {
            sexo_extenso = "Masculino";
        } 
        
        do {
            System.out.println("Digite seu estado civil: ");
            estado_civil = my_keyword.nextLine();

            if (!estado_civil.equalsIgnoreCase("S") 
                && !estado_civil.equalsIgnoreCase("C")
                && !estado_civil.equalsIgnoreCase("V")
                && !estado_civil.equalsIgnoreCase("D")) {
                    System.out.println("Informe um estado civil correto!");
                }
        }
        while ((!estado_civil.equalsIgnoreCase("S") 
                && !estado_civil.equalsIgnoreCase("C")
                && !estado_civil.equalsIgnoreCase("V")
                && !estado_civil.equalsIgnoreCase("D")));
        
        String estado_civil_extenso = "";
        if (estado_civil.equalsIgnoreCase("S")) {
            estado_civil_extenso = "Solteiro";
        }
        else if (estado_civil.equalsIgnoreCase("C")) {
            estado_civil_extenso = "Casado";
        }
        else if (estado_civil.equalsIgnoreCase("V")) {
            estado_civil_extenso = "Viúvo";
        }
        else if (estado_civil.equalsIgnoreCase("D")) {
            estado_civil_extenso = "Divorciado";
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário R$: " + String.format("%.5f", salario));
        System.out.println("Sexo: " + sexo_extenso);
        System.out.println("Estado Civil: " + estado_civil_extenso);
        my_keyword.close();
        return;
    }
}
