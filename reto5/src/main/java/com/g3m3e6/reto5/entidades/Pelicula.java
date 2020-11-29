/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g3m3e6.reto5.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name="pelicula")

public class Pelicula {
    @Id
    @Column(name="id_pelicula")
    Integer idPelicula;
    
    @Column(name="titulo_pelicula")
    String tituloPelicula;
    
    @Column(name="resumen_pelicula")
    String resumenPelicula;
    
    @Column(name="year_pelicula")
    Integer yearpelicula;
    
    @Column(name="nombre_director")
    String nombreDirector;

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getResumenPelicula() {
        return resumenPelicula;
    }

    public void setResumenPelicula(String resumenPelicula) {
        this.resumenPelicula = resumenPelicula;
    }

    public Integer getYearpelicula() {
        return yearpelicula;
    }

    public void setYearpelicula(Integer yearpelicula) {
        this.yearpelicula = yearpelicula;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", tituloPelicula=" + tituloPelicula + ", resumenPelicula=" + resumenPelicula + ", yearpelicula=" + yearpelicula + ", nombreDirector=" + nombreDirector + '}';
    }
    
             
    
}
