import modelo.CD;
import modelo.Livro;
import modelo.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa[] musicosCd1 = new Pessoa[1];
        musicosCd1[0] = new Pessoa("Maria Rita");
        CD cd1 = new CD("Amor e música", 1, "Amor e Música é o sexto álbum de estúdio da cantora brasileira Maria Rita", 17.5f, 0.02f, "RJ", musicosCd1, "samba");

        Pessoa[] autoresL1 = new Pessoa[2];
        autoresL1[0] = new Pessoa("Ilana Casoy");
        autoresL1[1] = new Pessoa("Raphael Montes");
        Livro l1 = new Livro("Bom dia, Verônica", 2, "Bom dia, Verônica nos leva às profundezas da loucura e do vício humanos,", 54.86f, 1f, "SP", autoresL1, "romance");

        System.out.println(cd1.calcularFrete("RJ"));
        System.out.println(l1.calcularFrete("SP"));
    }
}