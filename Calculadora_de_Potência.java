public class CalculadoraPotencia {
    public static void main(String[] args) {
        // Exemplo de cálculo de potência
        double base = 3.0;
        double expoente = 4.0;

        // Calculando base elevado ao expoente usando Math.pow
        double resultado = Math.pow(base, expoente);

        // Exibindo o resultado
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
    }
}
