package modelo;

public class Livro extends Produto{
    private Pessoa[] autores;
    private String generoLiterario;

    public Livro(String nome, int codigo, String descricao, float preco, float peso, String localizacao, Pessoa[] autores, String generoLiterario) {
        super(nome, codigo, descricao, preco, peso, localizacao);
        this.autores = autores;
        if (generoLiterario.equals("romance") || generoLiterario.equals("conto") || generoLiterario.equals("poema") || generoLiterario.equals("crônica") || generoLiterario.equals("fantasia") || generoLiterario.equals("ficção científica")){
            this.generoLiterario = generoLiterario;
        }
    }
}
