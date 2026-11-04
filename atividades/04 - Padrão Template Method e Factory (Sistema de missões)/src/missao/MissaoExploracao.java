package missao;

import missao.template.Missao;

public class MissaoExploracao extends Missao {

    public MissaoExploracao() {
        super(50);
    }

    @Override
    protected void acaoEspecifica() {
        System.out.println("Explorando região desconhecida!");
    }

}