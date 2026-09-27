package enums;

public enum StatusPedido {
    RECEBIDO("subjects.Pedido recebido com sucesso!"){
        @Override
        public String toString() {
            return "COM O CLIENTE";
        }
    },
    PREPARANDO("subjects.Pedido em preparo"){
        @Override
        public String toString() {
            return "EM PREPARO";
        }
    },
    SAIU_PARA_ENTREGA("subjects.Pedido saiu para entrega"){
        @Override
        public String toString() {
            return "EM ROTA DE ENTREGA";
        }
    },
    ENTREGUE ("subjects.Pedido entregue com sucesso!"){
        @Override
        public String toString() {
            return "ENTREGUE";
        }
    };


    // Pra ficar bonitinho
    String descricao;

    // Construtor do Enum
    StatusPedido(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
