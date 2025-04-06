import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        String filme = Leitura.nextLine();
        System.out.println("Digite o ano do filme: ");
        int anoDeLancamento = Leitura.nextInt();
        System.out.println("Diga a nota do filme: ");
        double notaDoFilme = Leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(notaDoFilme);
    }
}
