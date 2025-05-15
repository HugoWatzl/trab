package modelo;

public class CD extends Produto{
    private Pessoa[] musicos;
    private String estiloMusical;

    public CD(String nome, int codigo, String descricao, float preco, float peso, String localizacao, Pessoa[] musicos, String estiloMusical) {
        super(nome, codigo, descricao, preco, peso, localizacao);
        this.musicos = musicos;
        if (estiloMusical.equals("samba") || estiloMusical.equals("rock") || estiloMusical.equals("clássico") || estiloMusical.equals("pop") || estiloMusical.equals("forró") || estiloMusical.equals("gospel") || estiloMusical.equals("eletrônica")){
            this.estiloMusical = estiloMusical;
        }
    }

    public Float calcularFrete(String enderecoEntrega){
        return 0f;
    }

}
