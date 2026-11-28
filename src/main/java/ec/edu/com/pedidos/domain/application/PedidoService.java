package ec.edu.com.pedidos.domain.application;

import java.util.List;
import java.util.Optional;

import ec.edu.com.pedidos.domain.model.Pedido;
import ec.edu.com.pedidos.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class PedidoService {

    @Inject
    private PedidoRepository pedidoRepository;

    public void guardar(Pedido pedido){
        this.pedidoRepository.create(pedido);
    }

    public Optional<Pedido> buscarPedido(Integer id){
        return this.pedidoRepository.read(id);
    }

    public void actualizar(Pedido pedido){
        this.pedidoRepository.update(pedido);
    }

    public void eliminar(Integer id){
        this.pedidoRepository.delete(id);
    }

    public Optional<Pedido> buscarPorNumero(String numero){
        return this.pedidoRepository.readByNumber(numero);
    }

    public List<Pedido> buscarTodos(){
        return this.pedidoRepository.readAll();
    }

    public Optional<Pedido> buscarNumeroNative(String numero){
        return this.pedidoRepository.readByNumberNative(numero);
    }

    public List<Pedido> buscarTodosNative(){
       return this.pedidoRepository.readAllNative();
    }
}
