package modelo;

public class Software extends Produto{
    private String categoria;

    public Software(String nome, int codigo, String descricao, float preco, float peso, String localizacao, String categoria) {
        super(nome, codigo, descricao, preco, peso, localizacao);
        if (categoria.equals("software de sistema")||categoria.equals("software de aplicação")||categoria.equals("software de programação")){
            this.categoria = categoria;
        }
    }
}
