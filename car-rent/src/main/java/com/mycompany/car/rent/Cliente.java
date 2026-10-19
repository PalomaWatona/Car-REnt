/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car.rent;

/**
 *
 * @author marti
 */
public class Cliente {

    public static void main(String[] args) {
    }
    private String cedula;
    private String nombre;
    private Boolean vigencia;

    // Validaciones

    public boolean validarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
         // El largo debe ser de 10 caracteres
    public boolean validarCedula(String cedula) {
        if (cedula == null || cedula.length() != 10) {
            return false;                       
        }

         // El penúltimo debe ser el guion
        if (cedula.charAt(8) != '-') {
            return false;                       
        }
        
        // Las 8 primeras deben ser dígitos
        for (int i = 0; i < 8; i++) {           
            if (!Character.isDigit(cedula.charAt(i))) {
                return false;
            }
        }
         // El ultimo caracter de ser un numero o una k
        
        char dv = cedula.charAt(9);                   
        return Character.isDigit(dv) || dv == 'k' ;
    }

    // Getters y Setters (Hay que completarlos)
    
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setCedula(String cedula) {
        if (validarCedula(cedula)) {
            this.cedula = cedula;
        } else {
            System.out.println("Cédula inválida: " + cedula);
        }
    }

    public void setNombre(String nombre) {
        if (validarNombre(nombre)) {
            this.nombre = nombre.trim();
        } else {
            System.out.println("Nombre inválido: " + nombre);
        }
    }

    // Constuctor (todo usuario nuevo empieza vigente)

    public Cliente(String cedula, String nombre) {
        setCedula(cedula);
        setNombre(nombre);
        this.vigencia = true;
    }
}

    
    
    
}
