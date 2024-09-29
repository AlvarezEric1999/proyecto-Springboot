package com.example.SprinBoot.servicios;

import com.example.SprinBoot.model.Usuario;
import com.example.SprinBoot.repositorio.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
//creacion de servicios
@Service
public class UsuarioImplementService implements UsuarioServices {


    @Autowired
    private repository repositorio;



    @Override
    public Usuario newUsuario(Usuario newUsuario) {
        return repositorio.save(newUsuario);
    }

    @Override
    public Iterable<Usuario> getAll() {
        return repositorio.findAll();
    }

    @Override
    public Usuario modiUsuario(Usuario usuario) {
         Optional<Usuario> usuarioencontrado= this.repositorio.findById(usuario.getIduser());

         if(usuarioencontrado.get()!=null){
             usuarioencontrado.get().setNombre(usuario.nombre());
             usuarioencontrado.get().setApellido(usuario.apellido());
             usuarioencontrado.get().setCorreo(usuario.correo());
             return this.newUsuario(usuarioencontrado.get());

         }
         return null;
    }



    @Override
    public boolean deleteusuario(Long iduser) {
        this.repositorio.deleteById(iduser);
        return true;
    }
}
