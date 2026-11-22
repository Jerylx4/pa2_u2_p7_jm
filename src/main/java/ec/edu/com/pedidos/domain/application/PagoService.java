package ec.edu.com.pedidos.domain.application;

import ec.edu.com.pedidos.domain.model.Pago;
import ec.edu.com.pedidos.domain.repository.PagoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class PagoService {
    @Inject
    private PagoRepository pagoRepository;

    public void agregar(Pago pago) {
        this.pagoRepository.create(pago);
    }

    public void actualizar(Pago pago) {
        this.pagoRepository.update(pago);
    }

    public Pago buscarPago(Integer id) {
        return this.pagoRepository.read(id);
    }

    public void borrarPago(Integer id) {
        this.pagoRepository.delete(id);
    }
}
