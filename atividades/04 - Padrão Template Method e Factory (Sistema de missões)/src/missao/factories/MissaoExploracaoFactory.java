package missao.factories;

import missao.MissaoExploracao;
import missao.template.Missao;

// Concrete Factory 1
public class MissaoExploracaoFactory implements MissaoFactory {
    @Override
    public Missao criarMissao(){
        return new MissaoExploracao();
    }
}
