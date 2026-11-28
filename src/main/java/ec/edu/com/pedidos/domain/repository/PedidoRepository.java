package ec.edu.com.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.com.pedidos.domain.model.Pedido;

public interface PedidoRepository {
    //create
    public void create(Pedido pedido);

    //read por id
    public Optional<Pedido> read(Integer id);

    public Optional<Pedido> readByNumber(String numero);

    public List<Pedido> readAll();

    public Optional<Pedido> readByNumberNative(String numero);

    public List<Pedido> readAllNative();

    //update
    public void update(Pedido pedido);

    //delete por id
    public void delete(Integer id);
}
