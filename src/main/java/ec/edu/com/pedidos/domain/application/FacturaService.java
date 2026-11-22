package ec.edu.com.pedidos.domain.application;

import ec.edu.com.pedidos.domain.model.Factura;
import ec.edu.com.pedidos.domain.repository.FacturaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class FacturaService {
    @Inject
    private FacturaRepository facturaRepository;

    public void agregar(Factura factura) {
        this.facturaRepository.create(factura);
    }

    public void actualizar(Factura factura) {
        this.facturaRepository.update(factura);
    }

    public Factura buscarFactura(Integer id) {
        return this.facturaRepository.read(id);
    }

    public void borrarFactura(Integer id) {
        this.facturaRepository.delete(id);
    }
}
