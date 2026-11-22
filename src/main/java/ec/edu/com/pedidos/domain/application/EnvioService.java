package ec.edu.com.pedidos.domain.application;

import ec.edu.com.pedidos.domain.model.Envio;
import ec.edu.com.pedidos.domain.repository.EnvioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class EnvioService {

    @Inject 
    private EnvioRepository envioRepository;

    public void agregar(Envio envio){
        this.envioRepository.create(envio);
    }

    public void actualizar(Envio envio){
        this.envioRepository.update(envio);
    }

    public Envio buscarCliente(Integer id){
        return this.envioRepository.read(id);
    }

    public void borrarCliente(Integer id){
        this.envioRepository.delete(id);
    }
}
