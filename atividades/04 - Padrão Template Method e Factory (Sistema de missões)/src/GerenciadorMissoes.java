import missao.factories.MissaoCombateFactory;
import missao.factories.MissaoExploracaoFactory;
import missao.factories.MissaoFactory;
import missao.factories.MissaoResgateFactory;

public class GerenciadorMissoes {

    public static void main(String[] args) {
        MissaoFactory missaoCombateFactory = new MissaoCombateFactory();
        MissaoFactory missaoExploracaoFactory = new MissaoExploracaoFactory();
        MissaoFactory missaoResgateFactory = new MissaoResgateFactory();

        // Instancio e inicio automaticamente
        missaoCombateFactory.iniciarMissao();
        missaoExploracaoFactory.iniciarMissao();
        missaoResgateFactory.iniciarMissao();
    }
}