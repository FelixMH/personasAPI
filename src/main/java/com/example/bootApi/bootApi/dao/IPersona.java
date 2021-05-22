package com.example.bootApi.bootApi.dao;

import com.example.bootApi.bootApi.Entities.Persona;
import org.springframework.data.repository.CrudRepository;

/* Interface IPersona es una DAO en la cual ya no será necesario implementar los métodos, pues el CrudRepository implementa los típicos como
*   findAll() -> SELECT * FROM persona;
*   save() -> INSERT INTO VALUES (...)
*   etc, etc
*
*   @params 
*   Persona: es la clase que define la estructura de los campos de la tabla, así como definir cual tabla va a ser la que sea requerida.
*   Long: Tipo de dato que indica el ID de la tabla en la clase Persona.     
*/
public interface IPersona extends CrudRepository<Persona, Long> {
    
}
