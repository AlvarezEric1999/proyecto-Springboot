package com.example.SprinBoot.servicios;

import com.example.SprinBoot.model.Usuario;

public interface UsuarioServices {

    Usuario newUsuario(Usuario newUsuario);
    Iterable<Usuario> getAll();

    Usuario modiUsuario (Usuario usuario);
    boolean deleteusuario (Long iduser);


}
