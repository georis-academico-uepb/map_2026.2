package missao;

import missao.template.Missao;

public class MissaoCombate extends Missao {

    // O valor vai ser sempre constante
    public MissaoCombate() {
        super(100);
    }

    @Override
    protected void acaoEspecifica() {
        System.out.println("Enfrentando inimigo!");
    }

}