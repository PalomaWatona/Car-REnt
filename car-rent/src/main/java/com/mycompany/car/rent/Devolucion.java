package com.mycompany.car.rent;

import java.time.LocalDate;

public class Devolucion {
//Atributos de la clase 
  
  private Arriendo arriendo
  private Localdate fechaDevolucion }

//Constructores

public Devolucion (Arriendo arriendo, Localdate fechaDevolucion){
      this.arriendo = arriendo
      this.fechaDevolucion = fechaDevolucion}
    
//Mutadores

public void setArriendo (Arriendo arriendo){
      this.arriendo = arriendo;
public void setfechaDevolucion (Localdate fechaDevolucion) 
      this fechaDevolucion = fechaDevolucion; 
}

//Accesadores

public String getArriendo(){
       return arriendo; }
public String getfechaDevolucion(){
       return fechaDevolucion;
        }
//Recuperar estado del objeto

public String toString(){
}

//Metodos

public boolean ingresarDevolucion(Vehiculo vehiculo) {
        if (arriendo == null) {
            mostrarMensaje("La devolucion no tiene un arriendo asociado.");
            return false;
        }
        if (vehiculo == null) {
            mostrarMensaje("Debe indicar el vehiculo a devolver.");
            return false;
        }
        if (arriendo.getVehiculo() == null
                || !arriendo.getVehiculo().getPatente().equals(vehiculo.getPatente())) {
            mostrarMensaje("El vehiculo no corresponde al arriendo N° "
                    + arriendo.getNumero() + ".");
            return false;
        }
        if (!validarFecha(fechaDevolucion)) {
            return false;
        }
        vehiculo.setCondicion('D'); // 'D' = Disponible
        mostrarMensaje("Devolucion del vehiculo " + vehiculo.getPatente()
                + " registrada correctamente.");
        return true;
    }
 
    // Valida que la fecha no sea nula ni anterior a la fecha del arriendo

    public boolean validarFecha(LocalDate fecha) {
        if (fecha == null) {
            mostrarMensaje("La fecha de devolucion no puede ser nula.");
            return false;
        }
        if (arriendo != null && fecha.isBefore(arriendo.getFecha())) {
            mostrarMensaje("La fecha de devolucion no puede ser anterior "
                    + "a la fecha del arriendo.");
            return false;
        }
        return true;
    }
 
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
