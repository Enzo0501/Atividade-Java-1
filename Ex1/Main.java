import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        float resultadoAnterior = 0;

        while (continuar) {
            
            if (resultadoAnterior == 0) {
                
            
            System.out.print("Digite o primeiro número: ");
            float primeiroNumero = scanner.nextFloat();
            scanner.nextLine(); 
            
            
            System.out.print("Digite a operação (+, -, *, /) ou 'q' para sair: ");
            String operacao = scanner.nextLine();

            if (operacao.equals("q")) {
                continuar = false;
                break;
            }

            System.out.print("Digite o segundo número: ");
            float segundoNumero = scanner.nextFloat();
            scanner.nextLine(); 

            float resultado = 0;

            switch (operacao) {
                case "+":
                    resultado = Calculadora.somar(primeiroNumero, segundoNumero);
                    break;
                case "-":
                    resultado = Calculadora.subtrair(primeiroNumero, segundoNumero);
                    break;
                case "*":
                    resultado = Calculadora.multiplicar(primeiroNumero, segundoNumero);
                    break;
                case "/":
                    if (segundoNumero != 0) {
                        resultado = Calculadora.dividir(primeiroNumero, segundoNumero);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        continuar = false;
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    continue;
            }


            System.out.println("Resultado: " + resultado);

            resultadoAnterior = resultado;
          }
          else{
            System.out.print("Digite a operação (+, -, *, /) ou 'q' para sair: ");
            String operacao = scanner.nextLine();

            if (operacao.equals("q")) {
                continuar = false;
                break;
            }

            float primeiroNumero = resultadoAnterior;


            System.out.print("Digite o segundo número: ");
            float segundoNumero = scanner.nextFloat();
            scanner.nextLine();

            float resultado = 0;

            switch (operacao) {
                case "+":
                    resultado = Calculadora.somar(primeiroNumero, segundoNumero);
                    break;
                case "-":
                    resultado = Calculadora.subtrair(primeiroNumero, segundoNumero);
                    break;
                case "*":
                    resultado = Calculadora.multiplicar(primeiroNumero, segundoNumero);
                    break;
                case "/":
                    if (segundoNumero != 0) {
                        resultado = Calculadora.dividir(primeiroNumero, segundoNumero);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        continuar = false;
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

            resultadoAnterior = resultado;
          }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}