package ec.edu.com.pedidos.domain.repository;

import ec.edu.com.pedidos.domain.model.Factura;

public interface FacturaRepository {

    public void create(Factura factura);

    public Factura read(Integer id);

    public void update(Factura factura);

    public void delete(Integer id);
}
