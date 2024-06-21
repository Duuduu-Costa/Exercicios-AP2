public class SubstringExcludingLast {

    public static void main(String[] args) {
        String original = "Hello, world!";
        String substringExcludingLast = getSubstringExcludingLast(original);
        System.out.println("Original string: " + original);
        System.out.println("Substring excluding last character: " + substringExcludingLast);
    }

    public static String getSubstringExcludingLast(String str) {
        // Verifica se a string é vazia ou tem apenas um caractere
        if (str == null || str.length() <= 1) {
            return "";
        } else {
            // Retorna a substring que vai do índice 0 até o penúltimo caractere
            return str.substring(0, str.length() - 1);
        }
    }
}
