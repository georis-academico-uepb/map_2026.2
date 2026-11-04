package missao;

import missao.template.Missao;

public class MissaoResgate extends Missao {

    public MissaoResgate() {
        super(150);
    }

    @Override
    protected void acaoEspecifica() {
        System.out.println("Resgatando Personagem!");
    }
}