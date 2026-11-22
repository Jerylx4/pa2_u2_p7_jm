package ec.edu.com.pedidos.domain.infrastructure.persistence.repository;

import ec.edu.com.pedidos.domain.model.Factura;
import ec.edu.com.pedidos.domain.repository.FacturaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class FacturaRepositoryImpl implements FacturaRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Factura factura) {
        this.entityManager.persist(factura);
    }

    @Override
    public Factura read(Integer id) {
        return this.entityManager.find(Factura.class, id);
    }

    @Override
    public void update(Factura factura) {
        this.entityManager.merge(factura);
    }

    @Override
    public void delete(Integer id) {
        Factura f1 = this.read(id);
        this.entityManager.remove(f1);
    }

}
