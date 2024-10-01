package org.example.persona.controllers;

import org.example.persona.entities.Persona;
import org.example.persona.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") // con esto indicamos que podemos acceder desde cualquier origen a los datos de nuestra API
@RequestMapping(path = "api/v1/personas") // atraves de esta url vamos a poder acceder a los metodos de persona
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

}
