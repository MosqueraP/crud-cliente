package com.relacionesSprinboot.oneOne;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    private int edad;

    //@ManyToOne
    //@JoinColumn(name = "profesor");

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

}
