package classroom_05;

import java.util.Scanner;

public class Classroom_05 {

    private static Scanner ler = new Scanner(System.in);
//    static - pode ser acessado mesmo sem instanciar a classe em um objeto;

    public static void main(String[] args) {

        //Funções/Métodos
        System.out.println(Math.random());
//      O método random é um método estático da classe Math, por isso não precisamos criar um objeto do Math para acessá-lo.

        imprimeHello();
        System.out.println(soma(15, 2));
        System.out.println(subtrai(15, 2));
        System.out.println(multiplica(15, 2));
        System.out.println(divide(15, 2));

    }

    /*-----------------------------*/
    private static void imprimeHello() {
//      private é acessado apenas dentro da mesma classe.

        System.out.println("Hello Word");
        System.out.println("Digite uma Frase: ");
        String frase = ler.nextLine();
//      O método nextLine() é um método não-estático, por isso precisa de um objeto  do tipo Scanner para acessá-lo

        System.out.println();

        System.out.println("Impressão do array");
        int[][] array = arrayInteiros();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");

    }

//      private static "tipo do retorno do método/função" --> Double soma(int valor1, int valor2) {
//        return valor1 + valor2;
//   }
//    - Crie uma função/método para cada operação básica matemática, sendo soma, subtração, multiplicação e divisão.
//    - Todas precisam receber 2 parâmetros e retornar o resultado.
//    - Faça uma impressão de cada método dentro do "psvm", preenchendo os parâmetros com valores arbitrários.
    private static String soma(int valor1, int valor2) {
        return "Soma: \t\t" + valor1 + " + " + valor2 + " = " + (valor1 + valor2);

    }

    /*-----------------------------*/
    private static String subtrai(double valor1, double valor2) {
        return "Subtração: \t" + valor1 + " - " + valor2 + " = " + (valor1 - valor2);
    }

    /*-----------------------------*/
    private static String multiplica(double valor1, double valor2) {
        return "Multiplicação: \t" + valor1 + " x " + valor2 + " = " + (valor1 * valor2);
    }

    /*-----------------------------*/
    private static String divide(double valor1, double valor2) {
        if (valor2 == 0) {
            return "0";
        }
        return "Divisão: \t" + valor1 + " / " + valor2 + " = " + (valor1 / valor2);
    }

    /*--------------
    - Crie uma função que retorne um array de 4x4 com valores preenchidos aletóriamente entre 0 e 20, usando o Math.random().
    - Imprima os valores do array gerado através do psvm.
    ---------------*/
    private static int[][] arrayInteiros() {
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) Math.floor(Math.random() * 21);
            }
        }
        return array;
    }

}
