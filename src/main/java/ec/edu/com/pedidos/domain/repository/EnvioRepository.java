package ec.edu.com.pedidos.domain.repository;

import ec.edu.com.pedidos.domain.model.Envio;

public interface EnvioRepository {

    public void create(Envio envio);

    public Envio read(Integer id);

    public void update(Envio envio);

    public void delete(Integer id);
}
