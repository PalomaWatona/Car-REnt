/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.car.rent;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("12345678-9", "nicolas tolosa");

        Vehiculo vehiculo1 = new Vehiculo("FYYVZC15","2", "MAZDA",2013);

        cliente1.mostrarEstado();

        vehiculo1.mostrarEstado();


    }
}
