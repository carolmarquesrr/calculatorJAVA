
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        char operacao;

        System.out.println("Calculadora Simples em Java");
        System.out.print("Digite o primeiro numero: ");
        num1 = input.nextDouble();

        System.out.print("Digite a operacao (+, -, *, /): ");
        operacao = input.next().charAt(0);

        System.out.print("Digite o segundo numero: ");
        num2 = input.nextDouble();

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro! Divisao por zero nao e permitida.");   
                    return;
                }
                break;
            default:
                System.out.println("Operacao invalida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
        input.close();
    }
}

// You can change the Portuguese phrases to another language. <3 
