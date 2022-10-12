package com.sinfloo.crudSpringBoot.modelo;

import javax.persistence.*;

@Entity
@Table(name = "canciones") // Crea la tabla en la BD con este nombre
public class Cancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String artista;
    private String genero;

    public Cancion() {
        // Contructor vacío
    }

    public Cancion(int id, String nombre, String artista, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() { return artista; }

    public void setArtista(String artista) { this.artista = artista; }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero = genero; }
}
