package com.example.Vuelos.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "usuario")
public class UsuarioEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  Integer id;
   private String nombre;
   private String apellido;
   private String direccion;
   private String telefono;

}
