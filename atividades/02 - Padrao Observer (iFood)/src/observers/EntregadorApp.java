package observers;

import interfaces.Observer;
import subjects.Pedido;

public class EntregadorApp implements Observer {

    @Override // Usando o método pull de implementação de observer
    public void update(Pedido pedido) {
        System.out.printf("Entregador recebeu atualização: Pedido está %s\n", pedido.getStatus() );
    }

}
