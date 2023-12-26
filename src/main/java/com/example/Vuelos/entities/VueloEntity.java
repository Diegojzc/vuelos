package com.example.Vuelos.entities;

import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VueloEntity {


    private Long id;
    private String nombre;
    private Integer capacidad;
    private String origen;
    private String destino;



}
