import java.util.Random;

public class SimuladorDeDados {
    private Random random;

    public SimuladorDeDados() {
        random = new Random();
    }

    public int jogarDado() {
        // Gera um número aleatório entre 1 e 6
        return random.nextInt(6) + 1;
    }

    public int jogarTresVezes() {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            int resultado = jogarDado();
            System.out.println("Resultado da jogada " + (i + 1) + ": " + resultado);
            soma += resultado;
        }
        return soma;
    }

    public static void main(String[] args) {
        SimuladorDeDados simulador = new SimuladorDeDados();
        int resultadoFinal = simulador.jogarTresVezes();
        System.out.println("Soma dos resultados: " + resultadoFinal);
    }
}
