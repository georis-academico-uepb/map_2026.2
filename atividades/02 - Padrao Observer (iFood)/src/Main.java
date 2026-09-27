import subjects.Pedido;
import observers.*;
import enums.StatusPedido;

public class Main {

    public static void main(String[] args) {

        // Subject
        Pedido pedidoGeorisPizzaDoValente = new Pedido();

        // Observers
        ClienteApp ifood = new ClienteApp();
        RestaurantePainel pizzaDoValente = new RestaurantePainel();
        EntregadorApp entregador = new EntregadorApp();

        // Resgistrando os subscribers
        pedidoGeorisPizzaDoValente.registerObserver(ifood);
        pedidoGeorisPizzaDoValente.registerObserver(entregador);
        pedidoGeorisPizzaDoValente.registerObserver(pizzaDoValente);

        // Broadcastfix
        pedidoGeorisPizzaDoValente.setStatus(StatusPedido.PREPARANDO);
        pedidoGeorisPizzaDoValente.setStatus(StatusPedido.SAIU_PARA_ENTREGA);
        pedidoGeorisPizzaDoValente.setStatus(StatusPedido.ENTREGUE);


    }
}
