package com.example.basketball.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "posiciones", schema = "basketball")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Posiciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "equipo_id", referencedColumnName = "id")
    private Equipos equipo;

    @Column(name = "juegos_jugados")
    private Integer juegosJugados;

    @Column(name = "juegos_ganados")
    private Integer juegosGanados;

    @Column(name = "juegos_perdidos")
    private Integer juegosPerdidos;

    @Column(name = "puntos")
    private Integer puntos;

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