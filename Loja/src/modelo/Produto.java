package modelo;

public class Produto {
    protected String nome;
    protected int codigo;
    protected String descricao;
    protected float preco;
    protected float peso;
    protected String localizacao;

    public Produto(String nome, int codigo, String descricao, float preco, float peso, String localizacao) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.peso = peso;
        this.localizacao = localizacao;
    }

    public Float calcularFrete(String enderecoEntrega){
        if (this.peso == 0 || this.localizacao == null || enderecoEntrega == null){
            System.out.println("Dados incompletos");
            return null;
        }
        float frete = this.peso*3.5f;

        if (!this.localizacao.equals(enderecoEntrega)){
            frete += 10;
        }
        return frete;
    }

}
