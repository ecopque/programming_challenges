class Exe02_5 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        String nome;
        String senha;
        boolean bandeira;

        do {
            System.out.println("Informe o nome do usuário: ");
            nome = my_keyword.nextLine();

            System.out.println("Informe a senha: ");
            senha = my_keyword.nextLine();

            if (nome.equals(senha)) {
                bandeira = false;
                System.out.println("Informe usuário e senha diferentes.");
            }
            else {
                bandeira = true;
                System.out.println("Usuário registrado com sucesso.");
            }
        }
        while (!bandeira);
        my_keyword.close();
        return;
    }
}
