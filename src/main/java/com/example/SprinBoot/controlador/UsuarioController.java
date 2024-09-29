package com.example.SprinBoot.controlador;

//imports
import com.example.SprinBoot.model.Usuario;
import com.example.SprinBoot.servicios.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServices usuarioService;

    @PostMapping("/nuevo")
    public Usuario newUsuario(@RequestBody Usuario nuevoUsuario){
        return this.usuarioService.newUsuario(nuevoUsuario);
    }

    @GetMapping("/mostrar")
    public Iterable<Usuario> getAll(){
        return usuarioService.getAll();
    }

    @PostMapping("/modificar")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.modiUsuario(usuario);
    }

    @PostMapping(value="/(id)")
    public Boolean deleteusuario (@PathVariable(value = "id")Long id){
        return this.usuarioService.deleteusuario(id);

    }
}

