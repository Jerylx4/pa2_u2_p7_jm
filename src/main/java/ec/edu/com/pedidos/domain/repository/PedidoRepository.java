package ec.edu.com.pedidos.domain.repository;

import ec.edu.com.pedidos.domain.model.Pedido;

public interface PedidoRepository {
    //create
    public void create(Pedido pedido);

    //read por id
    public Pedido read(Integer id);

    //update
    public void update(Pedido pedido);

    //delete por id
    public void delete(Integer id);
}
