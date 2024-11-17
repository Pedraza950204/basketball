package com.example.basketball.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles", schema = "basketball")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Roles {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private String id;
    @Column(name = "nombre_role")
    private String nombre_role;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "usuario_creacion")
    private String usuarioCreacion;
    @Column(name = "usuario_actualizacion")
    private String usuarioActulizacion;
    @Column(name = "DATE_TIME_CREATION")
    private String fechaHoraCreacion;
    @Column(name = "DATE_TIME_UPDATE")
    private String fechaHoraAcualizacion;
}
