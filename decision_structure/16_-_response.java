//#16: Faça um programa que calcule as raízes de uma equação do segundo grau, na forma [ax2 + bx + c]. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

    // Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
    // Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
    // Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
    // Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário; 

//#Edson: Vamos usar a "Fórmula de Bhaskara":
    // Primeiro calcular o "Discriminante (Delta - Δ)": Δ = b² - 4ac.
    // Calcular as Raízes (x):
        // Se Δ > 0, calcule x1 = (-b + √Δ) / (2a) e x2 = (-b - √Δ) / (2a).
        // Se Δ = 0, calcule x = -b / (2a).
        // Se Δ < 0, a equação não tem raízes reais.
class Exe16 {
    public static void main(String[] args) {
        Scanner my_keyword = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        double a = my_keyword.nextDouble();
        if (a == 0) {
            System.out.println("Não é uma equação de segundo grau! Encerrando programa...");
            my_keyword.close();
            return;
        }

        System.out.println("Informe o valor de B: ");
        double b = my_keyword.nextDouble();

        System.out.println("Informe o valor de C: ");
        double c = my_keyword.nextDouble();

        double delta = ((b * b) - ((4 * a) * c));
        
        if (delta < 0) {
            System.out.println("Delta negativo. Equação não possui raízes reais. Encerrando programa...");
            my_keyword.close();
            return;
        } else if (delta == 0) {
            double raiz_real = ((-b) / (2 * a)); //#: Se delta == 0.
            System.out.println("A equação possui apenas uma raiz real: " + raiz_real);
        } else if (delta > 0) {
            double raiz_delta = Math.sqrt((delta));
            double x1 = ((-b + raiz_delta) / (2 * a));
            double x2 = ((-b - raiz_delta) / (2 * a));
            System.out.println("Delta positivo. A equação possui duas raiz reais: " + x1 + " e " + x2);
        } else {
            System.out.println("Error: verificar lógica.");
        }
        
        my_keyword.close();
    }
}
