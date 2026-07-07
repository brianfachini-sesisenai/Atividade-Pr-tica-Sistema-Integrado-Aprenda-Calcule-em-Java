public class calculadora {
    
    // Atributos privados (Encapsulamento)
    private double numero1;
    private double numero2;
    
    // Construtor
    public calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // Métodos Getters e Setters
    public double getNumero1() { return numero1; }
    public void setNumero1(double numero1) { this.numero1 = numero1; }
    public double getNumero2() { return numero2; }
    public void setNumero2(double numero2) { this.numero2 = numero2; }
    
    // Métodos de Operações (Exemplo)
    public double somar() {
        return this.numero1 + this.numero2;
    }

    public double subtrair() {
        return this.numero1 - this.numero2;
    }

    public double multiplicar() {
        return this.numero1 * this.numero2;
    }

    public double dividir() {
        if (numero2 == 0) {
            System.out.println("ERRO: Não é possível dividir por zero!");
            return 0;
        } else {
            return this.numero1 / this.numero2;
        }
    }

    public void exibirOperações() {
        System.out.println("Escolha uma operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
    }
}
