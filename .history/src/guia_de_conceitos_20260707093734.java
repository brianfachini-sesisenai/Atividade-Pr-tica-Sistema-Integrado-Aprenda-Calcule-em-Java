public class guia_de_conceitos {

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
