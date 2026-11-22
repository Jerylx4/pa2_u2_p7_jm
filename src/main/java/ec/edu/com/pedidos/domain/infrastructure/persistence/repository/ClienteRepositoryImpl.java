package ec.edu.com.pedidos.domain.infrastructure.persistence.repository;

import ec.edu.com.pedidos.domain.model.Cliente;
import ec.edu.com.pedidos.domain.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class ClienteRepositoryImpl implements  ClienteRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Cliente cliente) {
        this.entityManager.persist(cliente);
    }

    @Override
    public Cliente read(Integer id) {
        return this.entityManager.find(Cliente.class, id);
    }

    @Override
    public void update(Cliente cliente) {
        this.entityManager.merge(cliente);
    }

    @Override
    public void delete(Integer id) {
        Cliente c1 = this.read(id);
        this.entityManager.remove(c1);
    }

}
