package com.example.bootApi.bootApi.Entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.Data;
import org.springframework.lang.NonNull;



@Data
@Entity
@Table( name = "persona" )
public class Persona implements Serializable {
    
//    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long idPersona;
    @NonNull
    private String nombre;
    @NonNull
    private String apellido;
    
    @Email(message = "El email no es válido, verifíquelo y vuelva a intentar." )
    @NotEmpty( message = "El email no puede estar vacío o con espacios en blanco." )
    private String email;
    
    private String telefono;
    
    public Persona () 
    {
        
    }
    
//    public Long getIdPersona() {
//    	return idPersona;
//    }
}
