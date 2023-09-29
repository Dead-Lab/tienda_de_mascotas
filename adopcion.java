package com.example;

public class adopcion {
    private cliente cliente;
    private mascota mascota;
    private String fecha;
    adopcion(cliente cliente, mascota mascota, String fecha){
        this.cliente = cliente;
        this.mascota = mascota;
        this.fecha = fecha;
    }
    public void historial(){
        mascota.mostrarMascota();
        cliente.mostrarCliente();
    }
}
