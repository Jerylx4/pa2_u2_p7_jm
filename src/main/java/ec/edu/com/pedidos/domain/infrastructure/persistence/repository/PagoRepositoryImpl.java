package ec.edu.com.pedidos.domain.infrastructure.persistence.repository;

import ec.edu.com.pedidos.domain.model.Pago;
import ec.edu.com.pedidos.domain.repository.PagoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class PagoRepositoryImpl implements PagoRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Pago pago) {
        this.entityManager.persist(pago);
    }

    @Override
    public Pago read(Integer id) {
        return this.entityManager.find(Pago.class, id);
    }

    @Override
    public void update(Pago pago) {
        this.entityManager.merge(pago);
    }

    @Override
    public void delete(Integer id) {
        Pago p1 = this.read(id);
        this.entityManager.remove(p1);
    }

}
