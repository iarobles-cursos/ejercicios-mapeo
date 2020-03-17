/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import mx.uacm.curso.entidades.Pasaporte;

public class PasaporteDAOImpl extends GenericDAOImpl<Pasaporte, Integer> implements PasaporteDAO {

    public PasaporteDAOImpl(EntityManager em) {
        super(em, Pasaporte.class);
    }
}
