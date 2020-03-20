/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import mx.uacm.curso.entidades.Autor;

public class AutorDAOImpl extends GenericDAOImpl<Autor, Integer> implements AutorDAO{

    public AutorDAOImpl(EntityManager em) {
        super(em, Autor.class);
    }
}
