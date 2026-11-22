package ec.edu.com.pedidos.domain.repository;

import ec.edu.com.pedidos.domain.model.Pago;

public interface PagoRepository {
    public void create(Pago pago);

    public Pago read(Integer id);

    public void update(Pago pago);

    public void delete(Integer id);
}
