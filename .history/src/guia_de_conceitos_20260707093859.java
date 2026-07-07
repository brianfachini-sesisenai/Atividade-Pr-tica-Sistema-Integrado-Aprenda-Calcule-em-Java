import java.util.Scanner; // Importação necessária para usar o Scanner aqui dentro

public class guia_de_conceitos {

    // Novo método que gerencia o menu interno dos conceitos
    public void exibirMenuConceitos(Scanner scanner) {
        System.out.println("\n===== GUIA DE CONCEITOS =====");
        System.out.println("1. O que são Operadores Lógicos?");
        System.out.println("2. O que é Encapsulamento (Getters e Setters)?");
        System.out.println("3. O que é um Construtor?");
        System.out.print("Escolha um tema: ");
        
        int opcaoConceito = scanner.nextInt();

        switch (opcaoConceito) {
            case 1:
                exibirOperadoresLogicos();
                break;
            case 2:
                exibirEncapsulamento();
                break;
            case 3:
                exibirConstrutor();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void exibirOperadoresLogicos() {
        System.out.println("\n--- Operadores Lógicos ---");
        System.out.println("&& (E/AND): Retorna verdadeiro se ambas as condições forem verdadeiras.");
        System.out.println("|| (OU/OR): Retorna verdadeiro se pelo menos uma das condições for verdadeira.");
        System.out.println("! (NÃO/NOT): Inverte o valor lógico da condição.");
    }

    public void exibirEncapsulamento() {
        System.out.println("\n--- Encapsulamento ---");
        System.out.println("É a prática de esconder os detalhes de implementação de uma classe.");
        System.out.println("Usamos atributos 'private' para que outras classes não alterem os dados diretamente.");
        System.out.println("Para acessar ou modificar esses dados de forma controlada, usamos Getters e Setters.");
    }

    public void exibirConstrutor() {
        System.out.println("\n--- Construtor ---");
        System.out.println("É um método especial usado para inicializar objetos quando eles são criados com o 'new'.");
        System.out.println("Ele tem o mesmo nome da classe e não possui tipo de retorno.");
    }
}