class Exer02 {
    public static void main(String[] args) {
        Scanner my_keyboard = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");

        int my_input = my_keyboard.nextInt();
        System.out.println("O número informado foi: " + my_input);

        my_keyboard.close();
    }
}
