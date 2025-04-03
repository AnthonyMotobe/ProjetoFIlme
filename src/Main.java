public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Rodrigues Watch");
        System.out.println("Filme: Um Dia Daqueles");

        int anoDeLancamento = 2025;
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        boolean IncluidoNoPlano = true;
        double notaDoFilme = 6.6;
        //média calculada pela 3 notas o IMDB, Anthony e Yasmin
        double media = (9.8 + notaDoFilme + 10) / 3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = """
            Duas melhores amigas, Dreux (Keke Palmer) e Alyssa (SZA), 
            moram juntas e descobrem que o namorado de Alyssa gastou todo o dinheiro do aluguel. 
            Agora, elas precisam agir rapidamente para conseguir o dinheiro necessário e salvar a casa onde moram
            """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);



    }

}