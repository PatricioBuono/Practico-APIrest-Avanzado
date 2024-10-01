package org.example.persona.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Domicilio extends Base{
    private String calle;
    private int numero;

    @ManyToOne(optional = false) // siempre que cree una persona, el domicilio si o si tiene que tener una localidad
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

}
