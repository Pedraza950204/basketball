package com.example.basketball.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "resultados", schema = "basketball")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Resultados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "juego_id", referencedColumnName = "id")
    private Juegos juego;

    @Column(name = "puntos_local")
    private Integer puntosLocal;

    @Column(name = "puntos_visitante")
    private Integer puntosVisitante;

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