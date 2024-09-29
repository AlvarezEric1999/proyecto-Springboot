package com.example.SprinBoot.servicios;

import com.example.SprinBoot.model.Doctor;
import com.example.SprinBoot.repositorio.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
//creacion de servicios
@Service
public class DoctorImplementService implements DoctorServices {


    @Autowired
    private repository repositorio;



    @Override
    public Doctor newUsuario(Doctor newUsuario) {
        return repositorio.save(newUsuario);
    }

    @Override
    public Iterable<Doctor> getAll() {
        return repositorio.findAll();
    }

    @Override
    public Doctor modiUsuario(Doctor usuario) {
         Optional<Doctor> Doctorencontrado= this.repositorio.findById(usuario.idDoctor());

         if(Doctorencontrado.get()!=null){
             Doctorencontrado.get().setNombre(usuario.nombre());
             Doctorencontrado.get().setApellido(usuario.apellido());
             Doctorencontrado.get().setCorreo(usuario.correo());
             return this.newUsuario(Doctorencontrado.get());

         }
         return null;
    }



    @Override
    public boolean deleteusuario(Long iduser) {
        this.repositorio.deleteById(iduser);
        return true;
    }
}
