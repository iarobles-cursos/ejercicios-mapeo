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
@Table(name = "pasaportes")
public class Pasaporte {

    @Id
    @SequenceGenerator(name = "sec_pas", sequenceName = "pasaporte_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "sec_pas", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "numero_pasaporte")
    private String numeroPasaporte;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

}
