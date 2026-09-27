package observers;

import interfaces.Observer;
import subjects.Pedido;

public class RestaurantePainel implements Observer {

    @Override // Usando o método pull de implementação de observer
    public void update(Pedido pedido) {
        System.out.printf("Restaurante recebeu atualização: Pedido está %s\n", pedido.getStatus() );
    }

}
