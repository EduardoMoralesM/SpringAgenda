package com.agenda.contactos.repositorio;

import com.agenda.contactos.modelos.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactoRepositorio extends JpaRepository<Contacto, Integer>{
    
}
