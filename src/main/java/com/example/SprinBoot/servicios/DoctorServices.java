package com.example.SprinBoot.servicios;

import com.example.SprinBoot.model.Doctor;

public interface DoctorServices {

    Doctor newUsuario(Doctor newUsuario);
    Iterable<Doctor> getAll();

    Doctor modiUsuario (Doctor usuario);
    boolean deleteusuario (Long iduser);


}
