package com.mycompany.car.rent;

public class Cliente {

    // 1. definir atributos
    private String cedula;
    private String nombre;
    private Boolean vigente;

    // 2. Constuctor (todo usuario nuevo empieza vigente)

    public Cliente(String cedula, String nombre) {
        setCedula(cedula);
        setNombre(nombre);
        this.vigente = true;
    }

    // Metodos de la clase y setters
    public boolean validarCedula(String cedula){
        return cedula != null && cedula.length() == 10 && cedula.charAt(8) == '-';
    }

    public void setCedula(String cedula){
        if (validarCedula(cedula)) {
            this.cedula = cedula;
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            mostrarMensaje("Error el nombre no puede estar vacío");
        }
    }

    // Getters


    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public Boolean isVigente() {
        return vigente;
    }

    // Mostrar estado del cliente
    public void mostrarEstado(){
        System.out.println("____Estado del cliente____");
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Vigencia: " + this.vigente);
    }

    // Metodo para mostrar mensajes de error al cliente
    public void mostrarMensaje(String mensaje){
        System.out.println("CLIENTE: " + mensaje);
    }


    // Metodo para deshabilitar un cliente
    public void deshabilitar(){
        this.vigente = false;
        mostrarMensaje("El cliente ha sido deshabilitado");
    }
}
