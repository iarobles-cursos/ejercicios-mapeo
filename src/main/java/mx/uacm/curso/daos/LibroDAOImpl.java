/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import mx.uacm.curso.entidades.Libro;

public class LibroDAOImpl extends GenericDAOImpl<Libro, Integer> implements LibroDAO{

    public LibroDAOImpl(EntityManager em) {
        super(em, Libro.class);
    }
}
