public class RadianosParaGraus {

    public static void main(String[] args) {
        double radianos = 2.5; // valor em radianos que você quer converter

        // Convertendo radianos para graus usando o método toDegrees da classe Math
        double graus = Math.toDegrees(radianos);

        System.out.println(radianos + " radianos equivalem a " + graus + " graus.");
    }
}
