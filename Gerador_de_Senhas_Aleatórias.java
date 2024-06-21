import java.util.Random;

public class GeradorDeSenhas {

    // Método para gerar uma senha numérica aleatória
    public String gerarSenhaAleatoria() {
        Random random = new Random();

        // Gera um número aleatório entre 5 e 10 (inclusive)
        int numeroDeDigitos = 5 + random.nextInt(6);

        StringBuilder senha = new StringBuilder();

        // Gera cada dígito da senha
        for (int i = 0; i < numeroDeDigitos; i++) {
            int digito = random.nextInt(10); // Gera um número entre 0 e 9
            senha.append(digito);
        }

        return senha.toString();
    }

    public static void main(String[] args) {
        GeradorDeSenhas gerador = new GeradorDeSenhas();
        String senhaAleatoria = gerador.gerarSenhaAleatoria();
        System.out.println("Senha gerada: " + senhaAleatoria);
    }
}
