
package com.example.SprinBoot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author Eric Alvarez
 */

@Entity
@Data

public class Usuario {
    
    @Id
    @Column
    private long iduser;
    
    @Column
    private String nombre;
    
    @Column
    private String apellido;
    
    @Column
    private String correo;


    public Long getIduser() {
        return iduser;
    }

    public String correo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String apellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long iduser() {
        return iduser;
    }

    public void setIduser(long iduser) {
        this.iduser = iduser;
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//


}
