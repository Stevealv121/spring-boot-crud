package com.web.practica01.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",nullable = false,length = 50,unique = true)
    private String nombre;

    @Column(name = "capital",nullable = false,length = 50)
    private String capital;

    @Column(name = "poblacion",nullable = false)
    private Long poblacion;

    @Column(name = "costas",nullable = false)
    private Boolean costas;

    public Estado(){

    }

    public Estado(Long id, String nombre, String capital, Long poblacion, Boolean costas) {
        this.id = id;
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Long poblacion) {
        this.poblacion = poblacion;
    }

    public Boolean getCostas() {
        return costas;
    }

    public void setCostas(Boolean costas) {
        this.costas = costas;
    }
}
