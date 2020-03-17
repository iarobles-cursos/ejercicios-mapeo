/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.uacm.curso.entidades.InformacionEstudiante;
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
public class InformacionEstudianteDAOTest {

    private static EntityManager em;

    private static InformacionEstudianteDAO informacionEstudianteDAO;

    @BeforeAll
    public static void inicializar() {
        System.out.println("inicializar");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("base-pruebas-memoria");
        em = emf.createEntityManager();
        informacionEstudianteDAO = new InformacionEstudianteDAOImpl(em);
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
    }

    @Test
    @Order(1)
    public void buscarInformacionEstudiantePorIdTest() {

        System.out.println("buscar info estudiante por id");
        InformacionEstudiante info = informacionEstudianteDAO.buscarPorId(1);

        assertNotNull(info);
        assertEquals(1, info.getId());

    }

}
