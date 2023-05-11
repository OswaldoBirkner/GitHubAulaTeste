package src;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença entre os números digitados");
        System.out.println("3 - Produto entre os números digitados");
        System.out.println("4 - Divisão do primeiro número pelo segundo");

        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                double media = (num1 + num2) / 2;
                System.out.println("A média dos números é: " + media);
                break;
            case 2:
                double diferenca = num1 - num2;
                System.out.println("A diferença entre os números é: " + diferenca);
                break;
            case 3:
                double produto = num1 * num2;
                System.out.println("O produto dos números é: " + produto);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possível realizar a divisão por zero.");
                } else {
                    double divisao = num1 / num2;
                    System.out.println("A divisão do primeiro número pelo segundo é: " + divisao);
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        input.close();
    }
}
}
