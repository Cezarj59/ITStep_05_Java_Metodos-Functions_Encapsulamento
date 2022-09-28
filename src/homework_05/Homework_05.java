package homework_05;

import java.util.Scanner;

public class Homework_05 {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        programa();
    }

    private static int inicio() {

        System.out.println("Digite 1 para imprimir um Array multidimencional com números aleatórios.\nDigite 2 para calcular de uma só vez: soma, multiplicação, potenciação.");
        int select = leia.nextInt();

        return select;
    }

    private static void programa() {
        switch (inicio()) {
            case 1:
                imprimeArray();
                break;
            case 2:
                executarCalculo();
                break;
            default:
                System.out.println("Você digitou uma opção invalida.");
                programa();
        }
    }

    /*-----------------------------*/
    private static void executarCalculo() {
        System.out.println("\nDigite o primeiro valor para calcular:");
        int valor1 = leia.nextInt();
        System.out.println("\nDigite o segundo valor para calcular:");
        int valor2 = leia.nextInt();
        System.out.println("\n" + calculos(valor1, valor2));
        novoCalculo();
    }

    private static String calculos(int valor1, int valor2) {

        String resultado = "Resultados:\n\nSoma: \t\t" + valor1 + " + " + valor2 + " = " + soma(valor1, valor2)
                + "\nMultiplicação: \t" + valor1 + " x " + valor2 + " = " + multiplica(valor1, valor2)
                + "\nPotenciação: \t" + valor1 + " elevado a " + valor2 + "º potência = " + pot(valor1, valor2);

        return resultado;
    }

    /*-----------------------------*/
    private static void novoCalculo() {
        System.out.println("\nFazer um novo calculo digite C, voltar ao inicio digite I,  sair digite N.");
        String opcao = leia.next();

        switch (opcao) {
            case "c":
                executarCalculo();
                break;
            case "C":
                executarCalculo();
                break;
            case "i":
                programa();
                break;
            case "I":
                programa();
                break;
            case "n":
                System.out.println("Até a proxima.");
                break;
            case "N":
                System.out.println("Até a proxima.");
                break;
            default:
                System.out.println("Você digitou uma opção invalida.");
                novoCalculo();
        }
    }

    private static void novoArray() {

        System.out.println("\nPara imprimir um novo Array digite P, voltar ao inicio digite I, sair digite N.");
        String opcao = leia.next();

        switch (opcao) {
            case "p":
                imprimeArray();
                break;
            case "P":
                imprimeArray();
                break;
            case "i":
                programa();
                break;
            case "I":
                programa();
                break;
            case "n":
                System.out.println("\nAté a próxima.");
                break;
            case "N":
                System.out.println("\nAté a próxima.");
                break;
            default:
                System.out.println("Você digitou uma opção inválida.");
                novoArray();
        }
    }

    /*------------Calculos-----------------*/
    private static int soma(int valor1, int valor2) {
        return valor1 + valor2;
    }

    /*-----------------------------*/
    private static double pot(double base, double exponente) {
        double b = base;
        double resultado = 0;
        for (double i = 1; i < exponente; i++) {
            b *= base;
            resultado = b;
        }

        return resultado;
    }

    /*-----------------------------*/
    private static int multiplica(int valor1, int valor2) {
        return valor1 * valor2;
    }


    /*------------Array-----------------*/
    private static int[][] arrayInteiros() {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.floor(Math.random() * 31);
            }
        }
        return array;
    }

    private static void imprimeArray() {
        int x = 1;
        System.out.println("\nImprimindo array:\n");
        int[][] array = arrayInteiros();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        novoArray();
    }

}
