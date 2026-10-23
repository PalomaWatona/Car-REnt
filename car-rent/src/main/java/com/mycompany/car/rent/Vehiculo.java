package com.mycompany.car.rent;

import java.time.LocalDate;

public class Vehiculo {

    // 1. definir atributos
    private String patente;
    private String modelo;
    private String marca;
    private int anioFabricacion;
    private char condicion;

    // 2. Constructor
    public Vehiculo(String patente, String modelo, String marca, int anioFabricacion) {
        setPatente(patente);
        setModelo(modelo);
        setMarca(marca);
        setAnioFabricacion(anioFabricacion);
        this.condicion = 'D';
    }

    // Metodos de la clase y setters

    public boolean asignarMantencion(){
        if (condicion != 'A'){
            this.condicion = 'M';
            mostrarMensaje("El vehiculo ha sido enviado a mantencion exitosamente");
            return true;
        } else {
            mostrarMensaje("No se puede enviar a mantención un vehículo arrendado");
            return false;
        }
    }

    public boolean validarPatente(String patente) {
        return patente != null && patente.length() == 8 && patente.equals(patente.toUpperCase());
    }

    public void setPatente(String patente){
        if (validarPatente(patente)){
            this.patente = patente;
        } else {
            mostrarMensaje("Ingrese una patente valida");
        }
    }
    public void setModelo(String modelo){
        if (modelo != null && !modelo.trim().isEmpty()){
            this.modelo = modelo;
        }
    }
    public void setMarca(String marca){
        if (marca != null && !marca.trim().isEmpty()){
            this.marca = marca;
        }
    }

    public boolean validarAnio(int anioFabricacion){
        return anioFabricacion >= 2000 && anioFabricacion <= LocalDate.now().getYear();
    }
    public void setAnioFabricacion(int anioFabricacion){
        if (validarAnio(anioFabricacion)){
            this.anioFabricacion = anioFabricacion;
        } else {
            mostrarMensaje("Ingrese un año valido");
        }
    }

    public boolean validarCondicion(char condicion){
        return condicion == 'D' || condicion == 'A' || condicion == 'M';
    }

    public void setCondicion(char condicion){
        if (validarCondicion(condicion)){
            this.condicion = condicion;
        } else {
            mostrarMensaje("Ingrese una condicion valida: D: Disponible ; A: Arrendado ; M: Mantencion");
        }
    }

    // Getters


    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public char getCondicion() {
        return condicion;
    }

    // Mostrar estado del vehiculo
    public void mostrarEstado(){
        System.out.println("____Estado del Vehículo____");
        System.out.println("Patente: " + this.patente);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Año de Fabricación: " + this.anioFabricacion);
        System.out.println("Condición: " + this.condicion);
    }

    // Metodo para mostrar mensajes de error
    public void mostrarMensaje(String mensaje){
        System.out.println("VEHICULO: " + mensaje);
    }
}
