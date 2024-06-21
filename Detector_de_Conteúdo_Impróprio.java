public class DetectorConteudoImproprio {

    public static void main(String[] args) {
        // Exemplos de frases para teste
        String frase1 = "Esta é uma frase normal.";
        String frase2 = "Esta frase contém a palavra sexo.";
        String frase3 = "Aqui está a palavra sexual.";

        verificarConteudo(frase1);
        verificarConteudo(frase2);
        verificarConteudo(frase3);
    }

    public static void verificarConteudo(String frase) {
        // Transforma a frase em minúsculas para evitar problemas com maiúsculas/minúsculas
        String fraseLowerCase = frase.toLowerCase();

        // Verifica se a frase contém as palavras "sexo" ou "sexual"
        if (fraseLowerCase.contains("sexo") || fraseLowerCase.contains("sexual")) {
            System.out.println("Conteúdo impróprio");
        } else {
            System.out.println("Conteúdo liberado");
        }
    }
}
