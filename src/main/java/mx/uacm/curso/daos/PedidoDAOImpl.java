/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import mx.uacm.curso.entidades.Pedido;

public class PedidoDAOImpl extends GenericDAOImpl<Pedido, Integer> implements PedidoDAO {

    public PedidoDAOImpl(EntityManager em) {
        super(em, Pedido.class);
    }
}
