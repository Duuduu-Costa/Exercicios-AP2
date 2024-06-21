import java.util.Scanner;

public class Farmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco;

        while (true) {
            System.out.print("Digite o preço do produto (ou 0 para encerrar): R$ ");
            preco = scanner.nextDouble();
            
            if (preco == 0) {
                break;
            }

            double novoPreco = ajustarPreco(preco);
            System.out.printf("Novo preço ajustado: R$ %.2f%n", novoPreco);
        }
        
        scanner.close();
    }

    public static double ajustarPreco(double preco) {
        double precoAjustado = preco * 1.12;
        return Math.round(precoAjustado * 100.0) / 100.0;
    }
}
