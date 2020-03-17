/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @SequenceGenerator(name = "sec_pedidos", sequenceName = "pedidos_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "sec_pedidos", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "producto")
    private String producto;

    @Column(name = "precio")
    private Float precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

}
