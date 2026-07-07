import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.in);
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
                    calculadora calculadora = new calculadora();
                    calculadora.exibirMensagem();
                    calculadora.exibirOperações();
                    break;
                case 2:
                    guia_de_conceitos guia_de_conceitos = new guia_de_conceitos();
                    guia_de_conceitos.exibirMensagem();
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

        } while (continuar == 'S');
        System.out.println("Sistema encerrado. Bons estudos!");
        scanner.close();
    }
}
