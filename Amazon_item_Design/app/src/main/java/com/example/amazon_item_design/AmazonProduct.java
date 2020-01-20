package com.example.amazon_item_design;

import java.time.LocalDate;

public class AmazonProduct {

    private String nombre;
    private String urlProducto;
    private String subtitulo;
    private float precio;
    private boolean prime;
    private LocalDate fechaEntrega;
    private float precioEnvio;
    private float rating;

    public AmazonProduct(String nombre, String urlProducto, String subtitulo, float precio, boolean prime, LocalDate fechaEnvio, float precioEnvio, float rating) {
        this.nombre = nombre;
        this.urlProducto = urlProducto;
        this.subtitulo = subtitulo;
        this.precio = precio;
        this.prime = prime;
        this.fechaEnvio = fechaEnvio;
        this.precioEnvio = precioEnvio;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlProducto() {
        return urlProducto;
    }

    public void setUrlProducto(String urlProducto) {
        this.urlProducto = urlProducto;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isPrime() {
        return prime;
    }

    public void setPrime(boolean prime) {
        this.prime = prime;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public float getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(float precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
