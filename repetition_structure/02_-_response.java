//#2: Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações. 
class Exe02_7 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        // String nome; #Obs: se declarar fora do loop economizamos memória.
        // String senha;
        boolean bandeira;

        do {
            System.out.println("Informe o nome de usuário: ");
            String nome = my_keyword.nextLine();

            System.out.println("Informe a senha do usuário: ");
            String senha = my_keyword.nextLine();

            if (nome.equals(senha)) {
                bandeira = false;
                System.out.println("Usuário e Senha não podem ser iguais.");
            }
            else {
                bandeira = true;
                System.out.println("Usuário registrado com sucesso!");
            }
        }
        while (!bandeira);
        my_keyword.close();
        return;
    }
}
