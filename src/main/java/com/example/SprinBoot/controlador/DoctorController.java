package com.example.SprinBoot.controlador;

//imports
import com.example.SprinBoot.model.Doctor;
import com.example.SprinBoot.servicios.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Doctor")
public class DoctorController {

    @Autowired
    private DoctorServices doctorService;

    //crear nuevo doctor
    @PostMapping("/nuevo")
    public Doctor newUsuario(@RequestBody Doctor nuevoDoctor){
        return this.doctorService.newUsuario(nuevoDoctor);
    }

    //mostrar doctores
    @GetMapping("/mostrar")
    public Iterable<Doctor> getAll(){
        return doctorService.getAll();
    }

    //modificar un doctor
    @PostMapping("/modificar")
    public Doctor updateUsuario(@RequestBody Doctor usuario){
        return this.doctorService.modiUsuario(usuario);
    }

    //eliminar un doctor
   @DeleteMapping("/eliminar/{id}")
    public Boolean deleteusuario (@PathVariable Long id){
        return this.doctorService.deleteusuario(id);

    }
}

