package aprendendodozero;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("--- Teste 1. For tradicional ---");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n--- Teste 2. while (enquanto) --- ");
        int contador = 0;
        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }

        System.out.println("\n--- Teste 3. do while (faça, enquanto) --- ");
        int novoContador = 0;
        do {
            System.out.println(novoContador);
            novoContador++;
        } while (novoContador <= 10);

    }
}