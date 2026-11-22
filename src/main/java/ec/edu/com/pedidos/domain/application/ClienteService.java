package ec.edu.com.pedidos.domain.application;

import ec.edu.com.pedidos.domain.model.Cliente;
import ec.edu.com.pedidos.domain.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class ClienteService {

    @Inject 
    private ClienteRepository clienteRepository;

    public void agregar(Cliente cliente){
        this.clienteRepository.create(cliente);
    }

    public void actualizar(Cliente cliente){
        this.clienteRepository.update(cliente);
    }

    public Cliente buscarCliente(Integer id){
        return this.clienteRepository.read(id);
    }

    public void borrarCliente(Integer id){
        this.clienteRepository.delete(id);
    }

}
