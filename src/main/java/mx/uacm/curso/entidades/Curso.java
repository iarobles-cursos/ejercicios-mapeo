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
@Table(name = "cursos")
public class Curso {

    @Id
    @SequenceGenerator(name = "sec_curso", sequenceName = "cursos_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "sec_curso", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nombre_curso")
    private String nombreCurso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

}
