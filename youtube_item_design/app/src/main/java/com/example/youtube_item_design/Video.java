package com.example.youtube_item_design;

import java.math.BigInteger;

public class Video {

    private String duracion;
    private String autor;
    private String titulo;
    private  BigInteger visualizaciones;

    public Video(String duracion, String autor, String titulo, BigInteger visualizaciones) {
        this.duracion = duracion;
        this.autor = autor;
        this.titulo = titulo;
        this.visualizaciones = visualizaciones;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public BigInteger getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(BigInteger visualizaciones) {
        this.visualizaciones = visualizaciones;
    }
}
