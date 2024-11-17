package com.example.basketball.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Document(collection = "usuarios")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Usuarios {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
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
