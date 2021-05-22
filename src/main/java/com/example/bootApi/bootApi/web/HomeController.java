package com.example.bootApi.bootApi.web;

import com.example.bootApi.bootApi.Entities.Persona;
import com.example.bootApi.bootApi.dao.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personas")
@CrossOrigin( origins = "*" )
//@Slf4j
public class HomeController {
    
    // Inyectamos la interface IPersona a el controlador.
    @Autowired
    private IPersona person;
    
    @RequestMapping( value = "/obtener", method = RequestMethod.GET )
    public Iterable<Persona> getPersonas()
    {
        return person.findAll();
    }
    
    @RequestMapping( value = "/crear", method = RequestMethod.POST )
    public Persona crearPersona ( @RequestBody Persona persona )
    {
        return person.save( persona );
    }
    
    @RequestMapping( value = "/eliminar/{id}", method = RequestMethod.DELETE )
    public boolean eliminarPersona ( @PathVariable() Long id )
    {
        person.deleteById( id );
        return true;
    }
    
    @RequestMapping( value = "/actualizar/{id}", method = RequestMethod.PUT )
    public Persona editarPersona ( @PathVariable("id") Long id, @RequestBody Persona persona ) 
    {
        var personaEditar = person.findById( id ).orElse( null );
        
        personaEditar.setNombre( persona.getNombre() );
        personaEditar.setApellido( persona.getApellido() );
        personaEditar.setEmail( persona.getEmail() );
        personaEditar.setTelefono( persona.getTelefono() );
        
        return person.save( personaEditar );
    }
}
