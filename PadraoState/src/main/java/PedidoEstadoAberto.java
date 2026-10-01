package padroescomportamentais.state;

public class PedidoEstadoAberto extends PedidoEstado {

    private PedidoEstadoAberto() {};
    private static PedidoEstadoAberto instance = new PedidoEstadoAberto();
    public static PedidoEstadoAberto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aberto";
    }

    public boolean pagar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}