package ec.edu.com.pedidos.domain.infrastructure.persistence.repository;

import ec.edu.com.pedidos.domain.model.Envio;
import ec.edu.com.pedidos.domain.repository.EnvioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class EnvioRepositoryImpl implements EnvioRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Envio envio) {
        this.entityManager.persist(envio);
    }

    @Override
    public Envio read(Integer id) {
        return this.entityManager.find(Envio.class, id);
    }

    @Override
    public void update(Envio envio) {
        this.entityManager.merge(envio);
    }

    @Override
    public void delete(Integer id) {
        Envio e1 = this.read(id);
        this.entityManager.remove(e1);
    }

}
