package ec.edu.com.pedidos.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name = "pedidos") 
public class Pedido {

    @Id
    @SequenceGenerator(name = "pedido_seq", sequenceName = "pedido_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_seq")
    @Column(name = "pedd_id")
    private Integer id;
    
    @Column(name = "pedd_producto")
    private String producto;
    
    @Column(name = "pedd_precio")
    private Double precio;

    @Column(name = "pdd_fecha")
    private LocalDateTime fecha;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    @Override
    public String toString() {
        return "Pedido [id=" + id + ", producto=" + producto + ", precio=" + precio + ", fecha=" + fecha + "]";
    }

    
}
