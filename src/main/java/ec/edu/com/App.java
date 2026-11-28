package ec.edu.com;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

        /*Pedido p1 = new Pedido();
        p1.setPrecio(100.0);
        p1.setProducto("Prueba");
        p1.setProducto("Producto de prueba 3");
        p1.setFecha(LocalDateTime.now());
        p1.setNumero("PED-001");
        this.pS.guardar(p1);*/


        /* 
        //Read
        Optional<Pedido> pedido = this.pS.buscarPedido(3);

        if (pedido.isPresent()){
            System.out.println("Pedido encontrado" + pedido.get());
        }else {
            System.out.println("Pedido no encontrado");
        }

        
        //Read by Number
        Optional<Pedido> pedido1 = this.pS.buscarPorNumero("PED-001");

        if (pedido1.isPresent()){
            System.out.println("Pedido encontrado" + pedido1.get());
        }else {
            System.out.println("Pedido no encontrado");
        }
        */

        /* 
        //Read all
        List<Pedido> pedidos = this.pS.buscarTodos();

        for(Pedido p: pedidos){
            System.out.println(pedidos);
        }
        */
        
        //Read by number native
        Optional<Pedido> pedido1 = this.pS.buscarNumeroNative("PED-001");
        if (pedido1.isPresent()){
            System.out.println("Pedido encontrado" + pedido1.get());
        }else {
            System.out.println("Pedido no encontrado");
        }
        
        //Read all native
        List<Pedido> pedidos = this.pS.buscarTodosNative();

        for(Pedido p: pedidos){
            System.out.println(pedidos);
        }

        return 0;
    }



}
