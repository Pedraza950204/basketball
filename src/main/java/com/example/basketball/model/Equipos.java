package com.example.basketball.model;

import jakarta.persistence.*;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "equipos", schema = "basketball")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Equipos {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "categoria")
    private String categoria;
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

//public String getId() {
//	return id;
//}
//public void setId(String id) {
//	this.id = id;
//}
//public String getNombre() {
//	return nombre;
//}
//public void setNombre(String nombre) {
//	this.nombre = nombre;
//}
//public String getCategoria() {
//	return categoria;
//}
//public void setCategoria(String categoria) {
//	this.categoria = categoria;
//}



}
