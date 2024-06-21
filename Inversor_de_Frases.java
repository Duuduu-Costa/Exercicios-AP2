public class InversorDeFrases {
    private String frase;

    // Construtor que recebe a frase
    public InversorDeFrases(String frase) {
        this.frase = frase;
    }

    // Método que remove espaços em branco e inverte a frase
    public String inverterFrase() {
        // Remove espaços em branco
        String semEspacos = frase.replaceAll("\\s+", "");
        // Inverte a string
        String invertida = new StringBuilder(semEspacos).reverse().toString();
        return invertida;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Cria uma instância da classe com a frase desejada
        InversorDeFrases inversor = new InversorDeFrases("Exemplo de frase para inverter");
        // Exibe a frase invertida
        System.out.println(inversor.inverterFrase());
    }
}
