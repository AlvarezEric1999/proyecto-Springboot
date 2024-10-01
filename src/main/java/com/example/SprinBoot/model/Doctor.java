
package com.example.SprinBoot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

/**
 *
 * @author Eric Alvarez
 */

@Entity
@Data
//entidad doctor
public class Doctor {
    
    @Id
    @Column(nullable = false)
    private long idDoctor;
    
    @Column(nullable = false,length=50)

    private String nombre;
    
    @Column(nullable = false,length=50)
    private String apellido;
    
    @Column(nullable = false,length=50)
    private String correo;

    @Column(nullable = false,length=50)
    private String Especialidad;


    public String apellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String correo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String Especialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public long idDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(long idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

//



