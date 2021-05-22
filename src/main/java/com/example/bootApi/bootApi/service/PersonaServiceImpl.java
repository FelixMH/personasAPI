package com.example.bootApi.bootApi.service;

import com.example.bootApi.bootApi.Entities.Persona;
import com.example.bootApi.bootApi.dao.IPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {
    
    @Autowired
    private IPersona persona;

    @Override
    @Transactional( readOnly = true )
    public List<Persona> listarPersonas() {
        return ( List< Persona > ) persona.findAll ();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        this.persona.save( persona );
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        this.persona.delete( persona );
    }

    @Override
    @Transactional( readOnly = true )
    public Persona encontrarPersona(Long id ) {
        return this.persona.findById( id ).orElse( null );
    }
    
}
