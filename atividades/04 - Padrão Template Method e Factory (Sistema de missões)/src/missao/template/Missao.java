package missao.template;

/**
 * Vai ser a minha classe principal portadora do Template Method
 */
public abstract class Missao {

    private final int VALOR_RECOMPENSA; // o valor é fixo

    protected Missao(int VALOR_RECOMPENSA) {
        this.VALOR_RECOMPENSA = VALOR_RECOMPENSA;
    }


// <---- MEU TEMPLATE METHOD ---->
    public final void executar (){
        preparar();
        verificarEquipamentos();
        acaoEspecifica();
        obterRecompensa();
        finalizar();
    }


// <---- STEPS --->

    // Step 1 (não muda)
    protected void preparar(){
        System.out.println("Preparando missão...");
    }

    // Step 2 (não muda)
    protected void verificarEquipamentos() {
        System.out.println("Verificando equipamentos...");
    }

    // Step 3 (muda)
    protected abstract void acaoEspecifica();

    // Step 4 (não muda)
    protected void obterRecompensa(){
        System.out.println("Recompensa: " + VALOR_RECOMPENSA + " pontos");
    };

    // Step 5: Finalizar (não muda)
    protected void finalizar(){
        System.out.println("Missão finalizada!\n");
    }

}
