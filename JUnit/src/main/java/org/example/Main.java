package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        Calculadora calculator = new Calculadora();

        System.out.println("Digite o primeiro numero: ");
        double n1 = scan.nextDouble();

        System.out.println("Digite o operador que voce vai utilizar (+, -, *, /): ");
        char operador = scan.next().charAt(0);

        System.out.println("Digite o segundo numero: ");
        double n2 = scan.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch(operador) {
            case '+':
                resultado = calculator.somar(n1, n2);
                break;
            case '-':
                resultado = calculator.subtrair(n1, n2);
                break;
            case '*':
                resultado = calculator.multiplicar(n1, n2);
                break;
            case '/':
                try {
                    resultado = calculator.dividir(n1, n2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    operacaoValida = false;
            }
                break;
            default:
                System.out.println("Operador inválido!");
                operacaoValida = false;
                break;
        }

        if (operacaoValida) {
            System.out.println("O resultado é: "+resultado);
        }
    }
}