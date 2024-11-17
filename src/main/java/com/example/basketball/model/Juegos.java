package com.example.basketball.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "juegos", schema = "basketball")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Juegos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "equipo_local_id", referencedColumnName = "id")
    private Equipos equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visitante_id", referencedColumnName = "id")
    private Equipos equipoVisitante;

    @Column(name = "fecha_hora_encuentro")
    private LocalDateTime fechaHoraEncuentro;

    @Column(name = "lugar")
    private String lugar;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "usuario_creacion")
    private LocalDateTime usuarioCreacion;

    @Column(name = "usuario_actualizacion")
    private LocalDateTime usuarioActualizacion;

    @Column(name = "DATE_TIME_CREATION")
    private LocalDateTime fechaHoraCreacion;

    @Column(name = "DATE_TIME_UPDATE")
    private LocalDateTime fechaHoraActualizacion;
}