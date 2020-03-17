/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import mx.uacm.curso.entidades.Persona;

public class PersonaDAOImpl extends GenericDAOImpl<Persona, Integer> implements PersonaDAO {

    public PersonaDAOImpl(EntityManager em) {
        super(em, Persona.class);
    }
}
