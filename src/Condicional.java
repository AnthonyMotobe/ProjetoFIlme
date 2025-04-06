public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2025;
        boolean IncluidoNoPlano = false;
        double notaDoFilme = 6.6;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2025) {
            System.out.println("Laçamento!!!");
        } else {
            System.out.println("Filme Retro que amam!");
        }
        // (||) para alguma das duas ou (&&) para só liberar se tiver as duas
        if (IncluidoNoPlano == true || tipoPlano.equals("Plus"))  {
            System.out.println("Está incluido no plano");
        } else {
            System.out.println("Precisa ter o plano Plus, ou pagar locação");
        }
    }
}
