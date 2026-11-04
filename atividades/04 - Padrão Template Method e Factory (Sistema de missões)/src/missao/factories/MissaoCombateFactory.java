package missao.factories;

import missao.MissaoCombate;
import missao.template.Missao;

// Concrete Factory 2
public class MissaoCombateFactory implements MissaoFactory{
    @Override
    public Missao criarMissao(){return new MissaoCombate();}
}
