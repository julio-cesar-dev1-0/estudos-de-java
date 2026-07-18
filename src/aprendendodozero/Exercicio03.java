package aprendendodozero;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("---Test do for tradicional inverso---");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("---Test com while (enquanto) inverso---");
        int contador = 10;
        while (contador >= 0) {
            System.out.println(contador);
            contador--;
        }

        System.out.println("--- Teste com do-while (faça enquanto) inverso --- ");
        int novoContador = 10;
        do {
            System.out.println(novoContador);
            novoContador--;
        } while (novoContador >= 0);

    }

}

/*
esse exercicio foi para mostrar algumas formas que eu conheço para aplicar uma contagem, esses tipos
de comandos (for, do, while) servem para qualquer tipo de contagem, sendo de 0 a 10, 10 a 0, ou contar
os numeros exatos de um array com um lenght. Tenho muito que aprender ainda, mas estou focado e determinado a
dominar o ecossistema java.

 */