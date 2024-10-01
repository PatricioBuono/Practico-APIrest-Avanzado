package org.example.persona.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Autor extends Base{

    private String nombre;
    private String apellido;
    @Column(length = 1500)
    private String biografia;
}
