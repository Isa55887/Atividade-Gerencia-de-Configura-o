public class Main {
    public static void main(String[] args) {
        // Exibe a mensagem inicial
        System.out.println("Olá, Mundo!");

        // Chamada da nova função
        int resultado = somar(5, 3);
        
        // Exibe o resultado da função
        System.out.println("O resultado da soma é: " + resultado);
    }

    // Esta é a nova função
    public static int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }
}