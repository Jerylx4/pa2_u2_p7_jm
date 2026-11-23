package ec.edu.com;

import java.time.LocalDateTime;

import ec.edu.com.pedidos.domain.application.PedidoService;
import ec.edu.com.pedidos.domain.model.Pedido;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class App implements QuarkusApplication {

    @Inject
    private PedidoService pS;

    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Inicio de la app");

        //Create
        Pedido p1 = new Pedido();
        p1.setPrecio(100.0);
        p1.setProducto("Producto de prueba 3");
        p1.setFecha(LocalDateTime.now());
        this.pS.guardar(p1);
        
        
        //Read
        Pedido pedido = this.pS.buscarPedido(3);
        System.out.println("Pedido encontrado:" + pedido);
        
        //Update 
        pedido.setPrecio(200.00);
        this.pS.actualizar(pedido);
        
        Pedido pedido2 = this.pS.buscarPedido(3);
        System.out.println("Pedido actualizado:" + pedido2);

        //Delete
        this.pS.eliminar(3);

        return 0;
    }



}
