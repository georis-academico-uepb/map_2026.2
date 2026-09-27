package observers;

import interfaces.Observer;
import subjects.Pedido;

public class ClienteApp implements Observer {

    @Override // Usando o método pull de implementação de observer
    public void update(Pedido pedido) {
        System.out.printf("Cliente recebeu notificação: Pedido está %s\n", pedido.getStatus() );
    }

}
