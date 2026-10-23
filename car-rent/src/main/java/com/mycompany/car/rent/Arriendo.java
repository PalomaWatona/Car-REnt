package com.mycompany.car.rent;

import java.time.LocalDate;

public class Arriendo {


    private int numero;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDate fecha;
    private int dias;
    private int precioDiario;

    // Constructor

    public Arriendo(int numero, Vehiculo vehiculo, Cliente cliente, LocalDate fecha, int dias, int precioDiario){
        this.numero = numero;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fecha = fecha;
        setDias(dias);
        this.precioDiario = precioDiario;
    }

    // Metodos de la clase y setters

    public void setNumero(int numero) {
    this.numero = numero;
    }



}