package ec.edu.com.pedidos.domain.repository;

import ec.edu.com.pedidos.domain.model.Cliente;

public interface ClienteRepository {

    public void create(Cliente cliente);

    public Cliente read(Integer id);

    public void update(Cliente cliente);

    public void delete(Integer id);
}
