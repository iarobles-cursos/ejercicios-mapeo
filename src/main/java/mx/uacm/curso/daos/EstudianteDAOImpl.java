/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import mx.uacm.curso.entidades.Estudiante;

public class EstudianteDAOImpl extends GenericDAOImpl<Estudiante, Integer> implements EstudianteDAO{

    public EstudianteDAOImpl(EntityManager em) {
        super(em, Estudiante.class);
    }
}
