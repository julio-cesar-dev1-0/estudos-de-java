package aprendendo_do_zero;

public class exercicio02 {
    public static void main(String[] args) {
        System.out.println("---Teste 1. For tradicional---");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Teste 2. while (enquanto)");
        int contadorwhile = 0;
        while (contadorwhile <= 10){
            System.out.println(contadorwhile);
            contadorwhile++;
        }

        System.out.println("Teste 3. do while (faça, enquanto)");
        int contadorDo = 0;
        do {
            System.out.println(contadorDo);
            contadorDo++;
        } while (contadorDo <= 10);

    }
}