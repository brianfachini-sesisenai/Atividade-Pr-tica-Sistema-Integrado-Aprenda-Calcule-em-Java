import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';
    
        do {
            // 1. Exibir Menu Principal
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Calculadora");
            System.out.println("2. Guia de Conceitos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            // 2. Capturar opção com Switch-Case
            int opcao = scanner.nextInt();

            // 3. Executar a lógica escolhida
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double numero1 = scanner.nextDouble();
    
                    System.out.print("Digite o segundo número: ");
                    double numero2 = scanner.nextDouble();

                    calculadora calculadora = new calculadora(numero1, numero2);
                    calculadora.exibirOperacoes();
                    int op = scanner.nextInt();

                    switch (op) {
                        case 1:
                            System.out.println("Resultado da Soma: " + calculadora.somar());
                            break;
                        case 2:
                            System.out.println("Resultado da Subtração: " + calculadora.subtrair());
                            break;
                        case 3:
                            System.out.println("Resultado da Multiplicação: " + calculadora.multiplicar());
                            break;
                        case 4:
                            System.out.println("Resultado da Divisão: " + calculadora.dividir());
                            break;
                        default:
                            System.out.println("Operação inválida!");
                    }
                    break;
                case 2:
                    guia_de_conceitos guia_de_conceitos = new guia_de_conceitos();
                    guia_de_conceitos.exibirMenuConceitos(scanner); // Passa o scanner criado no main
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            // 4. Perguntar se deseja continuar
            System.out.print("\nDeseja voltar ao menu principal? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);

        } while (continuar == 'S' || continuar == 's');
        System.out.println("Sistema encerrado. Bons estudos!");
        scanner.close();
    }
}
