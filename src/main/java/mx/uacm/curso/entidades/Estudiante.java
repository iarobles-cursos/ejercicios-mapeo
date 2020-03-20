/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.entidades;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @SequenceGenerator(name = "sec_est", sequenceName = "estudiantes_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "sec_est", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    //mappedBy se llena con el nombre de la propieda
    //de la otra entidad que se uso para mapear
    //a esta entidad
    @OneToOne(mappedBy = "estudiante")
    private InformacionEstudiante infoEstudiante;

    @ManyToMany
    @JoinTable(
            name = "estudiantes_cursos",
            joinColumns = @JoinColumn(name = "id_estudiante"),
            inverseJoinColumns = @JoinColumn(name = "id_curso")
    )
    private List<Curso> cursos;

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public InformacionEstudiante getInfoEstudiante() {
        return infoEstudiante;
    }

    public void setInfoEstudiante(InformacionEstudiante infoEstudiante) {
        this.infoEstudiante = infoEstudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
