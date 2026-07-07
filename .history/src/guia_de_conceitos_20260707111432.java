import java.util.Scanner; // Importação necessária para usar o Scanner aqui dentro

public class guia_de_conceitos {

    // Novo método que gerencia o menu interno dos conceitos
    public void exibirMenuConceitos(Scanner scanner) {
        System.out.println("\n===== GUIA DE CONCEITOS =====");
        System.out.println("1. O que são Operadores Lógicos?");
        System.out.println("2. O que é Encapsulamento (Getters e Setters)?");
        System.out.println("3. O que é um Construtor?");
        System.out.println("4. O que são Classes e Objetos?");
        System.out.println("5. O que é Herança?");
        System.out.println("6. O que é Polimorfismo?");
        System.out.println("7. O que são Estruturas de Repetição?");
        System.out.println("8. O que são Estruturas de Decisão?");
        System.out.println("9. O que são Operadores Aritméticos?");
        System.out.println("10. O que são Métodos?");
        System.out.print("Escolha um tema: ");
        
        int opcaoConceito = scanner.nextInt();

        if (!(opcaoConceito >= 1 && opcaoConceito <= 10)) {
            System.out.println("Opção inválida! Escolha um número de 1 a 10.");
            return;
        }

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
            case 4:
                exibirClassesObjetos();
                break;
            case 5:
                exibirHeranca();
                break;
            case 6:
                exibirPolimorfismo();
                break;
            case 7:
                exibirEstruturasRepeticao();
                break;
            case 8:
                exibirEstruturasDecisao();
                break;
            case 9:
                exibirOperadoresAritmeticos();
                break;
            case 10:
                exibirMetodos();
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

    public void exibirClassesObjetos() {
        System.out.println("\n--- Classes e Objetos ---");
        System.out.println("Classe: É o molde, planta ou modelo que define atributos e comportamentos.");
        System.out.println("Objeto: É uma instância real de uma classe (criado na memória com o operador 'new').");
    }

    public void exibirHeranca() {
        System.out.println("\n--- Herança ---");
        System.out.println("Mecanismo que permite a uma classe (filha) herdar atributos e métodos de outra (pai).");
        System.out.println("Promove o reuso de código usando a palavra-chave 'extends' no Java.");
    }

    public void exibirPolimorfismo() {
        System.out.println("\n--- Polimorfismo ---");
        System.out.println("Significa 'muitas formas'. Permite que classes filhas tenham comportamentos diferentes");
        System.out.println("para um mesmo método herdado da classe pai (geralmente usando sobrescrita/Override).");
    }

    public void exibirEstruturasRepeticao() {
        System.out.println("\n--- Estruturas de Repetição ---");
        System.out.println("São loops que executam um bloco de código repetidas vezes.");
        System.out.println("Exemplos: 'while' (enquanto), 'do-while' (fazer enquanto) e 'for' (para).");
    }

    public void exibirEstruturasDecisao() {
        System.out.println("\n--- Estruturas de Decisão ---");
        System.out.println("Desviam o fluxo de execução baseado em condições lógicas.");
        System.out.println("Exemplos: 'if' (se), 'else if' (senão se), 'else' (senão) e 'switch-case'.");
    }

    public void exibirOperadoresAritmeticos() {
        System.out.println("\n--- Operadores Aritméticos ---");
        System.out.println("Realizam operações matemáticas básicas:");
        System.out.println("+ (soma), - (subtração), * (multiplicação), / (divisão) e % (resto da divisão).");
    }

    public void exibirMetodos() {
        System.out.println("\n--- Métodos ---");
        System.out.println("São blocos de código que realizam uma tarefa específica e podem ser chamados.");
        System.out.println("Podem receber parâmetros de entrada e retornar um valor correspondente.");
    }
}