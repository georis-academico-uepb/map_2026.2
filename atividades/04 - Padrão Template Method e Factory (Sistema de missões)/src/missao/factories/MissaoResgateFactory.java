package missao.factories;

import missao.MissaoResgate;
import missao.template.Missao;

// Concrete Factory 3
public class MissaoResgateFactory implements MissaoFactory{

    @Override
    public Missao criarMissao(){return new MissaoResgate();}
}
