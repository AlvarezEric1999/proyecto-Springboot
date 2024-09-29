package com.example.SprinBoot.repositorio;

import com.example.SprinBoot.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


//crecion del repositorio jpa
public interface repository extends JpaRepository<Usuario,Long> {

}
