package funcaosegundograu;

import java.util.Scanner;

public class FuncaoSegundoGrau {

    public static void calculaRaiz(double numA, double numB, double numC) {
        double delta, raizA, raizB;
        delta = Math.pow(numB, 2) - (4 * numA * numC);
        if (delta < 0) {
            System.out.println("Não existem raizes reais.");
        } else if (delta == 0) {
            raizA = (-numB) / (2 * numA);
            System.out.println("x = " + raizA);
        } else {
            raizA = ((-numB) + Math.sqrt(delta)) / (2 * numA);
            raizB = ((-numB) - Math.sqrt(delta)) / (2 * numA);
            System.out.println("x1 = " + raizA);
            System.out.println("x2 = " + raizB);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numA, numB, numC;
        char loop;
        do {
            System.out.println("Vamos calcular uma função do segundo grau!");
            System.out.print("Informe o valor de A: ");
            numA = input.nextDouble();
            input.nextLine();
            System.out.print("Informe o valor de B: ");
            numB = input.nextDouble();
            input.nextLine();
            System.out.print("Informe o valor de C: ");
            numC = input.nextDouble();
            input.nextLine();
            calculaRaiz(numA, numB, numC);
            System.out.print("Deseja fazer outra consulta? Digite S ou N: ");
            loop = input.next().charAt(0);
            loop = Character.toUpperCase(loop);
            while (loop != 'S' && loop != 'N') {
                System.out.println("Erro, informe um valor válido.");
                System.out.print("Deseja fazer outra consulta? Digite S ou N: ");
                loop = input.next().charAt(0);
                loop = Character.toUpperCase(loop);
            }
        } while (loop == 'S');
    }
}