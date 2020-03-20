/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.uacm.curso.entidades.Curso;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
//usamos un static import para importar todos
//los metodos estaticos de la clase Assertions
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CursoDAOTest {

    private static EntityManager em;

    private static CursoDAO cursoDAO;

    @BeforeAll
    public static void inicializar() {
        System.out.println("inicializar");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("base-pruebas-memoria");
        em = emf.createEntityManager();
        cursoDAO = new CursoDAOImpl(em);
    }

    @BeforeEach
    public void antesDeCadaTest() {
        System.out.println("antes del test");
        em.getTransaction().begin(); //iniciamos transaccion
    }

    @AfterEach
    public void despuesDeCadaTest() {
        System.out.println("despues del test");
        em.getTransaction().rollback();
    }

    @AfterAll
    public static void terminar() {
        System.out.println("terminar");
        em.close();
    }

    @Test
    @Order(1)
    public void buscarCursoPorIdTest() {

        System.out.println("buscar curso por id");
        Curso c = cursoDAO.buscarPorId(1);

        assertNotNull(c);
        assertEquals(1, c.getId());
        
        //verificamos que el mapeo de curso a estudiantes funciona
        assertNotNull(c.getEstudiantes());
        assertEquals(2,c.getEstudiantes().size());
        
    }

}
