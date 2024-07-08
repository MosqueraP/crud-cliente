package com.relacionesSprinboot.oneOne;

import com.relacionesSprinboot.oneOne.Estudiante;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profesor {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    private int edad;

    @OneToMany(mappedBy = "profesor") // mappedBy, en lcase padre
    private List<Estudiante> listaEstudiante;

}

