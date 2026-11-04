package missao.factories;

import missao.template.Missao;

/**
 * Minha factory genérica, resolvi construir como interface porque não vi
 * necessidade de ser uma classe abstrata (já que interfaces também podem ter métodos com corpo)
 */
public interface MissaoFactory {

    Missao criarMissao(); // Não preciso me preocupar com implementação


    default void iniciarMissao(){
        Missao missao = criarMissao();
        System.out.println("<<< Missão Criada com sucesso! Iniciando....>>>");
        missao.executar();
    }
}
