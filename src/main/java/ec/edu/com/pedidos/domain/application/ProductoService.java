package ec.edu.com.pedidos.domain.application;

import ec.edu.com.pedidos.domain.model.Producto;
import ec.edu.com.pedidos.domain.repository.ProductoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class ProductoService {
    @Inject
    private ProductoRepository productoRepository;

    public void agregar(Producto producto) {
        this.productoRepository.create(producto);
    }

    public void actualizar(Producto producto) {
        this.productoRepository.update(producto);
    }

    public Producto buscarProducto(Integer id) {
        return this.productoRepository.read(id);
    }

    public void borrarProducto(Integer id) {
        this.productoRepository.delete(id);
    }
}
