package com.mycompany.car.rent;

public class Devolucion {
}
//Atributos de la clase 
private Arriendo arriendo
private Localdate fechaDevolucion 
//Constructores
public Devolucion (Arriendo arriendo, Localdate fechaDevolucion){
  this.arriendo = arriendo
  this.fechaDevolucion = fechaDevolucion
//Mutadores
public void setArriendo (Arriendo arriendo){
  this.arriendo = arriendo; }
public void setfechaDevolucion (Localdate fechaDevolucion){
  this fechaDevolucion = fechaDevolucion; }
//Accesadores
    public String getArriendo(){
     return arriendo; }
    public String getfechaDevolucion(){
      return fechaDevolucion;
        }
//Recuperar estado del objeto
@Override
  public String toString()
    return "Arriendo {"+ "arriendo="+getArriendo()+",fechaDevolucion ="+getfechaDevolucion()}   
  
//Metodos
//no entoendo bien los metodos, seguire revisando el apunte, si alquien puede revisar el codigo de arriba tbn por favor, no se si esta todo bien 
