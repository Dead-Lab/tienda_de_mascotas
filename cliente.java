package com.example;

public class cliente {
    private String nombre;
    private String direccion;
    private int numero_contacto;
    cliente(String nombre, String direccion, int numero_contacto){ //CONSTRUCTOR
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero_contacto = numero_contacto;
    } 
    public void mostrarCliente(){
        
    }
    // Getters // para obtener valores de las variables de la clase
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public int getNumeroContacto(){
        return numero_contacto;
    }
    // setters // para ingresar valor a las variables de la clase
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setNumeroContacto(int numero_contacto){
        this.numero_contacto = numero_contacto;
    }
    public String toString(){
        return "\nnombre: "+nombre+"\ndireccion: "+ direccion+"\nnumero de contacto: " + numero_contacto;
    }
    
}
