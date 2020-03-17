/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import mx.uacm.curso.entidades.InformacionEstudiante;

public class InformacionEstudianteDAOImpl extends GenericDAOImpl<InformacionEstudiante, Integer> implements InformacionEstudianteDAO {

    public InformacionEstudianteDAOImpl(EntityManager em) {
        super(em, InformacionEstudiante.class);
    }
}
