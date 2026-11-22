package ec.edu.com.pedidos.domain.infrastructure.persistence.repository;

import ec.edu.com.pedidos.domain.model.Producto;
import ec.edu.com.pedidos.domain.repository.ProductoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class ProductoRepositoryImpl implements ProductoRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Producto producto) {
        this.entityManager.persist(producto);
    }

    @Override
    public Producto read(Integer id) {
        return this.entityManager.find(Producto.class, id);
    }

    @Override
    public void update(Producto producto) {
        this.entityManager.merge(producto);
    }

    @Override
    public void delete(Integer id) {
        Producto p1 = this.read(id);
        this.entityManager.remove(p1);
    }

}
